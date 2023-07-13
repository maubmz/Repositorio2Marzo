package mx.com.digitalchallengers.yml.PokemonApi.EntidadesColorSection;


import lombok.Data;

import java.util.List;

@Data
public class PokemonColor {
    private Integer count;
    private String next;
    private String previous;
    private List<PokemonResults> results;
}
