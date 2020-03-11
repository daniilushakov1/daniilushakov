import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int containersInTruck = 12;
        int cratesInContainer = 27;

        System.out.println("Enter crates amount: ");
        int cratesAmount = Integer.parseInt(reader.readLine());

        int containersAmount = (int) ceil((double) cratesAmount / cratesInContainer);
        int trucksAmount = (int) ceil((double) containersAmount / containersInTruck);

        int truckNumber = 1, containerNumber = 1;
        for (int i = 0; i < cratesAmount; i++) {
            if (i % (cratesInContainer * containersInTruck) == 0) {
                System.out.println("\nTruck " + truckNumber + ":");
                truckNumber++;
            }
            if (i % cratesInContainer == 0) {
                System.out.println("\tContainer " + containerNumber + ":");
                containerNumber++;
            }
            System.out.println("\t\t\tCrate " + (i + 1));
        }

        System.out.println("\n==============================\n");
        System.out.println("Trucks amount: " + trucksAmount);
        System.out.println("Containers amount: " + containersAmount);
        System.out.println("\n==============================\n");
    }
}
