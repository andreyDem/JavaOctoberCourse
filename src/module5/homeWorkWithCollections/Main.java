package module5.homeWorkWithCollections;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        Room[] roomsOne = controller.requestRooms(800, 5, "Washington", "Houston");
        System.out.println("________________");
        Room[] roomsTwo = controller.requestRooms(2100, 3, "Kiev", "Hilton");
        System.out.println("________________");
        Room[] roomsTree = controller.requestRooms(1760, 3, "London", null);
        System.out.println("________________");

        API booking = new BookingComAPI();
        API google = new GoogleAPI();
        API tripAdvisor = new TripAdvisorAPI();
        Room[] roomsSame = controller.check(booking, google);
        Room[] roomsSame2 = controller.check(google, tripAdvisor);
        Room[] roomsSame3 = controller.check(tripAdvisor, booking);

    }
}
