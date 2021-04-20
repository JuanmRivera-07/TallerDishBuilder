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
public class ItalianDishBuilder extends DishBuilder {

    @Override
    public void setCore() {
        this.setDish(new ItalianDish("Arroz italiano", " Arroz a la italiana, añadiendo ingredientes como las verduras y la Mozzarella", "", 52000, EnumSize.ALL, "Riso"));
    }

    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("Arroz", " Risotto con mozzarella", "", 7000, EnumSize.ALL));
        this.getDish().addPart(new Dish("Vino", "Vino del viñedo Cassano", "", 12000, EnumSize.HALF));
    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }

}
