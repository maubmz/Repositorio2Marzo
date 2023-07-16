package mx.com.digitalchallengers.yml.PokemonApi.EntidadesFormsSection;


import lombok.Data;
import mx.com.digitalchallengers.yml.PokemonApi.EntidadesColorSection.PokemonLanguage;
import mx.com.digitalchallengers.yml.PokemonApi.EntidadesColorSection.PokemonResults;

import java.util.List;

@Data
public class PokemonForms {
    private Integer id;
    private String name;
    private Integer order;
    private Integer form_order;
    private boolean is_default;
    private boolean is_battle_only;
    private boolean is_mega;
    private String form_name;
    private PokemonResults pokemon;//Se ocupo otra clase a la de la documentacion por que tiene las mismas variables
    private PokemonSprites sprites;
    private List<PokemonTypes> types;
    private PokemonResults version_group;
    private List<PokemonLanguage> form_names;
    private List<PokemonLanguage> names;
}
