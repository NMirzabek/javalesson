import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("X: ");
        int x=scanner.nextInt();
        System.out.print("Y: ");
        int y=scanner.nextInt();
        System.out.print("P: ");
        int p= scanner.nextInt();

        
        for (int i = x; i <= y; i++) {
            if (i%p==0){
                System.out.println("  "+i);
            }

        }
    }
}
