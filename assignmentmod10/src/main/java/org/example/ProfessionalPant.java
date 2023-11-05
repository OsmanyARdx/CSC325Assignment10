package org.example;

/**
 * Blueprint class for a professional pant
 */
public class ProfessionalPant implements Pants {

    /**
     * Method to show this is a professional pant
     * @return returns a String that shows this is a professional pant
     */
    @Override
    public String show() {
        return "This is a Professional Pant";
    }
}
