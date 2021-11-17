package guru.springframework.jokapplication.controllers;

import guru.springframework.jokapplication.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    public JokesController(JokesService jokesService){
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getTheJoke(Model model){

        model.addAttribute("joke",this.jokesService.getRandomQuotes());

        return "index";
    }
}
