package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;


//    @GetMapping
//    public ResponseEntity findWhiskies(){
//        return new ResponseEntity(whiskyRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Optional<Whisky>> findWhisky(@PathVariable Long id){
            return new ResponseEntity<>(whiskyRepository.findById(id), HttpStatus.OK);
 }

    @GetMapping
    public ResponseEntity<Optional<Whisky>> findWhiskyByYear(@RequestParam(name="year", required = false) Integer year){
        if (year != null) {
            return new ResponseEntity(whiskyRepository.findWhiskyByYear(year), HttpStatus.OK);

        }
        return new ResponseEntity(whiskyRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping(value="/distillery/age/{distillery_age}")
//    public ResponseEntity<Optional<Whisky>> findWhiskyByDistilleryAndAge(
//            @RequestParam(required=false,name="distillery") Distillery distillery,
//            @RequestParam(required=false, name="age")Integer age
//    )
//    public void findDistilleriesWithWhiskiesAtAge(@PathVariable String distiller_age){
    public void findDistilleriesWithWhiskiesAtAge( String distiller_age){

        String[] tokens = distiller_age.split("_");

        System.out.println(tokens);


//        return whiskyRepository
//    {
//        distillery.setName("Glendronach");
//        age = 15;
//        if(distillery != null && age != null){
//            return new ResponseEntity(whiskyRepository.findByDistilleryAndAgeEquals(distillery.getName()z, age), HttpStatus.OK);
//        }
    }

    /*
        @GetMapping(value = "/pirates/named/{name}")
    public List<Ship> findShipsThatHavePiratesName(@PathVariable String name){
        return shipRepository.findByPiratesFirstName(name);
    }
     */
//    @GetMapping(value = "/pirates")
//    public ResponseEntity findByAgeGreaterThanEqualAndLessThanEqual(
//            @RequestParam(required = false, name="ageGreater") Integer ageGreater,
//            @RequestParam(required = false, name="ageLess") Integer ageLess
//    ){
//        if(ageGreater != null && ageLess != null){
//            return new ResponseEntity(pirateRepository.findByAgeGreaterThanEqualAndAgeLessThanEqual(ageGreater, ageLess), HttpStatus.OK);
//        }
//        return new ResponseEntity(pirateRepository.findAll(), HttpStatus.OK);
//    }
}
