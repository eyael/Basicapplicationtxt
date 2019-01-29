import java.util.Scanner;

public class numAdd {
    public static void main (String[] args){
    Scanner Keyboard = new Scanner(System.in);
    System.out.println("enter number");

    int num1 = Keyboard.nextInt();
    int num2 = Keyboard.nextInt();
    int num3 = Keyboard.nextInt();
    int sum =num1+num2+num3;
    System.out.println(sum);


}
}


