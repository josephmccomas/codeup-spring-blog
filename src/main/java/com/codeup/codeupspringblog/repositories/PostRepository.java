package com.codeup.codeupspringblog.repositories;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface PostRepository extends JpaRepository {
    private final JpaRepository peopleDao;

    public postController(JpaRepository peopleDao) {
        this.peopleDao = peopleDao;
    }

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("People", peopleDao.findAll());
        return "home";
    }
    @GetMapping("/create")
    @ResponseBody
    public String createPerson() {
        People person = new Person();
        person.setName("Ralph");

        peopleDao.save(person);
        return "dog created";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
