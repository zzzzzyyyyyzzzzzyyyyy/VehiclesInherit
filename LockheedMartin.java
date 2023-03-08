public class LockheedMartin extends Planes{
    private boolean military;

    public void setMilitary(boolean m){
        military = m;
    }
    public boolean getMilitary(){
        return military;
    }

    public void trick(){
        System.out.println("The Lockheed Martin plane does a cool flip in the air!");
    }
    public void speed(){
        System.out.println("The Lockheed Martin plane speeds through the sky! Flying high! Muy thai! Pie! Tie! Lie! Bye!");
    }
}
