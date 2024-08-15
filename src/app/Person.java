package app;

import java.util.Scanner;

public class Person {
    private final String name;
    private final int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for the Person 1:");
        String name1 = scanner.nextLine();
        System.out.println("Enter age for the Person 1:");
        int age1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter profession for the Person 1:");
        String profession1 = scanner.nextLine();
        Person person1 = new Person(name1, age1, profession1);

        System.out.println("Enter name for the Person 2:");
        String name2 = scanner.nextLine();
        System.out.println("Enter age for the Person 2:");
        int age2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("--------------------------------------");
        System.out.println("Enter profession for the Person 2:");
        String profession2 = scanner.nextLine();
        Person person2 = new Person(name2, age2, profession2);

        System.out.println("Enter name for the Person 3:");
        String name3 = scanner.nextLine();
        System.out.println("Enter age for the Person 3:");
        int age3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter profession for the Person 3:");
        String profession3 = scanner.nextLine();
        Person person3 = new Person(name3, age3, profession3);

        System.out.println("--------------------------------------");
        System.out.println("Information about people: ");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        System.out.println("Enter the new profession for the Person 1: ");
        String newProfession = scanner.nextLine();
        person1.setProfession(newProfession);

        System.out.println("Updated profession about the Person 1: ");
        person1.displayInfo();

        scanner.close();

    }
}