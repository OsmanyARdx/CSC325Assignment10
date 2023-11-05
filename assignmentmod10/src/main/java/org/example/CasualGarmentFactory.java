package org.example;

/**
 * BluePrint class for a Factory that makes casual clothes
 */
public class CasualGarmentFactory implements GarmentFactory {

    /**
     * Method that creates a new casual top
     * @return returns the generated casual top
     */
    @Override
    public Tops newTop() {
        return new CasualTop();
    }

    /**
     * Method that creates a new casual pant
     * @return returns the generated casual pant
     */
    @Override
    public Pants newPant() {
        return new CasualPant();
    }

    /**
     * Method that creates a new casual shoe
     * @return returns the generated casual shoe
     */
    @Override
    public Shoes newShoe() {
        return new CasualShoe();
    }
}
