package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistilleryRepository extends JpaRepository<Distillery, Long> {
    //WHAT? List<Distilleries>
    //GOT? Region

    //*** operation<object>By<property><operator> ***
    //Operation:
    // * find OR read OR get
    //* count
    //
    //object: class you're getting back
    // property: property the object has:

    List<Distillery> findDistilleriesByRegion(String region);

    //todo get all distil that have whiskies that are 12 years old
    //Want: List<Distillery>
    //Have age(of whisky)
    List<Distillery> findByWhiskiesAge(int age);


}
