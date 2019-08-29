package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);

        double n1 = ap.nextInt("First Number?");
        double n2 = ap.nextInt("Second Number?");
        double avg = (n1+n2)/2;
        System.out.println("The average is " + avg);

    }
}
