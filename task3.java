import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num= scanner.nextInt();
        int s=0;
        for (int i = 1; i<=num ; i++) {
            s=s+i;
        }
        System.out.println("Result: "+s);

    }
}
