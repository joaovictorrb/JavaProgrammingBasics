package course.static_pkg;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before adding a ticket: Available Seats -> " + FlightTicket.availableSeats);
        FlightTicket ticket1 = new FlightTicket(1122, 1, "Economy", 1);
        System.out.println("After adding a ticket: Available Seats -> " + FlightTicket.availableSeats);
        FlightTicket ticket2 = new FlightTicket(1122, 2, "Economy", 2);
        System.out.println("After adding another ticket: Available Seats -> " + FlightTicket.availableSeats);
        FlightTicket ticket3 = new FlightTicket(1122, 3, "Economy", 3);
        System.out.println("After adding another ticket: Available Seats -> " + FlightTicket.availableSeats);
        FlightTicket ticket4 = new FlightTicket(1122, 4, "Economy", 4);
        System.out.println("After adding another ticket: Available Seats -> " + FlightTicket.availableSeats);
    }
}
