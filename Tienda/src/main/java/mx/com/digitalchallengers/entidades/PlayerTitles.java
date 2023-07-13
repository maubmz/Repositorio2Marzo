package mx.com.digitalchallengers.entidades;

import lombok.Data;
import mx.com.digitalchallengers.yml.Entidades.listData.DataList;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
public class PlayerTitles {
    private int status;

    private DataList data;

}
