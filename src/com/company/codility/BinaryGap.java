package com.company.codility;

import java.util.StringTokenizer;

/**
 * Created by jako43 on 18/01/16.
 */
//Codelity:
// https://codility.com/demo/results/trainingC4RPX8-WMT/
public class BinaryGap {

    // Correctness 80%
    // Errors:
    // 6 - got: 1, expected: 0
    // 328 - got: 3, expected: 2
    // 16 - got: 4, expected: 0
    // 1024 - got: 10, expected: 0
    // 51712 - got: 9, expected: 2
    // 20 - got: 2, expected 1

    public int solution(int N){
        int candidate = 0;
        String toBinary = Integer.toBinaryString(N);
        System.out.println("Binary Number: " +toBinary);


        StringTokenizer st = new StringTokenizer(toBinary, "1+");

        if(!st.hasMoreTokens()) return candidate;

        candidate = st.nextToken().length();

        while (st.hasMoreTokens()){
            int e = st.nextToken().length();

            if(e > candidate)
                candidate = e;
        }

        return candidate;
    }
}
