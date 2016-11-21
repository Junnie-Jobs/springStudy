package next;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	
	@RequestMapping("/")
    public String home() {
        return "index";
    }
	
	@RequestMapping("/login")
    public String login() {
        return "login";
    }
	
	@RequestMapping("/signUp")
    public String signUp() {
        return "signUp";
    }
	
	
	@RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
