package com.shiv.RestaurantProject.controller;

import com.shiv.RestaurantProject.Service.RestaurantService;
import com.shiv.RestaurantProject.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/get-restaurant-by-id/{id}")
    public Restaurant findById(@PathVariable int id) {
        return restaurantService.findById(id);
    }
    @GetMapping("/get-all-restaurant")
    public List<Restaurant> getAll(){
        return  restaurantService.getAllRestaurant();
    }

    @PostMapping("/add-restaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant) {
        restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("update-restaurant/{id}")
    public void updateRestaurant(@RequestBody Restaurant newRestaurant ,@PathVariable int id){
         restaurantService.updateRestaurant(newRestaurant,id);
    }

    @DeleteMapping("delete-restaurant/{id}")
    public void deleteRestaurant(@PathVariable int id){
        restaurantService.deleteRestaurant(id);
    }

}
