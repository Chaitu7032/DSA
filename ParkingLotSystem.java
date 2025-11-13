package stacks;

import java.util.Scanner;
import java.util.Stack;

public class ParkingLotSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the capacity of the parking lot
        int capacity = scanner.nextInt();
        Stack<Integer> parkingLot = new Stack<>();

        while (true) {
            int operation = scanner.nextInt();

            if (operation == 1) {
                // Park a vehicle
                int vehicleNumber = scanner.nextInt();

                if (parkingLot.size() < capacity) {
                    parkingLot.push(vehicleNumber);
                    System.out.println("Vehicle " + vehicleNumber + " is parked.");
                } else {
                    System.out.println("Parking lot is full. Cannot park vehicle " + vehicleNumber + ".");
                }

            } else if (operation == 2) {
                // Remove the most recently parked vehicle
                if (parkingLot.isEmpty()) {
                    System.out.println("Parking lot is empty. No vehicles to remove.");
                } else {
                    int removedVehicle = parkingLot.pop();
                    System.out.println("Vehicle " + removedVehicle + " is removed from the parking lot.");
                }

            } else if (operation == 3) {
                // Exit the program
                break;
            }
        }

        scanner.close();
    }
}

