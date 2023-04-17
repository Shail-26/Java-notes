import java.util.*;

public class arrays {
    public static void main(String args[]) {
        System.out.println("Enter the number of digits you wanna try : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];
        
        for(int i = 0 ; i < numbers.length; i++) {
            if((i+1)==1) {
                System.out.print("Enter the "+(i+1)+"st digit : ");
            }
            else if((i+1)==2) {
                System.out.print("Enter the "+(i+1)+"nd digit : ");
            }
            else if((i+1)==3) {
                System.out.print("Enter the "+(i+1)+"rd digit : ");
            }
            else {
                System.out.print("Enter the "+(i+1)+"th digit : ");
            }
            numbers[i] = sc.nextInt();
        }

       boolean isAscending = true;
        
       for(int i = 0; i < numbers.length - 1; i++) {
        if(numbers[i] > numbers[i+1]) {
            isAscending = false;
        }
       }
       if(isAscending) {
        System.out.println("The array is sorted in Ascending order");

       }
       else {
        System.out.println("The array is not sorted in Ascending order");
       }
    }
}