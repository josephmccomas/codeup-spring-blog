package com.codeup.codeupspringblog.repositories;

import com.codeup.codeupspringblog.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogRepository extends JpaRepository<Dog, Long> {

    Dog findByName(String name);
}
