package org.example;

/**
 * Blueprint class for a casual pant
 */
public class CasualPant implements Pants{

    /**
     * Method to show that this is a casual pant
     * @return returns the type of pant as a String
     */
    @Override
    public String show() {
        return "This is a Casual Pant";
    }
}
