package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "dogs")

public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 1024, nullable = false, unique = true)
    private String name;

    public Dog(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
