package com.codeup.codeupspringblog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public class RollDiceController {

    @GetMapping("/roll-dice/n")
    public Integer diceGuess(@RequestParam Integer n, Model model) {
        model.addAttribute("n", n);
        return n;
    }

    @PostMapping("/roll-dice")
    @ResponseBody
    public Integer diceResult(@RequestParam Integer rando, Model model){
        model.addAttribute(Math.random() * 6);
        return rando;
    }

}