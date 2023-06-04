package CarDealership;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

public class Car {
    String car_number;
    int model_year;
    String brand;
    double mileage;
    double price;


    public Car(String car_number, int model_year, String brand, int mileage, int price) {
        try {
            if (price > 0) {
                this.price = price;
            }//Price must be 0+
            else {
                throw new InputMismatchException("Price cant be non positive");
            }
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        try {
            if (model_year >= 2017 || model_year < 2024) {
                this.model_year = model_year;
            }//Model car must be 2016+ or  2024-
            else {
                if (model_year < 2017 ) {
                    throw new InputMismatchException("Model year cant be lower than 2017");
                }
                if (model_year > 2024 ) {
                    throw new InputMismatchException("Model year cant be higher than 2023");
                }
            }
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        try {
            if (car_number.length() == 6) {
                this.car_number = car_number;
            }//Car number must be length equal to 6
            else {
                throw new InputMismatchException("Car number must be equal to 6 length!");

            }
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            return ;
        }
        try {
            if (mileage >= 0) {
                this.mileage = mileage;
            }//Mileage must be 0+
            else {
                throw new InputMismatchException("Car mileage cant be negative");
            }
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        this.brand = brand;
    }
    @Override
    public String toString(){
        return "Car number:"+car_number+" "+"Model year:"+model_year+" "+"Brand:"+brand+" "+"Mileage:"+mileage+" "+"Price:"+price;
    }

    public Car() {

    }

    public void valueDevaluation(double percent) {
        double oldPrice=getPrice();
        oldPrice*=percent;
        try {
            if (oldPrice <= 5000 && oldPrice <= getPrice()) {
                setPrice(getPrice() - oldPrice);
            } else {
                if (oldPrice > 5000) {
                    throw new InputMismatchException("Price is too high for devaluation!");
                }
                if (oldPrice < 5000) {
                    throw new InputMismatchException("DeValue percent cant be negative!");
                }
                
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
    public FileWriter SoldCars(Car car){
        try{
            FileWriter soldDoc = new FileWriter("Sold.txt",true);
            return (FileWriter) soldDoc.append("Car number:"+car_number+" "+"Model year:"+model_year+" "+"Brand:"+brand+" "+"Mileage:"+mileage+" "+"Price:"+price);
        }catch (IOException e){
            System.out.println("Failed writing "+e.getMessage());
        }
        return null;
    }

    public static boolean isDataValidC(Car car) {
        Car temp = new Car();
        temp = car;
        return (temp.car_number !=null && temp.model_year > 0 && temp.brand!=null && temp.mileage >= 0 && temp.price >= 0);
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getCar_number() {
        return car_number;
    }

    public double getPrice() {
        return price;
    }
}


