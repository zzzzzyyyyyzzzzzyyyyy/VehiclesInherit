public class Lincoln extends Cars{
    private String[] placesOfCreation;
    private String name;
    private boolean hasLincolnLogo;

    public void setPlacesOfCreation(String[] poc){
        placesOfCreation = poc;
    }
    public String[] getPlacesOfCreation(){
        return placesOfCreation;
    }

    public Lincoln(String n){
        name = n;
    }

    public void bounceWithHydrolics(){
        System.out.println("The car boings!");
    }
    public void getName(){
        System.out.println("This car's name is at the moment " + this.name);
        // the reason they have a name and the other ones don't is because the marketing director 
        //says the cars have names so there is an "emotional connection"
        // i did my research
        // not thorough but existant research
    }
}
