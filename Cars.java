import java.util.Random;

public class Cars extends Vehicles{
    private boolean luxary;

    public void commitSpeedViolation(){
        System.out.println("The car is driving super duper fast now. Like super quick. Quicker than Sonic. It's breaking the law though so das ist nicht gut.");
    }

    public String race(){
        int win = (int)Math.floor(Math.random() * (8) + 1);;
        return("The car came in this place out of 8: " + String.valueOf(win));
    }
    public void noise(){
        System.out.println("vroom vroom");
    }
}
