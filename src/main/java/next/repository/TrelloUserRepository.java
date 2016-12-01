package next.repository;

import org.springframework.data.repository.CrudRepository;

import next.domain.TrelloUser;

public interface TrelloUserRepository extends CrudRepository<TrelloUser, Long>{
	TrelloUser findByUserId(String userId);
}
