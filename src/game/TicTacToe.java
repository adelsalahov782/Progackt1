//package game;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class TicTacToe {
//    Scanner scanner;
//    char[][] table;
//    Random random;
//
//    public TicTacToe() {
//        scanner = new Scanner(System.in);
//        random = new Random();
//        table = new char[3][3];
//    }
//
//    public void playGame() {
//        System.out.println("Game is started!");
//        initTable();
//    }
//
//    public void initTable() {
//        for (int x = 0; x < table.length; x++) {
//            for (int y = 0; y < table[x].length; y++) {
//
//
//            }
//
//        }
//    }
//
//    public void printTable() {
//        for (int x = 0; x < table.length; x++) {
//            for (int y = 0; y < table[x].length; y++) {
//                System.out.print(table[x][y] + "");
//            }
//            System.out.println();
//
//        }
//    }
//    public void turnHuman(){
//        int x, y;
//        System.out.println("Enter x and y [0...2]");
//        x = scanner.nextInt();
//        y = scanner.nextInt();
//
//    }
//    public boolean isCellValid(int x, int y){
//        if (x < 0 || x > 2 || y < 0 || y > 2){
//            return false;
//        }
//        return table [x][y] == ".";
//
//    }
//}
