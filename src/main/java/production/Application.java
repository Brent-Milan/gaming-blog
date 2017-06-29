package production;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	private static final Logger Log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
		
		public CommandLineRunner demo(GameRepository repository) {
			return (args) -> {
				repository.save(new Game("Final Fantasy XIV", "MMO"));
				
				Log.info("Games found with findAll():");
				Log.info("---------------------------");
				for (Game game: repository.findAll()) {
					Log.info(game.toString());
				}
				Log.info("");
				
				Game game = repository.findOne(1L);
				Log.info("Game found with findOne(1L):");
				Log.info("--------------------------------");
				Log.info(game.toString());
				Log.info("");
				
				Log.info("Game found with findByGenre('MMO'):");
				Log.info("-----------------------------------");
				for (Game mmo : repository.findByGenre("MMO")) {
					Log.info(mmo.toString());
				}
				Log.info("");
				
			}
		
		}
		
		
		
		
		
		
	}
}
