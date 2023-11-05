package org.example;

/**
 * Blueprint class for a professional shoe
 */
public class ProfessionalShoe implements Shoes{

    /**
     * Method to show this is a professional shoe
     * @return returns a String that shows this is a professional shoe
     */
    @Override
    public String show() {
        return "This is a Professional Shoe";
    }
}
