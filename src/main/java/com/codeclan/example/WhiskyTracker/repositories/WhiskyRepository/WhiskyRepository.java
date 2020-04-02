package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WhiskyRepository extends JpaRepository<Whisky, Long> {
    //WHAT? List<whisky>
    //GOT? year

    //*** operation<object>By<property><operator> ***
    //Operation:
    // * find OR read OR get
    //* count
    //
    //object: class you're getting back
    // property: property the object has:

    List<Whisky> findWhiskyByYear(int year);

    //What I want List<Whisky>
    //Got: Distillery name, Age

    List<Whisky> findByDistilleryNameAndAge(String distilleryName, int age);
    List<Whisky> findByAge(Integer age);

    //todo
    //get all the whisky from a region
    //WANT: Whisky
    //HAVE: Region
    List<Whisky>findByDistilleryRegion(String region);



}
