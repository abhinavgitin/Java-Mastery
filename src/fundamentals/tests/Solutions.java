package fundamentals.tests;

import java.util.*;
class Solutions {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {4,5,6,7,8,10,12,13};
        mergeArrays(a,b);
    }
    public static void mergeArrays(int a[], int b[]) {
        int length_a = a.length;
        int length_b = b.length;
        int total_length = length_a + length_b;

        int[] allarr = new int[total_length];

        for (int i = 0; i < length_a; i++) {
            allarr[i] = a[i];
        }
        for (int j = 0; j < length_b; j++) {
            allarr[length_a + j] = b[j];
        }

        Arrays.sort(allarr);

        for (int i = 0; i < length_a; i++) {
            a[i] = allarr[i];
        }
        for (int i = 0; i < length_b; i++) {
            b[i] = allarr[length_a + i];
        }
        for (int i = 0; i < length_a; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i < length_b; i++) {
            System.out.print(b[i]+" ");
        }
    }
}

