package org.example;


/**
 * Blueprint class for a casual shoe
 */
public class CasualShoe implements Shoes{

    /**
     * Method to show this is a casual shoe
     * @return returns a String that shows this is a casual shoe
     */
    @Override
    public String show() {
        return "This is a Casual Shoe";
    }
}
