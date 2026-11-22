import java.util.Scanner;

public class LoopingActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int highest = 0;
        int lowest = 0;


        for (int i = 1; i < 11; i++) {
            System.out.println("Enter number " + ": ");
            int num = sc.nextInt();

            if (i == 1) {
                highest = num;
                lowest = num;

            } else {
                if (num > highest) highest = num;
                if (num < lowest) lowest = num;

                System.out.println("Highest: " + highest + "\nLowest: " + lowest);
            }




        }
    }
}
