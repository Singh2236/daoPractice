package com.navi.dao;

import com.navi.interfaces.Dao;
import com.navi.pojo.Animal;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AnimalDao implements Dao<Animal> {
    List<Animal> animals;


    @Override
    public List<Animal> getAll(){
        return animals;
    }

    @Override
    public void save(Animal animal) {
        animals.add(animal);

    }

    @Override
    public void update(Animal animal, String[] params) {
        animal.setName(Objects.requireNonNull(params[0],"Name cant be null"));
        animal.setBreed(Objects.requireNonNull(params[1],"Breed can't be null"));

        animals.add(animal);

    }

    @Override
    public void delete(Animal animal) {
        animals.remove(animal);
    }


}
