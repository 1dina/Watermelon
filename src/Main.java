import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weight;
        Scanner in = new Scanner(System.in);
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
        if (weight % 2 == 0 && weight!=2)
            System.out.println("YES ");
        else System.out.println("NO");




    }
}