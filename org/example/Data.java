package org.example;

import java.util.*;

public class Data {
    //String
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();//plus
    List<Integer> list3 = new ArrayList<Integer>();//minus
    List<Integer> list4 = new ArrayList<Integer>();//multi
    List<Integer> list5 = new ArrayList<Integer>();//divide

    Scanner orb = new Scanner(System.in);

    public int target;

    public void ListLoop(int lopNum, int targ){
        for (int i = 0;i < lopNum; i++){
            System.out.print("Enter your " + i + " number: ");
            int numb = orb.nextInt();
            list1.add(numb);
        }
        System.out.println("List you input: "+  list1);

        target = targ;
        for (int x = 0;x < (int)(list1.size());x++) {
            for (int y = x; y < (int) (list1.size()); y++) {
                if (((int) (list1.get(x)) + (int)(list1.get(y))) == target) {
                    list2.add(x);
                    list2.add(y);
                }else if (((int) (list1.get(x))- (int)(list1.get(y))) == target) {
                    list3.add(x);
                    list3.add(y);
                }
                else if (((int) (list1.get(x)) * (int)(list1.get(y))) == target) {
                    list4.add(x);
                    list4.add(y);
                }
                else if (((int) (list1.get(x)) / (int)(list1.get(y))) == target) {
                    list5.add(x);
                    list5.add(y);
                }
            }
        }
        System.out.println("NOTE: 2 elements is 1 operation.");
        System.out.println("Result of elements for \'plus operation: "+list2);
        System.out.println("Result of elements for \'minus operation: "+list3);
        System.out.println("Result of elements for \'multiple operation: "+list4);
        System.out.println("Result of elements for \'divide operation: "+list5);

    }
}
