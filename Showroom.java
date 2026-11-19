public class Showroom {
    private String model;
    private double fuelAmount;
    private double fuelEfficiency;
    
    public Showroom(String showroomModel,double showroomfuelAmount ,double showroomfuelEfficiency)
    {
        this.model =  showroomModel;
        this.fuelAmount = showroomfuelAmount;
        this.fuelEfficiency = showroomfuelEfficiency;

    }

    public void drive(double distance)
    {
        double fuelConsumed= distance/this.fuelEfficiency;
        this.fuelAmount-=fuelConsumed;
        System.out.println(this.model+ "drove" + distance + "km.Remaining fuel: " +this.fuelAmount + "liters.");
    }

    public double calculateRange()
    {
        return this.fuelAmount * this.fuelEfficiency;


    }

    public static void main(String[] args)
    {
        Showroom myCar = new Showroom ("Sedan",40.0,15.0);
        System.out.println("Intial Range: " + myCar.calculateRange() + "km");

        myCar.drive(150);
        System.out.println("Update Range: " +myCar.calculateRange() + "km");
    }
    
}
