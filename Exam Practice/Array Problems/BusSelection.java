/*
Bus Seat Reservation System — Multiple Operations

A bus has 10 seats represented by an array:

[101, 102, 103, 104, 105, 106, 107, 108, 109, 110]

Each number represents a seat number.

A passenger wants to reserve a particular seat, but the system needs to maintain the list of available seats.

Build a program that allows the user to:

Search whether a particular seat is available.
Delete the seat from the available-seat array when it is reserved.
Insert the seat back into the array if a reservation is cancelled.
Display all currently available seats.

The program should handle cases where:

The requested seat doesn't exist.
A passenger tries to reserve an already reserved seat.
A cancelled seat is inserted back into the array.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class BusSelection {
    private static final int MIN_SEAT = 101;
    private static final int MAX_SEAT = 110;

    public static boolean validSeatNumber(int seatID) {
        return seatID >= MIN_SEAT && seatID <= MAX_SEAT;
    }

    public static boolean searchSeat(int seatID, ArrayList<Integer> seats) {
        return seats.contains(seatID);
    }

    public static boolean deleteSeat(int seatID, ArrayList<Integer> seats) {
        if (!validSeatNumber(seatID)) return false;
        return seats.remove(Integer.valueOf(seatID));
    }

    public static boolean insertSeat(int seatID, ArrayList<Integer> seats) {
        if (!validSeatNumber(seatID)) return false;
        if (seats.contains(seatID)) return false;
        // insert keeping list sorted
        int i = 0;
        while (i < seats.size() && seats.get(i) < seatID) i++;
        seats.add(i, seatID);
        return true;
    }

    public static void displaySeats(ArrayList<Integer> seats) {
        if (seats.isEmpty()) {
            System.out.println("No available seats.");
            return;
        }
        System.out.print("Available seats: ");
        for (int i = 0; i < seats.size(); i++) {
            System.out.print(seats.get(i));
            if (i < seats.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> bus = new ArrayList<>();
        for (int s = MIN_SEAT; s <= MAX_SEAT; s++) bus.add(s);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Search seat");
            System.out.println("2. Reserve seat");
            System.out.println("3. Cancel reservation (insert seat)");
            System.out.println("4. Display available seats");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String line = sc.nextLine().trim();
            int opt;
            try {
                opt = Integer.parseInt(line);
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            if (opt == 5) {
                System.out.println("Goodbye.");
                break;
            }

            if (opt == 4) {
                displaySeats(bus);
                continue;
            }

            System.out.print("Enter seat number (e.g., 101): ");
            String sline = sc.nextLine().trim();
            int seat;
            try {
                seat = Integer.parseInt(sline);
            } catch (Exception e) {
                System.out.println("Invalid seat number.");
                continue;
            }

            switch (opt) {
                case 1:
                    if (!validSeatNumber(seat)) {
                        System.out.println("Seat number doesn't exist.");
                    } else if (searchSeat(seat, bus)) {
                        System.out.println("Seat " + seat + " is available.");
                    } else {
                        System.out.println("Seat " + seat + " is already reserved.");
                    }
                    break;
                case 2:
                    if (!validSeatNumber(seat)) {
                        System.out.println("Seat number doesn't exist.");
                    } else if (deleteSeat(seat, bus)) {
                        System.out.println("Seat " + seat + " reserved successfully.");
                    } else {
                        System.out.println("Seat " + seat + " is already reserved.");
                    }
                    break;
                case 3:
                    if (!validSeatNumber(seat)) {
                        System.out.println("Seat number doesn't exist.");
                    } else if (insertSeat(seat, bus)) {
                        System.out.println("Reservation cancelled. Seat " + seat + " is now available.");
                    } else {
                        System.out.println("Seat " + seat + " is already available.");
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}
