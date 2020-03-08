package Q1;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = Integer.parseInt(input.nextLine());
        String temp;
        int a , b;
        for (int i = 0; i < lines; i++) {
            temp = input.nextLine();
            a = Integer.parseInt(temp.substring(0 , temp.indexOf('+')));
            b = Integer.parseInt(temp.substring(temp.indexOf('+')+1));
            System.out.println(a-b);
        }
    }
}
