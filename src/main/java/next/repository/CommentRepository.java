package next.repository;

import org.springframework.data.repository.CrudRepository;

import next.domain.Board;
import next.domain.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
