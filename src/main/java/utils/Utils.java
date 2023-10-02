package utils;

import java.util.List;

public class Utils {

    public static boolean isExit(String input){

        if ("q".equalsIgnoreCase(input)) {

            System.out.println("Goodbye");
            System.exit(0);

            return true;

        }
        return false;
    }

    public static void printExitMessage(){
        System.out.println();
        System.out.println("Enter 'Q' for quit OR");
        System.out.println();
    }

    public static void printList(List<String> list){
        for(String item : list) {
            System.out.println(item);

        }
    }
}
