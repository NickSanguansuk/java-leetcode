package interview.jpmc.interview_2026_09_23;

//
/*
 * public void printTopSpeed() prints "Top speed of the vehicle is 100 kmph"
 * public void printTopSpeed(int topSpeed) prints "Top speed of the vehicle is " + topSpeed + " kmph"
 * public void printTopSpeed(String vehicleName, int topSpeed) prints "Top speed of the vehicle " + vehicleName +" is " + topSpeed + " kmph"
 */

import java.util.Scanner;

public class Interview_a {

    public static class Car {
        public void printTopSpeed() {
            System.out.println("Top speed of the vehicle is 100 kmph");
        }

        public void printTopSpeed(int topSpeed) {
            System.out.println("Top speed of the vehicle is " + topSpeed + " kmph");
        }

        public void printTopSpeed(String vehicle, int topSpeed) {
            System.out.println("Top speed of the vehicle " + vehicle + " is " + topSpeed + " kmph");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = Integer.parseInt(str);
        for (int i = 0; i < n; i++) {
            String[] input = s.nextLine().split(" ");
            Car car = new Car();
            if (input.length == 1) {
                car.printTopSpeed();
            } else if (input.length == 2) {
                car.printTopSpeed(Integer.parseInt(input[1]));
            } else if (input.length == 3) {
                car.printTopSpeed(input[1], Integer.parseInt(input[2]));
            }
        }
    }
}
