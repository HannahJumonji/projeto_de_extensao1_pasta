package com.boladepelo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.boladepelo.model.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Long> {
}