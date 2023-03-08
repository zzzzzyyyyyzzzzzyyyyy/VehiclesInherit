public class Amtrak extends Trains{
    private boolean containBlue;

    public void setContainBlue(boolean cB){
        containBlue = cB;
    }
    public boolean getContainBlue(){
        return containBlue;
    }

    public void driveUnderGround(){
        System.out.println("The Amtrak train is driving underground! Wow! Darkness!");
    }
    public void longDistanceTrip(){
        System.out.println("The Amtrak is making a long distance trip.");
    }
}