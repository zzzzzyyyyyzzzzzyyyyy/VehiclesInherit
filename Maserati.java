public class Maserati extends Cars{
    private String ambientLighting;

    public void create(){
        System.out.println("A new Maserati has been created! What a rare occurence.");
    }

    public int gForce(){
        return((int)Math.floor(Math.random() * 340)); //Newtons
    }
}
