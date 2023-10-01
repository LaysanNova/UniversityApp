package utils;

public class Utils {

    public static boolean isExit(String input){

        if ("q".equalsIgnoreCase(input)) {

            System.out.println("Goodbye");
            System.exit(0);

            return true;

        }
        return false;
    }
}
