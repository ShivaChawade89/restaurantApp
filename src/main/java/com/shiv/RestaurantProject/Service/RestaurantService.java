package com.shiv.RestaurantProject.Service;

import com.shiv.RestaurantProject.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {
     private static ArrayList<Restaurant> restaurants=new ArrayList<>();

    static {
        restaurants.add(new Restaurant(1,"sagarGaire","bhopal","7089643415","unlimited plate","20"));

    }




    public Restaurant findById(int id) {
        Predicate<? super Restaurant> predicate = restaurant -> restaurant.getRestaurant_id() == id;
        Restaurant restaurant = restaurants.stream().filter(predicate).findFirst().get();
        return restaurant;
    }

    public List<Restaurant> getAllRestaurant() {
        return restaurants;
    }


    public String addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
        return "saved";
    }

    public void updateRestaurant(Restaurant newRestaurant,int id) {
        Restaurant restaurant = findById(id);

        restaurant.setRestaurant_id(newRestaurant.getRestaurant_id());
        restaurant.setRestaurant_name(newRestaurant.getRestaurant_name());
        restaurant.setAddress(newRestaurant.getAddress());
        restaurant.setNumber(newRestaurant.getNumber());
        restaurant.setSpecialty(newRestaurant.getSpecialty());
        restaurant.setTotal_staffs(newRestaurant.getTotal_staffs());

    }

    public void deleteRestaurant(int id) {
        Predicate<? super Restaurant> predicate = restaurant -> restaurant.getRestaurant_id() == id;
        restaurants.removeIf(predicate);
    }
}
