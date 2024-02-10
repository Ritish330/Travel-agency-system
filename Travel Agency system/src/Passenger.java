import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }

    public void signUpForActivity(Activity activity) {
        activities.add(activity);
    }

    // Getters and Setters...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return passengerNumber == passenger.passengerNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengerNumber);
    }
    public void printPassengerDetails() {
        System.out.println("Passenger: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        System.out.println("Balance: " + balance);

        if (!activities.isEmpty()) {
            System.out.println("Activities signed up for:");

            for (Activity activity : activities) {
                activity.printActivityDetails();
            }
        } else {
            System.out.println("No activities signed up for.");
        }

        System.out.println();
    }
}

