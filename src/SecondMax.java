import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SecondMax {
    public static void main(String[] args) {
//        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(41, 52, 23, 44, 85));

        ArrayList<Integer> numList = new ArrayList<>();
        Random rand = new Random();

        for(int i=0; i<10; i++){
            numList.add(rand.nextInt(100)+1);
        }

//        System.out.println(numList);
        secondMax(numList);

    }

    public static void secondMax(ArrayList<Integer> numList) {
        int max = 0;
        int secondMax = 0;

        for(int i:numList){
            if (i>max){
                secondMax = max;
                max = i;
            }
        }

        System.out.println("Second max is: " + secondMax +". Max is " + max);

    }
}

