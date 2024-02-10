import java.util.Objects;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    // Getters and Setters...

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Objects.equals(name, activity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    
    public void printActivityDetails() {
        System.out.println("Activity: " + name);
        System.out.println("Description: " + description);
        System.out.println("Cost: " + cost);
        System.out.println("Capacity: " + capacity);
        System.out.println();
    }
    
}
