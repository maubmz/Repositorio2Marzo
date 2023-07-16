package mx.com.digitalchallengers.yml.PokemonApi.EntidadesRegionSection;

import lombok.Data;
import mx.com.digitalchallengers.yml.PokemonApi.EntidadesColorSection.PokemonLanguage;
import mx.com.digitalchallengers.yml.PokemonApi.EntidadesColorSection.PokemonResults;

import java.util.List;

@Data
public class PokemonRegion {
    private Integer id;
    private String name;
    private PokemonResults main_generation;
    private List<PokemonResults> locations;
    private List<PokemonLanguage> names;
    private List<PokemonResults> pokedexes;
    private List<PokemonResults> version_groups;
}
