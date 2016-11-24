package next.repository;

import org.springframework.data.repository.CrudRepository;

import next.domain.Board;
import next.domain.Card;

public interface CardRepository extends CrudRepository<Card, Long>{

}
