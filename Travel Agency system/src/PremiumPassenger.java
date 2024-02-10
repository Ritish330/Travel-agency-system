public class PremiumPassenger extends Passenger {
    private String name;
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber, 0);
       

    }

    public String getName() {
        return name;
    }

    public void signUpForActivity(Activity activity) {
        super.signUpForActivity(activity);
        System.out.println(getName() + " (Premium) signed up for activity: " + activity.getName());
    }
}

