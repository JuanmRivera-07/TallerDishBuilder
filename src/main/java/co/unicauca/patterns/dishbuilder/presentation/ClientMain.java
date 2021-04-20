/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.dishbuilder.presentation;

import co.unicauca.patterns.dishbuilder.Dish;
import co.unicauca.patterns.dishbuilder.DishBuilder;
import co.unicauca.patterns.dishbuilder.DishDirector;
import co.unicauca.patterns.dishbuilder.ItalianDishBuilder;
import co.unicauca.patterns.dishbuilder.OrientalDishBuilder;

/**
 *
 * @author Rivera
 */
public class ClientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DishDirector director = new DishDirector();
        DishBuilder orientalBuilder = new OrientalDishBuilder();
        director.setDishBuilder(orientalBuilder);
        director.buildDish();
        Dish dish = director.getDish();
        System.out.println("Oriental dish:" + dish);
        System.out.println("Sus partes: " + dish.getParts().toString());
        System.out.println("Precio de las partes: " + dish.calculatePriceParts());

        DishBuilder italianBuilder = new ItalianDishBuilder();
        director.setDishBuilder(italianBuilder);
        director.buildDish();
        dish = director.getDish();
        System.out.println("Italian dish:" + dish);
        System.out.println("Sus partes: " + dish.getParts().toString());
        System.out.println("Precio de las partes: " + dish.calculatePriceParts());
    }
    
}
