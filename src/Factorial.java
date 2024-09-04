import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give a Number: ");
        int number = input.nextInt();
        int sum=1;

        for(int i=0; i<number; i++){
            System.out.print(number-i);
            sum = sum * (number-i);
            if(i<number-1){
                System.out.print("x");
            }
        }
        System.out.println(" = "+sum);
    }
}