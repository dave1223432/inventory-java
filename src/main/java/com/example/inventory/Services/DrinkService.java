package com.example.inventory.Services;

import com.example.inventory.Drink;

import java.util.List;

public interface DrinkService {
    Drink saveDrink(Drink drink);

    Drink getDrinkById(long id);

    List<Drink> getAllDrinks();

    List<Drink> getAllDrink();

    Drink updateDrink(Drink drink);

    void deleteDrink(long id);

}
