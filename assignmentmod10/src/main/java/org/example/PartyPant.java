package org.example;

/**
 * Blueprint class for a party pant
 */
public class PartyPant implements Pants{

    /**
     * Method to show this is a party pant
     * @return returs a String to show party pant
     */
    @Override
    public String show() {
        return "This is a Party Pant";
    }
}
