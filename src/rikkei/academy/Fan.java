package rikkei.academy;

public class Fan {
    public final int Fast = 3;
    public final int Medium = 2;
    public final int Slow = 1;

    private int speed = this.Slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){


    }

    @Override
    public String toString() {

        if (this.on){
            return "Fan is on{" +
//                    "Fast=" + Fast +
//                    ", Medium=" + Medium +
//                    ", Slow=" + Slow +
                    ", speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "Fan is off{" +
//                    "Fast=" + Fast +
//                    ", Medium=" + Medium +
//                    ", Slow=" + Slow +
//                    ", speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }

    public int getFast() {
        return Fast;
    }

    public int getMedium() {
        return Medium;
    }

    public int getSlow() {
        return Slow;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
