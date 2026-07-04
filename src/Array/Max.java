package Array;

import java.util.*;

public class Max {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int max = -1;

        for (int i = 0; i < arr.length; i++) {

            boolean isLargest = true;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    isLargest = false;
                    break;
                }
            }

            if (isLargest) {
                max = arr[i];
                break;
            }
        }

        System.out.println("Maximum = " + max);
    }
}