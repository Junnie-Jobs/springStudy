package next.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Data;

@Entity
@Data
public class Deck extends AbstractPersistable<Long>{

	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_board_id"))
	private Board board;
	
	@OneToMany(mappedBy = "deck")
	private List<Card> cards;
}
