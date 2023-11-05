package org.example;

/**
 * Blueprint class for a Store
 */
public class Store {

    private GarmentFactory factory;

    /**
     * Constructor for Store that takes in a factory
     * @param factory existing factory
     */
    public Store(GarmentFactory factory) {
        this.factory = factory;
    }

    /**
     * Method to get an outfit from this store
     */
    public void getOutfit() {
        Tops top = factory.newTop();
        Pants pant = factory.newPant();
        Shoes shoe = factory.newShoe();
        System.out.println("Store's assistant gets you and outfit and says: " + top.show() + ", " + pant.show() + ", " + shoe.show());
    }
}
