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
public class ItalianDish extends Dish {

    private String italianName;

    public ItalianDish(String name, String description, String image, int price, EnumSize size, String italianName) {
        super(name, description, image, price, size);
        this.italianName = italianName;
    }

    public String getItalianName() {
        return italianName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

}
