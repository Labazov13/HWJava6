package org.example.exam1;


import java.util.HashSet;

public class FilterByParameters {
    /***
     * Выводит результат с требуемым значением ОЗУ
     * @param findOZU искомое значение ОЗУ
     * @param laptopHashSet множество ноутбуков
     */
    public static void find(int findOZU, HashSet<Laptop> laptopHashSet) {
        HashSet<Laptop> result = new HashSet<>();
        for (Laptop lap : laptopHashSet) {
            if (lap.OZU == findOZU) {
                result.add(lap);
                System.out.println(lap);
            }
        }
        if (result.isEmpty()) {
            System.out.println("По Вашему запросу ничего не найдено:(");
        }
    }

    /***
     * Выводит результат требуемого объема жесткого диска
     * @param laptopHashSet множество ноутбуков
     * @param findHDD искомое значение памяти жесткого диска
     */
    public static void find(HashSet<Laptop> laptopHashSet, int findHDD) {
        HashSet<Laptop> result = new HashSet<>();
        for (Laptop lap : laptopHashSet) {
            if (lap.HDD == findHDD) {
                result.add(lap);
                System.out.println(lap);
            }
        }
        if (result.isEmpty()) {
            System.out.println("По Вашему запросу ничего не найдено:(");
        }
    }

    /***
     * Выводит результат подходящей для пользователя ОС
     * @param findOS искомое значение операционной системы
     * @param laptopHashSet множество ноутбуков
     */
    public static void find(String findOS, HashSet<Laptop> laptopHashSet) {
        HashSet<Laptop> result = new HashSet<>();
        for (Laptop lap : laptopHashSet) {
            if (lap.OS.toLowerCase().equals(findOS)) {
                result.add(lap);
                System.out.println(lap);
            }
        }
        if (result.isEmpty()) {
            System.out.println("По Вашему запросу ничего не найдено:(");
        }
    }

    /***
     * Выводит результат нужного цвета ноутбука
     * @param laptopHashSet множество ноутбуков
     * @param findColor искомый цвет
     */
    public static void find(HashSet<Laptop> laptopHashSet, String findColor) {
        HashSet<Laptop> result = new HashSet<>();
        for (Laptop lap : laptopHashSet) {
            //if(lap.color.equals(findColor)){
            if (lap.color.replaceAll("\\s+","").equalsIgnoreCase(findColor.replaceAll("\\s+",""))) {
                result.add(lap);
                System.out.println(lap);
            }
        }
        if (result.isEmpty()) {
            System.out.println("По Вашему запросу ничего не найдено:(");
        }
    }

    /***
     * Отображает результат по стоимости, введенной пользователем
     * @param findPrice искомое значение стоимости ноутбука
     * @param laptopHashSet множество ноутбуков
     */
    public static void find(double findPrice, HashSet<Laptop> laptopHashSet) {
        HashSet<Laptop> result = new HashSet<>();
        for (Laptop lap : laptopHashSet) {
            if (lap.price <= findPrice) {
                result.add(lap);
                System.out.println(lap);
            }
        }
        if (result.isEmpty()) {
            System.out.println("По Вашему запросу ничего не найдено:(");
        }
    }
}
