public class ElectroMotiveDiesel extends Trains{
    private String dieselOrElectric;

    public void setDieselOrElectric(String doe){
        dieselOrElectric = doe;
    }
    public String getDieselOrElectric(){
        return dieselOrElectric;
    }

    public void carryCargo(){
        System.out.println("The Electro-Motive Diesel train is carrying away cargo.");
    }
    public void smoke(){
        System.out.println("The smoke and fog, it covers the land.");
    }
    public void noise(){
        System.out.println("choo choo but with an extra choo choo");
    }
}