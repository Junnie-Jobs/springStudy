package next.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Board extends AbstractPersistable<Long>{
	
	private String name;
	
	@JsonIgnore	
	@OneToMany(mappedBy = "board")
	private List<Deck> decks;
	
	public Board(){}

}
