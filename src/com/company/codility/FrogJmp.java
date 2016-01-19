package com.company.codility;

/**
 * Created by jako43 on 18/01/16.
 */
public class FrogJmp {

    // Codility
    // Correctness 100%, Performance 0% -> 44%
    // Solution: https://codility.com/demo/results/trainingJKFXS3-2U7/

    // Correctness 25%, Performance 80% -> 55%
    // Solution2: https://codility.com/demo/results/trainingJ2H5A6-UCU/

    public int solution(int X, int Y, int D) {
        return (int) Math.round((double) (Y-X)/D);
    }

    public int solution2(int X, int Y, int D) {
        int jumps = 0;
        long sum = X;

        while(sum < Y){
            jumps++;
            sum += D;
        }
        return jumps;
    }
}
