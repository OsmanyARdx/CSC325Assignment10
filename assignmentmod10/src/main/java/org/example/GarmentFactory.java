package org.example;

/**
 * Interface for a factory of clothes
 */
public interface GarmentFactory {

    /**
     * Method that creates a new Top
     * @return returns a Top
     */
    public Tops newTop();

    /**
     * Method that creates a new Pant
     * @return returns a Pant
     */
    public Pants newPant();

    /**
     * Method that creates a new Shoe
     * @return returns a Shoe
     */
    public Shoes newShoe();
}
