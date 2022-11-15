/*
 This is a child class which inherits the parent class Vehicle
 @author (Siddhant)
 @version (1)
 */
public class ElectricScooter extends Vehicle {
    private int range, batteryCapacity, price;
    private String chargingTime, mileage;
    private String brand;
    private boolean hasPurchased;
    private boolean hasSold;
    

    //constructor of child class 'ElectricScooter'
    public ElectricScooter(int vehicleId, String vehicleName, String vehicleColor, String vehicleWeight, String vehicleSpeed, int batteryCapacity) {
        //calling constructor ' vehicle ' of parent class
        super(vehicleId, vehicleName, vehicleWeight, vehicleColor);
        setElectricScooterSpeed(vehicleSpeed);
        setElectricScooterColor(vehicleColor);
        this.batteryCapacity = batteryCapacity;
        
        this.range = 0;
        this.price = 0;
        this.brand = "";
        this.mileage = "";
        this.hasPurchased = false;
        this.hasSold = false;
    }

    //creating method which contains setVehicleSpeed of parent class 'vehicle'
    public void setElectricScooterSpeed(String speed) {
        super.setVehicleSpeed(speed);
    }
    //creating method which contains setVehicleColor of parent class 'vehicle'
    public void setElectricScooterColor(String color) {
        super.setVehicleColor(color);
    }

    //getter of field batteryCapacity'
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    //getter of field 'range'
    public int getRange() {
        return range;
    }

    //getter of field 'price'
    public int getPrice() {
        return price;
    }

    //getter of field 'chargingTime'
    public String getChargingTime() {
        return chargingTime;
    }

    //getter of field 'brand'
    public String getBrand() {
        return brand;
    }

    //getter of field 'mileage'
    public String getMileage() {
        return mileage;
    }

    //getter of field 'hasPurchased'
    public boolean getHasPurchased() {
        return hasPurchased;
    }

    //getter of field 'hasSold'
    public boolean getHasSold() {
        return hasSold;
    }

    //setter of field 'brand'
    public void setBrand(String brand) {
        if (!hasPurchased) {
            this.brand = brand;
        } else {
            System.out.println("The scooter is already purchased, so it is not possible to change the brand ");
        }
    }

    //method for purchasing Electric Scooter
    public void purchase(String brand, int price, String chargingTime, String mileage, int range) {
        
        if (hasPurchased == false) {
         setBrand(brand);
         this.price = price;
         this.chargingTime = chargingTime;
         this.mileage = mileage;
         this.range = range;    
         hasPurchased = true;
        }
    }

    //method for selling Electric Scooter
    public void sell(int price) {
        if (hasSold == false) {
            this.price = price;
            range = 0;
            chargingTime = "";
            mileage = "";     
            batteryCapacity = 0;
            hasSold = true;
            hasPurchased = false;
        } else if (hasSold == true) {
            System.out.println("The Scooter having id " + getVehicleId() + " is already sold ");
        }
    }

    //simple method for displaying the details of Electric Scooter
    public void display() {
        //calling display method of parent class 'Vehicle'
        super.display();
        if (hasPurchased == true) {
            System.out.println(" The brand of the electric scooter is " + brand);
            System.out.println(" The battery capacity of the electric scooter is " + batteryCapacity);
            System.out.println(" The mileage of the electri scooter is " + mileage);
            System.out.println(" The range of the electric scooter is " + range);
            System.out.println(" The recharge tiem of the electri scooter is " + chargingTime);
        }
    }
}