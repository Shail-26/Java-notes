import java.sql.SQLOutput;
import java.util.*;

public class cwh_problems {
    public static void main(String[] args) {
        /*
        //Problem 1
            float [] marks = {76.8f, 45.6f, 100.0f, 89.5f, 99.4f};
            float sum = 0;

            for(float element:marks) {
                sum = sum + element;
            }
        System.out.println(sum);



        //Problem 2
        float [] marks = {76.8f, 45.6f, 100.0f, 89.5f, 99.4f};
        float num = 100f;
        boolean isAnArray = false;

        for(float element:marks) {
            if(num == element) {
                isAnArray = true;
                break;
            }
        }
        if(isAnArray) {
            System.out.println("The Array is present");
        }
        else {
            System.out.println("The Array is not present");
        }


        //problem 3
        float [] marks = {76.8f, 45.6f, 100.0f, 89.5f, 99.4f};
        float sum = 0;
        for(float element:marks) {
            sum = sum + element;
        }
        System.out.println(sum/marks.length);



        //Problem 4
        int [][] mat1 = {{ 1, 2, 3 },
                         { 4, 5, 6 }};
        int [][] mat2 = {{ 1, 2, 3 },
                         { 4, 5, 6 }};
        int [][] resultant = {{ 0, 0, 0 },
                              { 0, 0, 0 }};

        for(int i =0; i<mat1.length; i++) {
            for(int j=0; j<mat1[i].length; j++) {
                System.out.format("The value for i = %d and j=%d\n", i, j);
                resultant[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for(int i=0; i<mat1.length; i++) {
            for(int j = 0; j<mat1[i].length; j++) {
                System.out.print(resultant[i][j] + " ");
                resultant[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }



        //problem 5

        int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(arr.length, 2);
        int temp;
         for(int i = 0; i<n; i++) {
             temp = arr[i];
             arr[i] = arr[l-i-1];
             arr[l-i-1] = temp;

         }

         for(int element:arr) {
             System.out.print(element + " ");
         }



        //problem 6
        int[] array = {20, 17, 45, 3999, 2};
        System.out.print("Choose what you want to find : 1) Max 2) Min\n");
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        if (S == 1) {
            int max = Integer.MIN_VALUE;
            for (int element : array) {
                if (element > max) {
                    max = element;
                }
            }
            System.out.println("The maximum element is : " + max);

        } else if (S == 2) {
            int min = Integer.MAX_VALUE;
            for (int e : array) {
                if (e < min) {
                    min = e;
                }
            }
            System.out.println("The minimum element is : " + min);
        }

         */



        //problem 7

        boolean isSorted = true;
        int [] arr = {1, 5, 7, 8, 21};
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }
    }
}
