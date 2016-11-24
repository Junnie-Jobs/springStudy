package next.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Data;

@Entity
@Data
public class Card extends AbstractPersistable<Long>{

	@Column(length = 200)
	private String title;

	@Column(length = 5000)
	private String description;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name = "fk_deck_id"))
	private Deck deck;
	
	Card() {
	}

	public Card(String title, String description) {
		this.title = title;
		this.description = description;
	}
}
