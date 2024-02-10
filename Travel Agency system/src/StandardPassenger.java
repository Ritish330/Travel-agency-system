public class StandardPassenger extends Passenger {
    private double discountRate;
    private double balance;
    private String name;


    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
        this.discountRate = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public double getClassBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public double calculateDiscountedCost(double cost) {
        return cost * (1 - discountRate);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void signUpForActivity(Activity activity) {
        double activityCost = calculateDiscountedCost(activity.getCost());
        if (getBalance() >= activityCost) {
            super.signUpForActivity(activity);
            setBalance(getBalance() - activityCost);
            System.out.println(getName() + " signed up for activity: " + activity.getName());
        } else {
            System.out.println("Insufficient balance to sign up for activity: " + activity.getName());
        }
    }
}
