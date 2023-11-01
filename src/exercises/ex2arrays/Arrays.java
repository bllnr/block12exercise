package exercises.ex2arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Arrays {

    public static final Scanner input = new Scanner(in);

    /* The input functions */
    public static int[] getArrayOfIntsFromUser() {

        out.println("Input 5 integers (space between, then enter) > ");
        String user_input = input.nextLine();
        String[] int_input = user_input.split(" ");
        int[] int_array = new int[int_input.length];
        for (int i = 0; i < int_input.length; i++) {
            int_array[i] = Integer.parseInt(int_input[i]);
        }
        return int_array;
    }

    public static int getValueFromUser() {
        out.println("Input a value to find > ");
        return input.nextInt();
    }

    /* The output functions */
    public static void printIndexToUser(int the_index, int the_value) {
        // TODO
    }

    public static void printNotFoundToUser(int the_value) {
        // TODO
    }

    public static void printResultToUser(int the_index, int the_value) {
        // TODO
    }


    /* The Algorithm */
    public static int findIndexOfValue(int[] a_list, int a_value) {
        // TODO
        int index = -1;
        for (int i : a_list) {
            if (i == a_value) {
                index = i;
            }
        }
        return index;
    }

    /* The top-level behavior */
    public static void listBasicsProgram() {
        // INPUT
        int[] theList = getArrayOfIntsFromUser();
        int theValue = getValueFromUser();
        // PROCESS
        int theIndex = findIndexOfValue(theList, theValue);
        // OUTPUT
        printResultToUser(theIndex, theValue);
    }


    /* Required way to make module executable */
    public static void main(String[] args) {
        listBasicsProgram();
    }
}
