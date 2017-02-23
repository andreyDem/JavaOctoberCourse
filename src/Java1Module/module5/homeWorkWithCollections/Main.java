package Java1Module.module5.homeWorkWithCollections;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        List<Room> roomsOne = controller.requestRooms(800, 5, "Washington", "Houston");
        System.out.println("________________");
        List<Room> roomsTwo = controller.requestRooms(2100, 3, "Kiev", "Hilton");
        System.out.println("________________");
        List<Room> roomsTree = controller.requestRooms(1760, 3, "London", null);
        System.out.println("________________");

        API booking = new BookingComAPI();
        API google = new GoogleAPI();
        API tripAdvisor = new TripAdvisorAPI();
        List<Room> roomsSame = controller.check(booking, google);
        List<Room> roomsSame2 = controller.check(google, tripAdvisor);
        List<Room> roomsSame3 = controller.check(tripAdvisor, booking);
    }
}
