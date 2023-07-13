package mx.com.digitalchallengers.yml.controlador;

import mx.com.digitalchallengers.entidades.PlayerTitles;
import mx.com.digitalchallengers.yml.Entidades.Demo;
import mx.com.digitalchallengers.yml.Entidades.Entidad;

import mx.com.digitalchallengers.yml.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping(value = "/yaml")
@RestController
@Controller
@Service
public class YmlControlador {
    @Autowired
    private Demo demo;

    @Autowired
    private Url url;

    @GetMapping(value = "/getDemo")
    public String getDemo (){
        return demo.getEnvironment();
    }

    @GetMapping(value = "/urlExterno/{id}")
    public Entidad findPage(@PathVariable Integer id) {
        List<String> listaUrl = url.getHosts();
        String url = listaUrl.get(id-1);//El -1 es por los indices del List (n-1)
        RestTemplate restTemplate = new RestTemplate();
        Entidad json = restTemplate.getForObject(url, Entidad.class);
        return json;
    }

    @GetMapping(value = "/urlExternos/{id}/{playertitleUuid}")
    public PlayerTitles findPages(@PathVariable Integer id,@PathVariable String playertitleUuid) {
        List<String> listaUrl = url.getHosts();
        String url = listaUrl.get(id-1);//El -1 es por los indices del List (n-1)
        String urlCompleto = url.concat(playertitleUuid);
        RestTemplate restTemplate = new RestTemplate();
        PlayerTitles json = restTemplate.getForObject(urlCompleto, PlayerTitles.class);
        return json;
    }

    @GetMapping(value = "/urlExternoObject/{id}")
    public Object findPageObject(@PathVariable Integer id) {
        List<String> listaUrl = url.getHosts();
        String url = listaUrl.get(id-1);//El -1 es por los indices del List (n-1)
        RestTemplate restTemplate = new RestTemplate();
        Object json = restTemplate.getForObject(url, Object.class);
        return json;
    }


}
