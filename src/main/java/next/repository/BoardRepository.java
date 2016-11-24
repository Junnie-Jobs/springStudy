package next.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import next.domain.Board;

//@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface BoardRepository extends JpaRepository<Board, Long>{

}
