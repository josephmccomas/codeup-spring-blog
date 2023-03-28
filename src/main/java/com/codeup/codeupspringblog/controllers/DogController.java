package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.models.Dog;
import com.codeup.codeupspringblog.repositories.DogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping(path = "/dogs")
public class DogController {
    private final DogRepository dogDao;

//    public DogController(DogRepository dogDao){
//        this.dogDao = dogDao;
//    }
    @GetMapping
    public String all(Model model, DogRepository dogDao){
//        List<Dog> dogs = new ArrayList<>();
        List<Dog> dogs = dogDao.findAll();
//        dogs.add(new Dog(1, "Spot"));
//        dogs.add(new Dog(2, "Barky"));

        model.addAttribute("dogs", dogs);

        return "dogs";
    }

    @GetMapping(path = "/{dogId}")
    @ResponseBody
    public String viewDog(@PathVariable long dogId){
        Dog dog = dogDao.findById(dogId).get();

        return "Page for dog w/ID" + dogId;
    }


    @GetMapping(path = "/create")
    @ResponseBody
    public String createDog(){
        Dog dog = new Dog(1, "name");
        dog.setName("Scratchy");

        dogDao.save(dog);
        return "Dog created";
    }
}
