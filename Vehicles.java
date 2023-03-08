public class Vehicles { 
    private String color;

    public void setColor(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }

    public void drive(){
        System.out.println("The vehicle is now being driven forward.");
    }

    public void intakeFuel(){
        System.out.println("The vehicle now has fuel.");
    }
}
