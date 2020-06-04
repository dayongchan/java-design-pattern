package com.dayong.demo.pattern.behavior.mediator;

/**
 * 4S店
 * @author Dayong Chan
 */
public class FourServiceShop extends Dealer {
    public FourServiceShop(Car electricCar, Car gasolineCar) {
        super(electricCar, gasolineCar);
    }

    @Override
    public void sellCar(String carType) {
        switch (carType){
            case "Electric":
                electricCar.onSell();
                break;
            case "Gasoline":
                gasolineCar.onSell();
                break;
            default:
                System.out.println("No this car!!!");
                break;
        }
    }
}
