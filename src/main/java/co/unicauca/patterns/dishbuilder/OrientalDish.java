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
public class OrientalDish extends Dish {

    private String orientalName;

    public OrientalDish(String name, String description, String image, int price, EnumSize size, String orientalName) {
        super(name, description, image, price, size);
        this.orientalName = orientalName;
    }

    public String getOrientalName() {
        return orientalName;
    }

    public void setOrientalName(String orientalName) {
        this.orientalName = orientalName;
    }

}
