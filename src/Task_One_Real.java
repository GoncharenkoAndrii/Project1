import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task_One_Real {
    private int[] interval = new int[2];
    /**
     * Method to determine the interval
     * */
    public int[] setInterval() throws IOException {


        System.out.println("Input the interval lower border ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Integer lower = Integer.parseInt(line);
        interval[0] = lower ;

        System.out.println("Input the interval upper border ");
        String lin = br.readLine();
        Integer upper = Integer.parseInt(lin);
        interval[1] = upper ;


        return interval;
    }
    public int[] getInterval() {
        return interval;
    }
    /**
     * Method to determine if number is even - so called "PARNE 4UCJLO"
     * */
    private boolean IsEven (int num){
        return (num%2==0);
    }
    /**
     * Method to determine if number is odd - so called "HEIIAPHE 4UCJLO"
     * */
    private boolean IsOdd (int num){
        return (num%2!=0);
    }
    /**
     * Method to get n-th fibonacci number
     * */
    private static int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    /**
     * Method, that returns all the fibonacci numbers in a given range
     * Gets : lower border and higher border - int numbers that set range
     * */
    public ArrayList<Integer> fibonacciInRange(){
        ArrayList<Integer> fibonacciInRange = new ArrayList<>();
        for (int i = 0;i<interval[1];i++){
            int currentNum = fibonacci(i);
            if ((currentNum<=interval[1]) &&
                    (currentNum>=interval[0])){
                fibonacciInRange.add(currentNum);
            }
            if (currentNum > interval[1])break;
        }
        return fibonacciInRange;


    }
    /**
     * Method to get all the odd numbers from the list
     * Gets: List of integers
     * */
    public ArrayList<Integer> Odds(){
        ArrayList<Integer> odds = new ArrayList<>();
        if (interval[0] < interval[1]){
        for (int i = interval[0];i<=interval[1];i++){
            if ( IsOdd(i) ) odds.add(i);
        }
        }

        return odds;
    }
    /**
     * Method to get all the even numbers from the list
     * Gets: List of integers
     * */
    public ArrayList<Integer> Evens(){
        ArrayList<Integer> evens = new ArrayList<>();

        if (interval[0] < interval[1]){
            for (int i = interval[0];i<=interval[1];i++){
                if ( IsEven(i) ) evens.add(i);
            }
        }

        return evens;
    }
    /**
     * Method to get all the odd numbers from given interval, which are also a fibonacci numbers
     * Get : list of integers, borders of an interval
     * */
    public ArrayList<Integer> OddsAndFibonacciInRange(){

        ArrayList<Integer> initOdds = Odds();
        ArrayList<Integer> fibonacciCur = fibonacciInRange();
        ArrayList<Integer> outputOdds = new ArrayList<Integer>();

        for (int i =0; i < initOdds.size();i++){

            if (fibonacciCur.contains(initOdds.get(i)) ){outputOdds.add(initOdds.get(i));}
        }

        return outputOdds;

    }
    /**
     * Method to get all the even numbers from given interval, which are also a fibonacci numbers
     * Get : list of integers, borders of an interval
     * */
    public ArrayList<Integer> EvensAndFibonacciInRange(){

        ArrayList<Integer> initEvens = Evens();
        ArrayList<Integer> fibonacciCur = fibonacciInRange();
        ArrayList<Integer> outputEvens = new ArrayList<Integer>();

        for (int i =0; i < initEvens.size();i++){

            if (fibonacciCur.contains(initEvens.get(i)) ){outputEvens.add(initEvens.get(i));}
        }

        return outputEvens;

    }



}
