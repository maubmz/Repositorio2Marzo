package mx.com.digitalchallengers.yml.PokemonApi.EntidadesColorSection;

import lombok.Data;
import java.util.List;

@Data
public class PokemonColorResults {
    private Integer id;
    private String name;
    private List<PokemonLanguage> names;
    private List<PokemonSpecies> pokemon_species;
}
