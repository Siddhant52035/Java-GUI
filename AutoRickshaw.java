/*
 This is a child class which inherits the parent class Vehicle
 @author (Siddhant)
 @version (1)
 */
public class AutoRickshaw extends Vehicle {
    private int engineDisplacement, numberOfSeats, fuelTankCapacity, chargeAmount;
    private String torque, groundClearance, bookedDate;
    private boolean isBooked;

    //calling constructor ' vehicle ' of parent class
    public AutoRickshaw(int vehicleId, String vehicleName, String vehicleColor, String vehicleWeight, String vehicleSpeed, int engineDisplacement, String torque, int fuelTankCapacity, String groundClearance) /** constructor of child class 'AutoRickshaw' */
    {
        super(vehicleId, vehicleName, vehicleWeight, vehicleColor);
        //calling method 'setAutoRickshawSpeed'
        setAutoRickshawSpeed(vehicleSpeed);
        setAutoRickshawColor(vehicleColor);
        this.engineDisplacement = engineDisplacement;
        this.torque = torque;
        this.fuelTankCapacity = fuelTankCapacity;
        this.groundClearance = groundClearance;
        this.isBooked = false;
    }

    //creating method which contains setVehicleSpeed of parent class
    public void setAutoRickshawSpeed(String speed) {
        super.setVehicleSpeed(speed);
    }
    //creating method which contains setVehicleColor of parent class
    public void setAutoRickshawColor(String color) {
        super.setVehicleColor(color);
    }

    //getter of field 'engineDisplacement'
    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    //getter of filed 'isBooked'
    public boolean getIsBooked() {
        return isBooked;
    }

    //getter of field 'torque'
    public String getTorque() {
        return torque;
    }

    //getter of field 'fueltankCapacity'
    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    //getter of field 'groundClearance'
    public String getGroundClearance() {
        return groundClearance;
    }

    //getter of field 'bookeddate'
    public String getBookedDate() {
        return bookedDate;
    }

    //getter of field 'chargeAmount'
    public int getChargeAmount() {
        return chargeAmount;
    }

    //setter of chargeAmount
    public void setChargeAmount(int chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    //getter of field 'numberOfSeats'
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    //setter of numberOfSeats
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    //method for booking an auto rickshaw
    public void bookAutoRickshaw(String bookedDate, int chargeAmount, int numberOfSeats) {
        if (!isBooked) {
            this.bookedDate = bookedDate;
            setChargeAmount(chargeAmount);
            setNumberOfSeats(numberOfSeats);
            this.isBooked = true;
            System.out.println("The auto rickhaw having id " + getVehicleId() + " is booked ");
        } else {
            System.out.println("The status of isBooked is "+ isBooked);
            System.out.println("The auto rickshaw having id " + getVehicleId() + " is already booked ");
        }
    }

    //simple method to display the details of auto rickshaw
    public void display() {
        //calling display method of parent class 'Vehicle'
        super.display();
        if (isBooked) {
            System.out.println(" The 'engine displacement' of the rickshaw is " + engineDisplacement);
            System.out.println(" The 'torque' possessed by the rickshaw is " + torque);
            System.out.println(" The 'fuel tank capacity' of the rickshaw is " + fuelTankCapacity);
            System.out.println(" The 'ground clearance' of the rickshaw is " + groundClearance);
            System.out.println(" The 'booked date' of the rickshaw is " + bookedDate);
            //checking if charge amount is left empty or went negative
            if (chargeAmount == 0) {
                System.out.println("Please check out whether the value of field 'charge amount' is left empty or has negative value. ");
            } else {
                System.out.println(" The 'charge amount' of the rickshaw is " + chargeAmount);
            }
            //checking if the number of seat is left empty or went negative
            if (numberOfSeats == 0) {
                System.out.println("Please check out whether the value of filed 'number of seats' is left empty or has negative value. ");
            } else {
                System.out.println(" The 'number of seat is " + numberOfSeats);
            }
        }
    }
}