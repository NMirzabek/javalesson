import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=scanner.nextInt();
        for (int i = 1; i <=14 ; i++) {
            System.out.println((n*i)+" ");
        }

    }
}
