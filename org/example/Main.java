package org.example;
import java.util.*;
import org.example.Data;
public class Main {
    public static void main(String[] args) {

        Scanner orb2 = new Scanner(System.in);
        System.out.print("Enter your number of members: ");
        int loopNum = orb2.nextInt();
        Data dt = new Data();
        System.out.print("Enter your number of target (it must be \'plus operation): ");
        int x = orb2.nextInt();
        dt.ListLoop(loopNum, x);

    }
}