package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String greeting = "Welcome to my Java program.";
        System.out.println(greeting);

        int dogCount = 3;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 1;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int pigCount = 1;
        System.out.println("I own " + pigCount + " " + pluralize("pig", pigCount) + ".");

        int chameleonCount = 1;
        System.out.println("I own " + chameleonCount + " " + pluralize("chameleon", chameleonCount) + ".");

        int x = 3;
        System.out.println(flipHeads(x));

        clock();
    }

    public static String pluralize(String string, int num) {
        String result;
        if (num == 1) {
            result = string;
        } else {
            result = string + "s";
        }
        return result;
    }

    public static String flipHeads(int num) {
        int count = 0;
        int flipCount = 0;
        while (count < num) {
            double random = Math.random();
            if (random < 0.5) {
                System.out.println("tails");
                count = 0;
            } else {
                System.out.println("heads");
                count++;
            }
            flipCount++;
        }
        return "It took " + flipCount + " flips to flip " + num + " heads in a row.";
    }

    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        while (true) {
            now = LocalDateTime.now();
            String currentTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if (!currentTime.equals(time)) {
                time = currentTime;
                System.out.println(time);
            }
        }
    }
}
