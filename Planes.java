public class Planes extends Vehicles{
    private boolean commercial;

    public void setCommercial(boolean c){
        commercial = c;
    }
    public boolean getCommercial(){
        return commercial;
    }

    private void fly(){
        System.out.println("The plane it flies! Off into the sky!");
    }
    private void autoPilot(){
        System.out.println("The plane has now gone into autopilot, it now has a mind of its own. ");
    }
}
