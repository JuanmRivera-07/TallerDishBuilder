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
public class OrientalDishBuilder extends DishBuilder {

    @Override
    public void setCore() {
        this.setDish(new OrientalDish("Arroz oriental", "Arroz con estilo oriental, añadiendo ingredientes con sabores orientales como la soja, las verduras y las gambas", "", 56000, EnumSize.ALL, "East rice"));
    }

    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("Ramen", "Ramen con tofu", "", 8000, EnumSize.ALL));
        this.getDish().addPart(new Dish("Té", "Té oriental sabor sakura", "", 5000, EnumSize.HALF));
    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }

}
