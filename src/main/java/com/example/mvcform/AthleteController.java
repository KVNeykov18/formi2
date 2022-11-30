package com.example.mvcform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/player")
public class AthleteController {

}
@RequestMapping("/showPlayerForm")
public String showFOrm(Model model) {
    model.addAttribute("athelete", new Athlete());
        return "add-player-form";
}
