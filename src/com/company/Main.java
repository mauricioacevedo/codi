package com.company;

import com.company.codility.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //binaryGap();
        //oddOccurrencesInArray();
        //cyclicRotation();
        //frogJmp();
        permMissingElem();
    }

    public static void binaryGap(){
        int s = new BinaryGap().solution(51712);

        System.out.println(s);
    }

    public static void oddOccurrencesInArray(){
        int s = new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 3, 7, 2});

        System.out.println(s);
    }

    public static void cyclicRotation(){
        int[] s = new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 6);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + "  ");
        }
    }

    public static void frogJmp(){
        int s = new FrogJmp().solution(1, 39, 1);
        System.out.println(s);
    }

    public static void permMissingElem(){
        int s = new PermMissingElem().solution(new int[]{2, 3, 1, 5});

        System.out.println(s);
    }
}
