package next.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrelloController {
	

	@RequestMapping("/")
    public String home() {
        return "index";
    }
	
	@RequestMapping("/logintest")
    public String logintest() {
        return "loginTest";
    }
	
	@RequestMapping("/login")
    public String login() {
        return "login";
    }
	
	@RequestMapping("/signUp")
    public String signUp() {
        return "signUp";
    }
	
	@RequestMapping("/boards")
    public String boards() {
        return "boards";
    }
	
	@RequestMapping("/board")
    public String board() {
        return "board";
    }

}
