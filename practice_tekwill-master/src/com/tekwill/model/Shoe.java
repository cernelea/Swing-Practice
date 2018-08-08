//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//
package com.tekwill.model;

import java.util.Objects;

/**
 *
 * @author sscerbatiuc
 */
public class Shoe extends Product {

    private double size;
    private String type;

    /**
     *
     * @return
     */
    public Shoe(int id, String name, double size) {
        super(id, name);
        this.size = size;

    }

    /**
     *
     * @param id
     * @param name
     * @param size
     * @param type
     */
    public Shoe(Integer id, String name, double size, String type) {
        super(id, name);
        this.size = size;
        this.type = type;

    }

    public double getSize() {
        return this.size;

    }

    /**
     *
     * @param size
     */
    public void setSize(double size) {
        this.size = size;

    }

    /**
     *
     * @return
     */
    public String getType() {
        return this.type;

    }

    /**
     *
     * @param type
     */
    public void setType(String type) {

        this.type = type;
    }

    @Override
    public String toString() {

        return this.id + " " + this.name + " " + this.size + " " + this.type + " ";
    }

    @Override
    public boolean equals(Object obj) {
        Shoe shoe = (Shoe) obj;

        return (this.id == shoe.id && this.name.equals(shoe.name) && this.size == shoe.getSize() && this.type.equals(shoe.getType()));

    }

}
