package datastructure;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        //data type non primitive
        //declare and initialize
        int myNumbers [] = {5,3,8,6,6,8};

        for (int i=0; i<6; i++) {
            System.out.println(myNumbers[i]);

        }
        System.out.println("-----------------------------------");
        // declare array of 5 numbers(size of the array)
        int[] myNumbers2 = new int[5];
        //assign array
        myNumbers2[0] = 2;
        myNumbers2[1] = 6;
        myNumbers2[2] = 4;
        myNumbers2[3] = 1;
        myNumbers2[4] = 2;

        System.out.println(myNumbers[2]);
        System.out.println("----------------------------------");

        for (int i=0; i< myNumbers2.length; i++){
            System.out.println(myNumbers2[i]);

        }
        System.out.println("-----------------------------------");

        // declare arraylist
        List<String> nameList1 = new ArrayList<>();
        nameList1.add("Syed");
        nameList1.add("millom");

        List<Integer> numsList1 = new ArrayList<>();
        numsList1.add(2);
        numsList1.add(5);
        numsList1.add(8);


    }
}

