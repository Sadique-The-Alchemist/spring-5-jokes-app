package org.awaiting.jokes.controller;

import org.awaiting.jokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeService jokeService;
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        model.addAttribute("test","Testing the tag");
        return "chucknoris";

    }
}
