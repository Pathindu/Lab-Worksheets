package LW_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        ArrayList<pet> pets = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Pet name. Enter 'STOP' to end : ");
            String name = sc.nextLine();

            if (name.equals("STOP")) break;

            System.out.println("Enter pet type ('c' for cat 'd' for dog) :");
            String type = sc.nextLine();

            switch (type){
                case "c":
                    Cat cat = new Cat();
                    cat.setName(name);
                    pets.add(cat);
                    break;
                case "d":
                    Dog dog = new Dog(name);
                    pets.add(dog);
                    break;
                case null, default:
                    System.out.println("Invalid Pet type");
                    continue;
            }
        }

        for (pet p: pets) {
            String type = "";
            if (p instanceof Cat) type = "Cat";
            else if (p instanceof Dog) type = "Dog";
            System.out.println("Pet name : " + p.getName() + ",\t\tPet type : " + type);
        }
    }
}
