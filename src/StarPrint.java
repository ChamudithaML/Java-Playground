import java.util.Scanner;

public class StarPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number or Stars: ");
        int noOfStars = input.nextInt();

        for(int i=1; i<=noOfStars; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
