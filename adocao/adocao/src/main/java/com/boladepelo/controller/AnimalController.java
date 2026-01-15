package com.boladepelo.controller;


import org.springframework.web.bind.annotation.*;

import com.boladepelo.model.Animal;
import com.boladepelo.repository.AnimalRepository;

import java.util.List;



@RestController
@RequestMapping("/animais")
@CrossOrigin(origins = "*")
public class AnimalController {

	
    private final AnimalRepository repository;


    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }


    @GetMapping
    public List<Animal> listar() {
        return repository.findAll();
    }


    @PostMapping
    public Animal cadastrar(@RequestBody Animal animal) {
        return repository.save(animal);
    }


}