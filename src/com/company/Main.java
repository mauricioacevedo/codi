package com.company;

import com.company.codility.BinaryGap;
import com.company.codility.OddOccurrencesInArray;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //binaryGap();
        oddOccurrencesInArray();


    }

    public static void binaryGap(){ //Codelity
        int s = new BinaryGap().solution(51712);

        System.out.println(s);
    }

    public static void oddOccurrencesInArray(){ //Codelity
        int s = new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 3, 7, 2});

        System.out.println(s);
    }
}
