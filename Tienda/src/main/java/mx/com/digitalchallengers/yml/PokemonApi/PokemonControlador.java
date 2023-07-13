package mx.com.digitalchallengers.yml.PokemonApi;


import mx.com.digitalchallengers.yml.PokemonApi.EntidadesColorSection.PokemonColor;
import mx.com.digitalchallengers.yml.PokemonApi.EntidadesColorSection.PokemonColorResults;
import mx.com.digitalchallengers.yml.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping(value = "/pokemon")
@Controller
@RestController
@Service
public class PokemonControlador {
    @Autowired
    private Url url;

    @GetMapping(value = "/ColorResult/{link}/{section}/{color}")
    public PokemonColorResults findPagePokemonColorResult(
            @PathVariable Integer link,
            @PathVariable String section,
            @PathVariable String color) {
        String urlPokemon = url.getHosts().get(link-1);
        urlPokemon = urlPokemon.concat(section).concat("/").concat(color);
        RestTemplate restTemplate = new RestTemplate();
        PokemonColorResults pokemon = restTemplate.getForObject(urlPokemon, PokemonColorResults.class);
        return pokemon;
    }



//    Metodos Color donde solo se envia el link y section del pokemonApi

    @GetMapping(value = "/Color/{link}/{section}")
    public PokemonColor findPagePokemonColor(@PathVariable Integer link,@PathVariable String section){
        String urlPokemon = url.getHosts().get(link-1);
        urlPokemon = urlPokemon.concat(section);
        RestTemplate restTemplate = new RestTemplate();
        PokemonColor pokemon = restTemplate.getForObject(urlPokemon, PokemonColor.class);
        return pokemon;
    }

    @GetMapping(value = "/ColorResult/{link}")
    public PokemonColorResults findPagePokemonColorResult(
            @PathVariable Integer link) {
        String urlPokemon = url.getHosts().get(link-1);
        RestTemplate restTemplate = new RestTemplate();
        PokemonColorResults pokemon = restTemplate.getForObject(urlPokemon, PokemonColorResults.class);
        return pokemon;
    }

}
