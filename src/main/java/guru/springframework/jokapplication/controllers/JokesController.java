package guru.springframework.jokapplication.controllers;

import org.springframework.ui.Model;

public class JokesController {


    public String getTheJoke(Model model){
        return "index";
    }
}
