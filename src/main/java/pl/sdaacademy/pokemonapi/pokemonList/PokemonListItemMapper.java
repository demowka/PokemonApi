package pl.sdaacademy.pokemonapi.pokemonList;

import org.springframework.stereotype.Component;

@Component
public class PokemonListItemMapper {

    PokemonListItemEntity toEntity(PokeApiListItemResult pokeApiListItemResult) {
        String url = pokeApiListItemResult.getUrl();
        String[] urlData = url.split("/");
        Long id = Long.parseLong(urlData[urlData.length-1]);
        return new PokemonListItemEntity(
                id,
                pokeApiListItemResult.getName()
        );
    }
}

