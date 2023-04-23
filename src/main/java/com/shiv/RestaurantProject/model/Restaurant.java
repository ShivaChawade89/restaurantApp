package com.shiv.RestaurantProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private int restaurant_id;
    private String restaurant_name;
    private String  address;
    private String number;
    private String specialty;
    private String total_staffs;
}
