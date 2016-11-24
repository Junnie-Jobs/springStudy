package next.repository;

import org.springframework.data.repository.CrudRepository;

import next.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}
