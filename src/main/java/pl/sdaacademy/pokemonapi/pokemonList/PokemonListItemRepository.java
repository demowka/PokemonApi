package pl.sdaacademy.pokemonapi.pokemonList;

import org.springframework.data.jpa.repository.JpaRepository;
public interface PokemonListItemRepository extends JpaRepository<PokemonListItemEntity, Long>{
}
