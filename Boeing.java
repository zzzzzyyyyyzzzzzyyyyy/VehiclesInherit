public class Boeing extends Planes{
    private int seats;

    public void setSeats(int s){
        seats = s;
    }
    public int getSeats(){
        return seats;
    }

    public void fly(){
        System.out.println("zoom!");
    }
    public void loadPlane(){
        System.out.println("The Boeing plane is being loaded with people.");
    }
    public boolean containsThatOneAnnoyingChildThatStartsCryingReallyLoudlyAndHappensToSitRightBehindYouAndAlsoStartsToKickTheChairAndThereIsNoPeaceForTheEntirePlaneRideButDontWorryYouArentTheOnlyOneWhoHasToDealWithTheLoudChildItsAGroupMemoryWhereEveryoneOnThePlaneCanLeaveAnnoyed(){
        return false;
        // i shall not return true because no one should go through that
    }   
}
