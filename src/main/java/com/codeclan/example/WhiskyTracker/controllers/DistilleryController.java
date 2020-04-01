package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

//    @GetMapping
//    public ResponseEntity findDistilleries(){
//        return new ResponseEntity(distilleryRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping(value="/{id}")
        public ResponseEntity<Optional<Distillery>> findDistillery(@PathVariable Long id){
        return new ResponseEntity<>(distilleryRepository.findById(id), HttpStatus.OK);
    }

    //Get all the distilleries for a particular region
//    @GetMapping(value="region/{region}")
    @GetMapping
    public ResponseEntity<Optional<Distillery>> findDistilleriesByRegion (@RequestParam(name="region", required = false) String region){
        if(region != null) {
            return new ResponseEntity(distilleryRepository.findDistilleriesByRegion(region), HttpStatus.OK);
        }
        return new ResponseEntity(distilleryRepository.findAll(), HttpStatus.OK);

    }



}
