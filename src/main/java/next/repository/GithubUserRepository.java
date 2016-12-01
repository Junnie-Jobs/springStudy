package next.repository;

import org.springframework.data.repository.CrudRepository;

import next.domain.GithubUser;

public interface GithubUserRepository extends CrudRepository<GithubUser, Long>{
	GithubUser findByAccessToken(String accessToken);
	GithubUser findByUserId(String userId);
}
