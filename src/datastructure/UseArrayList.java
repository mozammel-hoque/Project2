package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UseArrayList {
    public static void main(String[] args) {


        // declare arraylist
        List<String> nameList = new ArrayList<>();
        nameList.add("Syed");
        nameList.add("millom");

        List<Integer> numsList = new ArrayList<>();
        numsList.add(2);
        numsList.add(5);
        numsList.add(8);
        numsList.add(18);

        for (int i = 0; i<numsList.size(); i++){
            System.out.println(numsList.get(i));
        }
        System.out.println(numsList.get(0));
        numsList.add(3,12);
        for (int i = 0; i<numsList.size(); i++) {
            System.out.println(numsList.get(i));
        }
        System.out.println("------------------------");

        int list1 [] = new int [10];
      //  System.out.println("Please enter some number");
        Random random = new Random();
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
            list1[i] = random.nextInt(100);
        }


        //array list can take multiple data types
//        List<Object> objList = new ArrayList<>();
//        objList.add("3");
//        objList.add(3);
//        objList.add('3');
//        objList.add(3.5);
//        objList.add(true);

    }






}

