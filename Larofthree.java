import java.util.Scanner;
public class Larofthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=scanner.nextInt();
        System.out.println("enter the second number");
        int num2=scanner.nextInt();
        System.out.println("enter the third number");
        int num3=scanner.nextInt();
        if(num1>num2){
            if(num1>num3){
                System.out.println("first number is the largest number");
            }else{
                System.out.println("second number is the hifhest number");
            }
        }else if(num2>num1){
            if(num2>num3){
                System.out.println("second number is the highest number");
            }else{
                System.out.println("third digit is the highest number");
            }
        }
        scanner.close();    
    }
    
}

