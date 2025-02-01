import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent a flight
class Flight {
    private String flightNumber;
    private String destination;
    private boolean isBooked;

    public Flight(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.isBooked = false;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book() {
        isBooked = true;
    }

    public void cancel() {
        isBooked = false;
    }

    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + ", Destination: " + destination + ", Booked: " + isBooked;
    }
}

// Class to represent a hotel
class Hotel {
    private String name;
    private String location;
    private boolean isBooked;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        this.isBooked = false;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book() {
        isBooked = true;
    }

    public void cancel() {
        isBooked = false;
    }

    @Override
    public String toString() {
        return "Hotel: " + name + ", Location: " + location + ", Booked: " + isBooked;
    }
}

// Class for the Travel Agency
class TravelAgency {
    private List<Flight> flights;
    private List<Hotel> hotels;

    public TravelAgency() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
    }

    // Method to add flights
    public void addFlight(String flightNumber, String destination) {
        flights.add(new Flight(flightNumber, destination));
    }

    // Method to add hotels
    public void addHotel(String name, String location) {
        hotels.add(new Hotel(name, location));
    }

    // Method to search for flights
    public List<Flight> searchFlights(String destination) {
        List<Flight> foundFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDestination().equalsIgnoreCase(destination) && !flight.isBooked()) {
                foundFlights.add(flight);
            }
        }
        return foundFlights;
    }

    // Method to search for hotels
    public List<Hotel> searchHotels(String location) {
        List<Hotel> foundHotels = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getLocation().equalsIgnoreCase(location) && !hotel.isBooked()) {
                foundHotels.add(hotel);
            }
        }
        return foundHotels;
    }

    // Method to book a flight
    public boolean bookFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber) && !flight.isBooked()) {
                flight.book();
                return true;
            }
        }
        return false;
    }

    // Method to cancel a flight
    public boolean cancelFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber) && flight.isBooked()) {
                flight.cancel();
                return true;
            }
        }
        return false;
    }

    // Method to book a hotel
    public boolean bookHotel(String name) {
        for (Hotel hotel : hotels) {
            if (hotel.getName().equalsIgnoreCase(name) && !hotel.isBooked()) {
                hotel.book();
                return true;
            }
        }
        return false;
    }

    // Method to cancel a hotel reservation
    public boolean cancelHotel(String name) {
        for (Hotel hotel : hotels) {
            if (hotel.getName().equalsIgnoreCase(name) && hotel.isBooked()) {
                hotel.cancel();
                return true;
            }
        }
        return false;
    }
}

// Main class to demonstrate the TravelAgency functionality
public class TravelAgencyDemo {
    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency();

        // Adding some flights and hotels
        agency.addFlight("AA123", "New York");
        agency.addFlight("BB456", "Los Angeles");
        agency.addFlight("CC789", "Chicago");
        
        agency.addHotel("Grand Hotel", "New York");
        agency.addHotel("Luxury Inn", "Los Angeles");
        agency.addHotel("Comfort Suites", "Chicago");

        Scanner scanner = new Scanner(System.in);

        // Example search and booking
        System.out.println("Search for flights to New York:");
        List<Flight> flights = agency.searchFlights("New York");
        if (flights.isEmpty()) {
            System.out.println("No available flights.");
        } else {
            for (Flight flight : flights) {
                System.out.println(flight);
            }
            System.out.print("Enter flight number to book: ");
            String flightNumber = scanner.nextLine();
            if (agency.bookFlight(flightNumber)) {
                System.out.println("Flight booked successfully.");
            } else {
                System.out.println("Flight booking failed.");
            }
        }

        // Search and book hotels
        System.out.println("\nSearch for hotels in New York:");
        List<Hotel> hotels = agency.searchHotels("New York");
        if (hotels.isEmpty()) {
            System.out.println("No available hotels.");
        } else {
            for (Hotel hotel : hotels) {
                System.out.println(hotel);
            }
            System.out.print("Enter hotel name to book: ");
            String hotelName = scanner.nextLine();
            if (agency.bookHotel(hotelName)) {
                System.out.println("Hotel booked successfully.");
            } else {
                System.out.println("Hotel booking failed.");
            }
        }

        scanner.close();
    }
}
