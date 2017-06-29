package production;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {
	
	@Resource
	GameRepository repository;

    @RequestMapping("/gaming")
    public String fetchGames(Model model) {
        model.addAttribute("gamesAsCollection", repository.findAll());
        return "gaming";
    }

}

