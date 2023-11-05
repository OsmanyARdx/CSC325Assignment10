package org.example;

/**
 * Blueprint class for a factory that makes party clothes
 */
public class PartyGarmentFactory implements GarmentFactory {

    /**
     * Method that creates a new party top
     * @return returns the genereated party top
     */
    @Override
    public Tops newTop() {
        return new PartyTop();
    }

    /**
     * Method that creates a new party pant
     * @return returns the generated party pant
     */
    @Override
    public Pants newPant() {
        return new PartyPant();
    }

    /**
     * Method that creates a new party shoe
     * @return returns the generated party shoe
     */
    @Override
    public Shoes newShoe() {
        return new PartyShoe();
    }
}
