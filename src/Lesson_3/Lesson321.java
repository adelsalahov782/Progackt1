package Lesson_3;

import java.util.Scanner;

public class Lesson321 {
    public static void main(String[] args) {
        // Task 1 перевернуть текст
        Scanner sc = new Scanner(System.in);
//        String text = sc.nextLine();
//        char [] chars = text.toCharArray();
//        String reserse = "";
//        for (int i = text.length(); i >=1; i-- ) {
//            reserse += chars[i];
//        }
//
//        System.out.println(reserse);

        // Task 2

//        String email = sc.nextLine();
//        char [] chars = email.toCharArray();
//        for (int i = 0; i < chars.length; i++){
//            System.out.println(chars[i]);
//            if ('@' != (chars[i])) {
//                System.out.println(" no @");
//                return;
//            }
//
//        }

        String email = sc.nextLine();
        //System.out.println(email.indexOf('@'));
        if (email.indexOf('@') == -1){
            System.out.println("Your email is not correct");
            return;
        }

        // Task.3
         String [] split = email.split("@");
        if (split.length !=2){
            System.out.println("Your email is not correct. You have 2 '@' ");
            return;
        }

        String partBeforedog = split[0];
        String partAeforedog = split[1];
        if (partBeforedog.startsWith(".") || partAeforedog.endsWith(".")){
            System.out.println(" не верно");
        }
        if (partBeforedog.startsWith(".") || partAeforedog.endsWith(".")){
            System.out.println();
        }
    }
}
