import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num=scanner.nextInt();
        long n=son(num);
        System.out.println("Entered number" +n+ "is digit number");
    }
    public static long son(long n){
        int a=0;
        while(n!=0){
            n=n/10;
            a++;
        }
        return a;
    }

    }
