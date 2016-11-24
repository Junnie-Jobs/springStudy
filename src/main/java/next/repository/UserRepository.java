package next.repository;

import org.springframework.data.repository.CrudRepository;

import next.domain.Board;
import next.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
