package mx.com.digitalchallengers.yml;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("url")
@EnableConfigurationProperties
@Data
public class Url {
    private List<String> hosts;
}
