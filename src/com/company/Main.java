package com.company;

import com.company.codility.BinaryGap;
import com.company.codility.CyclicRotation;
import com.company.codility.OddOccurrencesInArray;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //binaryGap();
        //oddOccurrencesInArray();
        cyclicRotation();
    }

    public static void binaryGap(){ //Codelity
        int s = new BinaryGap().solution(51712);

        System.out.println(s);
    }

    public static void oddOccurrencesInArray(){ //Codelity
        int s = new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 3, 7, 2});

        System.out.println(s);
    }

    public static void cyclicRotation(){
        int[] s = new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 6);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + "  ");
        }
    }
}
