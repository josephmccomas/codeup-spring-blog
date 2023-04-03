package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.repositories.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping(path = "/posts")
public class PostController {
        private final PostRepository peopleDao;

    @GetMapping
    public String all(Model model) {

        List<people> people = peopleDao.findAll();
            people.add(new person(1, "Bob"));
        model.addAttribute("people", people);
        List<person> somePeople = peopleDao.findLikeName("a");
        System.out.println(somePeople);
        return "people";
    }
}
