import java.time.LocalTime;

class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime departureTime;

    // Constructor to initialize Airplane attributes
    public Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    // Method to check the flight status (On-time or Delayed based on current time)
    public void checkFlightStatus() {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isBefore(departureTime)) {
            System.out.println("Flight " + flightNumber + " is on time for departure at " + departureTime);
        } else {
            System.out.println("Flight " + flightNumber + " has departed or is delayed.");
        }
    }

    // Method to delay the flight by a certain number of minutes
    public void delayFlight(int minutes) {
        departureTime = departureTime.plusMinutes(minutes);
        System.out.println("Flight " + flightNumber + " delayed by " + minutes + " minutes. New departure time: " + departureTime);
    }

    // Method to display the flight details
    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber + ", Destination: " + destination + ", Departure Time: " + departureTime);
    }

    public static void main(String[] args) {
        // Create an Airplane object
        Airplane airplane = new Airplane("BA256", "London", LocalTime.of(15, 30));

        // Display flight details
        airplane.displayFlightDetails();

        // Check the flight status
        airplane.checkFlightStatus();

        // Delay the flight by 45 minutes
        airplane.delayFlight(45);

        // Check flight status after delay
        airplane.checkFlightStatus();

        // Display updated flight details
        airplane.displayFlightDetails();
    }
}
