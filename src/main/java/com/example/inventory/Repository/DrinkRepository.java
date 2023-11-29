package com.example.inventory.Repository;

import com.example.inventory.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink,Long> {
    //@Query("")
    //List<Drink> findDrinkByPriceGreaterThan(int price);
}
