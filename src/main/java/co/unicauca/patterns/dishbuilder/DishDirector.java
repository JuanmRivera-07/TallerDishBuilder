/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.dishbuilder;

/**
 *
 * @author juanc
 */
public class DishDirector {

    private DishBuilder dishBuilder;

    public void setDishBuilder(DishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;
    }

    public Dish getDish() {
        return dishBuilder.getDish();
    }

    public void buildDish() {
        dishBuilder.setCore();
        dishBuilder.addParts();
    }

}
