import java.util.Scanner;

public class test {
    enum Size {
        SMALL,MEDIUM,LARGE,XLARGE,XXLARGE
    }
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        information();
    }
    public static void information(){
        System.out.println("Enter your size for pants: ");
        int number = scan.nextInt();
        showSize(number);
    }
    public static void showSize(int num){
       if (num <= 20){
         Size small = Size.SMALL;
           System.out.println("your size is "+ small);
       }else if (num <=40){
         Size medium = Size.MEDIUM;
           System.out.println("your size is "+ medium);
       }else if (num <=60){
         Size large= Size.LARGE;
           System.out.println("your size is "+ large);
       }else if (num <=80){
         Size xlarge = Size.XLARGE;
           System.out.println("your size is "+ xlarge);
       }else if (num <=100){
         Size xxlarge = Size.XXLARGE;
           System.out.println("your size is "+ xxlarge);
       }else {
           System.err.println("Your number is Wrong!!!!  :(");
           information();
       }

    }

}
