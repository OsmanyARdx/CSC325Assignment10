package org.example;

/**
 * Blueprint class for a party shoe
 */
public class PartyShoe implements Shoes{

    /**
     * Method to show this is a party shoe
     * @return returns a string that shows this is a party shoe
     */
    @Override
    public String show() {
        return "This is a Party Shoe";
    }
}
