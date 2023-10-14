package Anytown;

import java.util.Scanner;
import java.io.File;

public class AnytownTest {
    public static void main(String[] args) throws Exception {

        ArrayBag buildings = new ArrayBag(13);
        File fileIn = new File("Anytown/buildings.txt");
        Scanner fileInput = new Scanner(fileIn);
        String buildingData;
        int marker1 = 2, marker2, marker3, marker4, marker5;                     
        String address, owner;
        int numberOfBedrooms, numberOfEmplyees, avgTurnover;
        boolean hasGarage;
        

        while (fileInput.hasNextLine()) {
            buildingData = fileInput.nextLine();
            marker2 = buildingData.indexOf("|", marker1);
            marker3 = buildingData.indexOf("|", marker2 + 1);
            marker4 = buildingData.indexOf("|", marker3 + 1);
            marker5 = buildingData.indexOf("|", marker4 + 1);

            address = buildingData.substring(marker1, marker2);
            owner = buildingData.substring(marker2 + 1, marker3);

             switch (buildingData.substring(0,1)) {
                case "B" :
                System.out.println("Building");
                if (buildings.addNewEntry(new Building(address, owner))) {
                    System.out.println("Building added");
                }
                else {
                    System.out.println("Building not added");
                }
                break;

                case "H" :
                System.out.println("House");
                numberOfBedrooms = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                hasGarage = Boolean.parseBoolean(buildingData.substring(marker4 + 1, marker5));
                if (buildings.addNewEntry(new House(address, owner, numberOfBedrooms, hasGarage))) {
                    System.out.println("House added");
                }
                else {
                    System.out.println("House not added");
                }
                break;

                case "S" :
                System.out.println("Shop");
                numberOfEmplyees = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                avgTurnover = Integer.parseInt(buildingData.substring(marker4 + 1, marker5));
                if (buildings.addNewEntry(new Shop(address, owner, numberOfEmplyees, avgTurnover))) {
                    System.out.println("Shop added");
                }
                else {
                    System.out.println("Shop not added");
                }
                break;
            }
        }

       fileInput.close();
    }
}