import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Task_One_Real_Tester {
    private static Task_One_Real tor = new Task_One_Real();

    public static void main(String[] args) throws IOException {
        tor.setInterval();
        //oddTest();
        printOdd();
        printEven();
        percentOfOddsFibonacci();

    }

    /**
     * Method to test Odd number that also are fibonacci numbers and match given range.
     */
    public static void oddTest() throws IOException {
        System.out.println("It's test method");
        tor.setInterval();
        ArrayList<Integer> oddsAndFibon = tor.OddsAndFibonacciInRange();

        for (int i = 0; i < oddsAndFibon.size(); i++) {
            System.out.println(oddsAndFibon.get(i));
        }
    }

    /**
     *
     * */
    public static void printOdd() {
        ArrayList<Integer> odds = tor.Odds();

        System.out.println(" print odd numbers : ");
        int sum = 0;
        for (Integer i : odds) {
            sum = sum + i;
            System.out.print(i + " ");

        }
        System.out.println("");
        System.out.println("Sum of Odd numbers in the interval is - " + sum);
    }

    /**
     *
     * */
    public static void printEven() {
        ArrayList<Integer> evens = tor.Evens();
        int sum = 0;

        Collections.sort(evens, Collections.reverseOrder());
        System.out.println("print even numbers : ");
        for (Integer i : evens) {
            sum = sum + i;
            System.out.print(i + " ");

        }
        System.out.println("");
        System.out.println("Sum of Even numbers in the interval is - " + sum);
    }

    /**
     * */
    public static void percentOfOddsFibonacci() {
        ArrayList<Integer> oddFib = tor.OddsAndFibonacciInRange();
        int[] inter = tor.getInterval();
        System.out.println("The percent of Odd fibonacci numbers is " + (oddFib.size() / (double) (inter[1] - inter[0])));


    }

    /**
     * */
    public static void percentOfEvensFibonacci() {
        ArrayList<Integer> evenFib = tor.EvensAndFibonacciInRange();
        int[] inter = tor.getInterval();
        System.out.println("The percent of Even fibonacci numbers is " + (evenFib.size() / (double) (inter[1] - inter[0])));


    }

}
