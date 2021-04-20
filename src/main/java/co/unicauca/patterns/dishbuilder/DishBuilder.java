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
public abstract class DishBuilder {

    protected Dish dish;

    public abstract void setCore();

    public abstract void addParts();

    public abstract void setSize();

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

}
