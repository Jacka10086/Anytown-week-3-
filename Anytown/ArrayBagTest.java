package Anytown;

import java.io.File;
import java.util.Scanner;

public class ArrayBagTest {
    
    public static void main(String[] args) throws Exception {

        // 创建一个容量为 13 的 ArrayBag 对象
        ArrayBag buildings = new ArrayBag(13);

        // 从文件中读取数据
        File fileIn = new File("Anytown/buildings.txt");
        Scanner fileInput = new Scanner(fileIn);
        String buildingData;
        int marker1 = 2, marker2, marker3, marker4, marker5;                     
        String address, owner;
        int numberOfBedrooms, numberOfEmplyees, avgTurnover;
        boolean hasGarage;
      
        // 逐行读取文件中的数据
        while (fileInput.hasNextLine()) {
            buildingData = fileInput.nextLine();

            // 解析数据
            marker2 = buildingData.indexOf("|", marker1);
            marker3 = buildingData.indexOf("|", marker2 + 1);
            marker4 = buildingData.indexOf("|", marker3 + 1);
            marker5 = buildingData.indexOf("|", marker4 + 1);

            address = buildingData.substring(marker1, marker2);
            owner = buildingData.substring(marker2 + 1, marker3);

            // 根据数据类型创建相应的对象，并将其添加到 ArrayBag 中
            switch (buildingData.substring(0,1)) {
                case "B" :
                System.out.println("Building");
                if (buildings.addNewEntry(new Building(address, owner))) {
                    System.out.println("Building added");
                }
