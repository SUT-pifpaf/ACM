package Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        ArrayList<Integer> num1_r = a(num1);
        ArrayList<Integer> num2_r = a(num2);

        for (int i = 0; i < num1_r.size(); i++)
        {
            for (int j = 0; j < num2_r.size(); j++)
            {
                System.out.println(num1_r.get(i) + " " + num2_r.get(j));
            }
        }
    }

    public static ArrayList<Integer> a(int num)
    {
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 1; i <= num; i++)
        {
            if (num % i == 0)
            {
                r.add(i);
            }
        }
        return r;
    }
}
