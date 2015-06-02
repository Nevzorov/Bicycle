package com.nevzorov.dev;

        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.Random;
        import java.util.Scanner;

public class Main {
    public static void main (String... args) throws IOException {
        MountBicycle[] mountBicycle = new MountBicycle[5];
        SprintBicycle[] sprintBicycle = new SprintBicycle[5];

        ArrayList<Person> list = new ArrayList<>();

        autoBicycle(mountBicycle, sprintBicycle);
        manualusers(list);
        for (Person aList : list) {
            aList.printPerson();
            for (int i = 0; i < 5; i++) {
                double calm = MountBicycle.callories(aList, 20, mountBicycle[i]);
                double cals = SprintBicycle.callories(aList, 20, sprintBicycle[i]);
                System.out.println("Пользователь: " + aList.name + " на Горном " + i + " велосипеде, потратил: " + calm);
                System.out.println("Пользователь: " + aList.name + " на Шоссейном " + i + "  велосипеде, потратил: " + cals);
            }
        }
    }

    private static void manualusers(ArrayList<Person> list) {
        int old, height, weight, girth;
        String name;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя велосипедиста: ");
            name = in.nextLine();
            if (name.equals("done")) return;
            System.out.print("old: ");
            old = in.nextInt();
            System.out.print("height: ");
            height = in.nextInt();
            System.out.print("weight: ");
            weight = in.nextInt();
            System.out.print("girth: ");
            girth = in.nextInt();
            Person person = new Person(name, old, height, weight, girth);
            list.add(person);
        } while (!(name.equals("done")));

    }

    private static void autoBicycle(MountBicycle mountBicycle[], SprintBicycle sprintBicycle[]) {

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int wheelthDiametr = random.nextInt(100) + 1;
            float baseSize = random.nextFloat() + 1;
            int countGears = random.nextInt(30) + 1;
            mountBicycle[i] = new MountBicycle(wheelthDiametr, baseSize, true, countGears);
            System.out.println("MountinBicycle" + ": ");
            System.out.println("wheelthDiametr" + " - " + mountBicycle[i].wheelsDiameter);
            System.out.println("baseSize" + " - " + mountBicycle[i].baseSize);
            System.out.println("isBrakeExist" + " - " + mountBicycle[i].isBrakeExist);
            System.out.println("countGears" + " - " + mountBicycle[i].countGears);
        }
        for (int i = 0; i < 5; i++) {
            int wheelthDiametr = random.nextInt(100) + 1;
            float baseSize = random.nextFloat() + 1;
            float wheealsThin = random.nextInt() + 1;
            sprintBicycle[i] = new SprintBicycle(wheelthDiametr, baseSize, false, wheealsThin);
            System.out.println("SprintBicycle" + i + ": ");
            System.out.println("wheelthDiametr" + " - " + sprintBicycle[i].wheelsDiameter);
            System.out.println("baseSize" + " - " + sprintBicycle[i].baseSize);
            System.out.println("isBrakeExist" + " - " + sprintBicycle[i].isBrakeExist);
            System.out.println("wheealsThin" + " - " + sprintBicycle[i].wheealsThin);
        }
    }
}

