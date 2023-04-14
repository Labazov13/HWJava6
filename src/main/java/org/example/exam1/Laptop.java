package org.example.exam1;
import java.util.HashSet;
import java.util.Scanner;
import static org.example.exam1.FilterByParameters.find;
/*Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
*/
public class Laptop {
    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", цвет: " + color +
                ", ОС: " + OS + ", OZU: " + OZU + ", объем жесткого диска: " + HDD + ", цена: " + price;
    }
    String brand;
    String model;
    String color;
    String OS;
    int OZU;
    int HDD;
    double price;

    public Laptop(String brand, String model, String color, String OS, int OZU, int HDD, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.OS = OS;
        this.OZU = OZU;
        this.HDD = HDD;
        this.price = price;
    }

    public static void filter(HashSet<Laptop> set) {
        Scanner sc = new Scanner(System.in);
        int findParam = 0;
        String findParametr = "";
        int operation = 0;
        double findPrice = 0;
        System.out.println("Выберите критерий сортировки: ");
        System.out.println("""
                1 - ОЗУ
                2 - Объём ЖД
                3 - Операционная система
                4 - Цвет
                5 - Цена""");
        operation = sc.nextInt();
        if (operation == 1) {
            System.out.println("Введите требуемое значение ОЗУ: ");
            findParam = sc.nextInt();
            find(findParam, set);
        }
        if (operation == 2) {
            System.out.println("Введите минимальный объем жесткого диска в ГБ: ");
            findParam = sc.nextInt();
            find(set, findParam);
        }
        sc.nextLine();
        if (operation == 3) {
            System.out.println("Введите требуемую ОС: ");
            findParametr = sc.next().toLowerCase();
            find(findParametr, set);
        }

        if (operation == 4) {
            System.out.println("Введите цвет: ");
            findParametr = sc.nextLine();
            find(set, findParametr);
        }
        if (operation == 5) {
            System.out.println("Введите максимально рассматриваемую Вами стоимость: ");
            findPrice = sc.nextDouble();
            find(findPrice, set);
        }
    }
}

