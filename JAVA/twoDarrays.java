import java.util.*;

public class twoDarrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];
        
        //input 
        //rows
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        } 
        System.out.println("The transverse matrix is : ");
        for(int j = 0; j < cols; j++) {
            for(int i = 0; i<rows; i++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}

        