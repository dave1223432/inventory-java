package com.example.inventory.Controller.api;

import com.example.inventory.Drink;
import com.example.inventory.Repository.DrinkRepository;
import com.example.inventory.Services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DrinkAPIController {

    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;

    @RequestMapping("/drinks")
    @GetMapping("/drinks")


    public ResponseEntity<List<Drink>> getAllDrink(){
        return ResponseEntity.ok().body(drinkService.getAllDrinks());
    }

}






