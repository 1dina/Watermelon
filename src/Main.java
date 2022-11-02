import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weight;
        Scanner in = new Scanner(System.in);
        System.out.println("How much does the watermelon weigh ?");
        weight = in.nextInt();
        if (weight<=0 || weight >100){
            while (true){
                System.out.println("Error , please enter the true value  :");
                weight = in.nextInt();
                if (weight >0&&weight<100){
                    break;
                }
            }
        }
        if (weight % 2 == 0)
            System.out.println("Yes ");
        else System.out.println("No");




    }
}