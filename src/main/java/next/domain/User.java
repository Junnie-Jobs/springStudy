package next.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="USER_TYPE")
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	
	private String userId;

	private String userEmail;
	
	public User() {
	}

	public User(String userId, String email) {
		this.userId = userId;
		this.userEmail = email;
	}
	
}
