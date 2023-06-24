import javax.print.DocFlavor;
import javax.script.ScriptEngine;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Laptop> hashSet = new HashSet<>();
        hashSet.add(new Laptop(16, "HP", 500, 500, "windows", "black"));
        hashSet.add(new Laptop(8, "samsung", 0, 1000, "none", "black"));
        hashSet.add(new Laptop(16, "ardor", 0, 1000, "none", "black"));
        hashSet.add(new Laptop(16, "acer", 1000, 0, "arch linux", "black"));
        hashSet.add(new Laptop(4, "Lenovo", 500, 0, "windows xp", "white"));

        int criteria = filtrationCriterion();
        printYourLaptop(hashSet,criteria,createValueFoLaptopCriterion(criteria));
    }

    public static void printLaptop(List<Laptop> laptops){

        for (Laptop laptop :
                laptops) {
            System.out.println("===============================");
            System.out.println("Brand - " + laptop.getName());
            System.out.println("RAMgb - " + laptop.getRAMgb());
            System.out.println("HDD - " + laptop.getHDD());
            System.out.println("SSD - " + laptop.getSSD());
            System.out.println("OS - " + laptop.getOS());
            System.out.println("Color - " + laptop.getColor());
        }
        System.out.println("===============================");
    }

    public static List<Laptop> printYourLaptop(HashSet<Laptop> hashSet, int criteria, String value) {

        List<Laptop> list = new ArrayList<>();
        for (Laptop laptop : hashSet) {

            if (mathCriteria(laptop, criteria, value)) {
                list.add(laptop);
            }
        }
        printLaptop(list);
        return list;
    }

    public static boolean mathCriteria(Laptop laptop, int criteria, String value) {

        switch (criteria) {
            case 1:
                return laptop.getRAMgb() >= Integer.parseInt(value);
            case 2:
                return laptop.getHDD() >= Integer.parseInt(value);
            case 3:
                return laptop.getOS().equalsIgnoreCase(value);
            case 4:
                return laptop.getColor().equalsIgnoreCase(value);
            default:
                return false;
        }
    }

    public static int filtrationCriterion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Дарова! Введи цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        return scanner.nextInt();
    }

    public static String createValueFoLaptopCriterion(int criteria) {
        Scanner scanner = new Scanner(System.in);
        String value = "";

        switch (criteria) {
            case 1:
                System.out.println("Введите минимальное значение для ОЗУ вашего Laptop");
                value = scanner.nextLine();
                break;
            case 2:
                System.out.println("Введите минимальное значение для Объемв ЖД вашего Laptop");
                value = scanner.nextLine();
                break;
            case 3:
                System.out.println("Введите OS вашего Laptop");
                value = scanner.nextLine();
                break;
            case 4:
                System.out.println("Введите цвет Laptop");
                value = scanner.nextLine();
                break;

        }
        return value;
    }
}
