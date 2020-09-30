package com.company;

public class Garden < T extends Number, S extends Number > implements Plantable <T>{

    S quantityOfGardenBeds;

    public Garden( S quantityOfGardenBeds) {
        this.quantityOfGardenBeds = quantityOfGardenBeds;
    }

    public S getQuantityOfGardenBeds() {
        return quantityOfGardenBeds;
    }

    public void setQuantityOfGardenBeds(S quantityOfGardenBeds) {
        this.quantityOfGardenBeds = quantityOfGardenBeds;
    }

    @Override
    public T waterTheFlower(T quantityOfLiters) {
        return quantityOfLiters ;
    }
}
