package Anytown; // 定义包Anytown

import java.io.File; // 导入File类，用于文件操作
import java.util.Scanner; // 导入Scanner类，用于读取输入

// ArrayBagTest类定义
public class ArrayBagTest {
    
    // main方法，程序入口点
    public static void main(String[] args) throws Exception {

        // 创建ArrayBag对象，初始容量设为13
        ArrayBag buildings = new ArrayBag(13);
        // 创建File对象，用于读取文件“Anytown/buildings.txt” 
        File fileIn = new File("Anytown/buildings.txt");
        // 创建Scanner对象，用于从文件读取数据
        Scanner fileInput = new Scanner(fileIn);
        // 声明字符串变量buildingData，用于存放读取的建筑数据
        String buildingData;
        // 声明并初始化标记变量，用于解析字符串数据
        int marker1 = 2, marker2, marker3, marker4, marker5;                     
        // 声明变量，用于存放建筑数据的各个属性
        String address, owner;
        int numberOfBedrooms, numberOfEmplyees, avgTurnover;
        boolean hasGarage;


        // 使用while循环读取文件中的每一行
        while (fileInput.hasNextLine()) {
            // 读取文件的下一行
            buildingData = fileInput.nextLine();
            // 找到并更新标记变量的值，用于确定数据字段的位置
            marker2 = buildingData.indexOf("|", marker1);
            marker3 = buildingData.indexOf("|", marker2 + 1);
            marker4 = buildingData.indexOf("|", marker3 + 1);
            marker5 = buildingData.indexOf("|", marker4 + 1);

            // 解析并存储地址和所有者信息
            address = buildingData.substring(marker1, marker2);
            owner = buildingData.substring(marker2 + 1, marker3);

            // 使用switch语句根据标记处理不同类型的建筑数据
            switch (buildingData.substring(0,1)) {
                case "B" : // 如果标记为"B"，处理建筑数据
                System.out.println("Building");
                if (buildings.addNewEntry(new Building(address, owner))) {
                    System.out.println("Building added");
                }
                else {
                    System.out.println("Building not added");
                }
                break;

                case "H" : // 如果标记为"H"，处理房子数据
                System.out.println("House");
                // 解析卧室数量和车库存在性
                numberOfBedrooms = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                hasGarage = Boolean.parseBoolean(buildingData.substring(marker4 + 1, marker5));
                if (buildings.addNewEntry(new House(address, owner, numberOfBedrooms, hasGarage))) {
                    System.out.println("House added");
                }
                else {
                    System.out.println("House not added");
                }
                break;

                case "S" : // 如果标记为"S"，处理商店数据
                System.out.println("Shop");
                // 解析员工数量和平均营业额
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

        // 关闭文件输入流
        fileInput.close();
    }
}
