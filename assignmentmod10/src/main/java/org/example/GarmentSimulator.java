package org.example;

/**
 * A class that holds the main program
 */
public class GarmentSimulator {
    /**
     * Runnable program
     * @param args
     */
    public static void main(String[] args) {
        GarmentFactory professionalGarmentFactory = new ProfessionalGarmentFactory();
        GarmentFactory casualGarmentFactory = new CasualGarmentFactory();
        GarmentFactory partyGarmentFactory = new PartyGarmentFactory();


        //Make a store that sells the clothes from professionalGarmentFactory
        Store profesionalClothesStore = new Store(professionalGarmentFactory);
        profesionalClothesStore.getOutfit();

        //Make a store that sells the clothes from casualGarmentFactory
        Store casualClothesStore = new Store(casualGarmentFactory);
        casualClothesStore.getOutfit();

        //Make a store that sells the clothes from partyGarmentFactory
        Store partyClothesStore = new Store(partyGarmentFactory);
        partyClothesStore.getOutfit();
    }
}