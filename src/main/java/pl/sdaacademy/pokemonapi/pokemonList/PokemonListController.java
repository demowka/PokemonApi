package pl.sdaacademy.pokemonapi.pokemonList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/pokemon/list")
@RestController
public class PokemonListController {

    private final PokemonListService pokemonListService;

    PokemonListController(PokemonListService pokemonListService) {
        this.pokemonListService = pokemonListService;
    }

    @GetMapping
    List<PokemonListItemEntity> getPokemonItemList() {
        return pokemonListService.getPokemonItemList();
    }
}
