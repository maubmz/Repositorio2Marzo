package mx.com.digitalchallengers.yml.Entidades;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("demo")
@Data
public class Demo {
    private String environment;
    private List<String> hosts = new ArrayList<>();
    public static List<String> listEnvironment;


}
