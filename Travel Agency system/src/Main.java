public class Main {
    public static void main(String[] args) {
        // Create activities
        Activity activity1 = new Activity("Sightseeing", "Explore the city", 50.0, 10);
        Activity activity2 = new Activity("Hiking", "Mountain adventure", 30.0, 5);

        // Create destination
        Destination destination = new Destination("City of Example");
        destination.addActivity(activity1);
        destination.addActivity(activity2);

        // Create travel package
        TravelPackage travelPackage = new TravelPackage("Example Package", 20);
        travelPackage.addDestination(destination);

        // Create passengers
        StandardPassenger standardPassenger = new StandardPassenger("John", 1, 100.0);
        GoldPassenger goldPassenger = new GoldPassenger("Alice", 2, 150.0);
        PremiumPassenger premiumPassenger = new PremiumPassenger("Bob", 3);

        // Sign up passengers for activities
        standardPassenger.signUpForActivity(activity1);
        goldPassenger.signUpForActivity(activity2);
        premiumPassenger.signUpForActivity(activity1);

        // Add passengers to the travel package
        travelPackage.addPassenger(standardPassenger);
        travelPackage.addPassenger(goldPassenger);
        travelPackage.addPassenger(premiumPassenger);

        // Print itinerary and passenger list
        travelPackage.printItinerary();
        travelPackage.printPassengerList();
    }
}
