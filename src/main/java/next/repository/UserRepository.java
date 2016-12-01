package next.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import next.domain.Board;
import next.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(String username);

}
