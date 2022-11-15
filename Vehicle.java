/*
 This is a parent class
 @author (Siddhant)
 @version (1)
 */

public class Vehicle {
    private String vehicleName;
    private String vehicleColor;
    private String vehicleSpeed;
    private String vehicleWeight;
    private int vehicleId;

    //constructor of parent class
    public Vehicle(int vehicleId, String vehicleName, String vehicleWeight, String vehicleColor) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleColor = vehicleColor;
        this.vehicleWeight = vehicleWeight;
    }

    //getter or accessor of Vehicle Id
    public int getVehicleId() {
        return vehicleId;
    }

    //getter or accessor of Vehicle Name
    public String getVehicleName() {
        return vehicleName;
    }

    //getter or accessor of Vehicle Color
    public String getVehicleColor() {
        return vehicleColor;
    }

    //getter or accessor of Vehicle Weight
    public String getVehicleWeight() {
        return vehicleWeight;
    }

    //getter or accessor of Vehicle Speed
    public String getVehicleSpeed() {
        return vehicleSpeed;
    }

    //setter or mutator of Vehicle Speed
    public void setVehicleSpeed(String vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }
    public void setVehicleColor(String vehicleColor){
        this.vehicleColor = vehicleColor;
    }

    //simple display method to display the details of vehicle class
    public void display() {
        System.out.println("The 'vehicle id' is " + vehicleId);
        System.out.println("The 'vehicle name' is " + vehicleName);
        System.out.println("The 'vehicle color' is " + vehicleColor);
        System.out.println("The 'vehicle speed' is " + vehicleSpeed);
       
        if (vehicleWeight == "") {
            System.out.println("The vehicle weight is left empty ");
        } else {
            System.out.println("The vehicle Weight is " + vehicleWeight);
        }


    }
}
