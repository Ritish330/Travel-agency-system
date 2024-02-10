import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        System.out.println("Destinations and Activities:");

        for (Destination destination : itinerary) {
            destination.printDestinationDetails();
        }
        // Implement itinerary printing logic
    }

    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());

        for (Passenger passenger : passengers) {
            passenger.printPassengerDetails();
        }
        // Implement passenger list printing logic
    }
}
