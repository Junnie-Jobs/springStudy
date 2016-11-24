package next.repository;

import org.springframework.data.repository.CrudRepository;

import next.domain.Board;
import next.domain.Deck;

public interface DeckRepository extends CrudRepository<Deck, Long>{

}
