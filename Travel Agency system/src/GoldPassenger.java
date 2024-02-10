public class GoldPassenger extends Passenger {
    private double discountRate;
    private double balance;
    private String name;

    

    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber, balance);
        this.discountRate = 0.1;
    }

    public double calculateDiscountedCost(double cost) {
        return cost * (1 - discountRate);
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
    

    
    public void signUpForActivity(Activity activity) {
        double activityCost = calculateDiscountedCost(activity.getCost());
        if (getBalance() >= activityCost) {
            super.signUpForActivity(activity);
            setBalance(getBalance() - activityCost);
            System.out.println(getName() + " (Gold) signed up for activity: " + activity.getName());
              } else {
            System.out.println("Insufficient balance to sign up for activity: " + activity.getName());
            }
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
    

