package input_in_java;

import java.util.*;

public class AreaOfCircle {
   public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);

    float pi = sc.nextFloat();
    System.out.println("The value of pi " + pi);

    float r = sc.nextFloat();
    System.out.println("radius of circle " + r);

    float area = pi * r*r;
    System.out.println("This is the area of circle " + area);
   }
}
