/*
 This program will generate cool numbers in ArrayList<String>, ask user for car number and check if it
 contains in ArrayList.

 author studio678 21.05.2019
 */



package com.studio678;

import java.io.BufferedReader;
import java.io.IOException;


import java.io.InputStreamReader;
import java.util.ArrayList;


import static com.studio678.GenerationCarNumbers.generationCarNumbers;


public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here

        ArrayList<String> carNumbers = generationCarNumbers();
        long m;

        String str = "";
        while(!str.equals("exit") ) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please type car number:");
            str = reader.readLine().trim();
            m = System.currentTimeMillis();
            if(carNumbers.contains(str)){
                System.out.println("found number in base true ");
                System.out.print((double) (System.currentTimeMillis() - m));
                System.out.println(" ms");
            } else if(str.equals("exit")) {
                break;
            }else{
                System.out.println("found number in base false ");
                System.out.print((double) (System.currentTimeMillis() - m));
                System.out.println(" ms");
            }
        }


    }





}
