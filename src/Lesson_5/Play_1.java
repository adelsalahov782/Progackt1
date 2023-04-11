package Lesson_5;

public class Play_1 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        arr [5] = 5;
        int [][] matrix = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i + 7;
            
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] =  i + j;
                
            }
        }
        System.out.println();
    }
}
