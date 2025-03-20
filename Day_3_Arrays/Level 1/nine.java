import java.util.*;
public class nine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = input.nextInt();
        System.out.println("Enter number of coloumn : ");
        int coloumn = input.nextInt();
        
        int[][] arr2D = new int[row][coloumn];
        for(int i = 0 ; i < row; i++){
            for(int j = 0; j<coloumn;j++){
                arr2D[i][j] = input.nextInt();
            }
        }

        int[] arr1D = new int[row*coloumn];
        int index = 0;
        for(int i = 0 ; i < row; i++){
            for(int j = 0; j<coloumn;j++){
                arr1D[index++] = arr2D[i][j];
            }
        }
        System.out.println("Elements in 1D array:");
        for (int x = 0 ; x<index; x++) {
            System.out.print(arr1D[x]+ " ");
        }
    }
}
