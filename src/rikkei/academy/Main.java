package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setSpeed(f1.Fast);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);

        f2.setSpeed(f2.Medium);
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);

        System.out.println("Fan f1: " + f1);
        System.out.println("Fan f2: " + f2);

    }
}