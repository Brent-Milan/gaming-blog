package production;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String developer;
	private String genre;
	
	private String profile;
	
	//JPA (?) needs an empty constructor
	protected Game() {
		
	}
	
	public Game(String title, String developer){
		this.title = title;
		this.developer = developer;
	}
}

	public Long getId(){
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getProfile() {
		return profile;
	}
