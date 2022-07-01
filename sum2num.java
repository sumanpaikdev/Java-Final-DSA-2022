import java.util.Scanner;
public class sum2num {
    
    public static void main(String[] args) {
        System.out.println("enter the first number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();
        System.out.println(num);
    }
}
