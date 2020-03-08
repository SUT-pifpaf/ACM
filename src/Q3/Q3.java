package Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList();

        while(input.hasNextLong())
        {
            numbers.add(input.nextLong());
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f\n" , Math.sqrt(numbers.get(i)));
        }
    }
}
