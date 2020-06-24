package com.brianLovelessCode.demoPals.controllers;

import com.brianLovelessCode.demoPals.models.Pals;
import com.brianLovelessCode.demoPals.repositories.PalsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pals")
public class PalsController {
    @Autowired
    private PalsRepository palsRepository;

    @GetMapping
    public List<Pals> list(){
        //show all
        return palsRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Pals pal){
        // make post
        palsRepository.save(pal);
    }

    @GetMapping("/{id}")
    public Pals get(@PathVariable("id") long id){
        // show one by id
        return palsRepository.getOne(id);
    }

    // add delete function
}