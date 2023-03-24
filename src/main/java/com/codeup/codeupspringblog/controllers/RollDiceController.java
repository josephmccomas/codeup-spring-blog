package com.codeup.codeupspringblog.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class RollDiceController {

    @GetMapping("/roll-dice/n")
    public Integer diceGuess(@PathVariable Integer n, Model model) {
        model.addAttribute("n", n);
        return n;
    }

    @PostMapping("/roll-dice")
    @ResponseBody
    public Integer diceResult(@PathVariable Integer rando, Model model){
        model.addAttribute(Math.random() * 6);
        return rando;
    }

}