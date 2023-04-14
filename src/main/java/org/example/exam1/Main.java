package org.example.exam1;

import java.util.HashSet;
import static org.example.exam1.Laptop.filter;
public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("MSI", "GL63", "Black", "Windows", 8, 1024, 79_000);
        Laptop laptop2 = new Laptop("Asus", "Rog", "Gray", "Windows", 12, 1024, 102_999);
        Laptop laptop3 = new Laptop("Lenovo", "Legion", "Black", "Windows", 16, 2048, 116_990);
        Laptop laptop4 = new Laptop("Apple", "MacBook Pro A2442", "Gray space", "Mac", 16, 512, 108_999);
        Laptop laptop5 = new Laptop("Apple", "MacBook Air A2337", "Gray space", "Mac", 16, 256, 132_000);
        HashSet<Laptop> setLaptop = new HashSet<>();
        setLaptop.add(laptop1);
        setLaptop.add(laptop2);
        setLaptop.add(laptop3);
        setLaptop.add(laptop4);
        setLaptop.add(laptop5);
        filter(setLaptop);

    }
}
