package org.example;

/**
 * Blueprint class for a Factory that makes professional clothes
 */
public class ProfessionalGarmentFactory implements GarmentFactory{

    /**
     * Method that creates a new professional top
     * @return returns the generated professional top
     */
    @Override
    public Tops newTop() {
        return new ProfessionalTop();
    }

    /**
     * Method that creates a new professional pant
     * @return returns the generated professional pant
     */
    @Override
    public Pants newPant() {
        return new ProfessionalPant();
    }

    /**
     * Method that creates a new professional shoe
     * @return returns the genereated professional shoe
     */
    @Override
    public Shoes newShoe() {
        return new ProfessionalShoe();
    }
}
