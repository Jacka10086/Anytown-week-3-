package Anytown;

import java.util.Scanner;
import java.io.File;
// 这是一个有效的代码行
public class AnytownTest {
    public static void main(String[] args) throws Exception {

        ArrayBag buildings = new ArrayBag(13); // 创建一个能够存储13个建筑物的ArrayBag对象
        File fileIn = new File("Anytown/buildings.txt"); // 用于读取建筑物数据的文件
        Scanner fileInput = new Scanner(fileIn); // 创建一个扫描器来读取文件
        String buildingData; // 存储从文件中读取的建筑数据
        // 初始化标记，用于帮助解析字符串中的数据
        int marker1 = 2, marker2, marker3, marker4, marker5; 
        // 声明用于存储建筑信息的变量
        String address, owner;
        int numberOfBedrooms, numberOfEmplyees, avgTurnover;
        boolean hasGarage;

        // 当文件中还有更多行数据时，继续循环
        while (fileInput.hasNextLine()) {
            buildingData = fileInput.nextLine(); // 读取一行建筑数据
            // 找到数据字段之间的分隔符'|'的位置
            marker2 = buildingData.indexOf("|", marker1);
            marker3 = buildingData.indexOf("|", marker2 + 1);
            marker4 = buildingData.indexOf("|", marker3 + 1);
            marker5 = buildingData.indexOf("|", marker4 + 1);

            // 解析地址和拥有者数据
            address = buildingData.substring(marker1, marker2);
            owner = buildingData.substring(marker2 + 1, marker3);

            // 根据数据的第一个字符决定数据类型，并创建相应的对象
             switch (buildingData.substring(0,1)) {
                case "B" : // 如果是建筑物
                System.out.println("Building");
                if (buildings.addNewEntry(new Building(address, owner))) {
                    System.out.println("Building added");
                }
                else {
                    System.out.println("Building not added");
                }
                break;

                case "H" : // 如果是房子
                System.out.println("House");
                // 解析卧室数量和车库信息
                numberOfBedrooms = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                hasGarage = Boolean.parseBoolean(buildingData.substring(marker4 + 1, marker5));
                // 尝试添加房子到建筑集合中
                if (buildings.addNewEntry(new House(address, owner, numberOfBedrooms, hasGarage))) {
                    System.out.println("House added");
                }
                else {
                    System.out.println("House not added");
                }
                break;

                case "S" : // 如果是商店
                System.out.println("Shop");
                // 解析员工数量和平均营业额
                numberOfEmplyees = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                avgTurnover = Integer.parseInt(buildingData.substring(marker4 + 1, marker5));
                // 尝试添加商店到建筑集合中
                if (buildings.addNewEntry(new Shop(address, owner, numberOfEmplyees, avgTurnover))) {
                    System.out.println("Shop added");
                }
                else {
                    System.out.println("Shop not added");
                }
                break;
            }
        }

       fileInput.close(); // 关闭文件输入流
    }
}
