import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colour = sc.nextLine();
        switch(colour){
             case "red":
        System.out.println(1);
        break;
        case "green":
        System.out.println(2);
        break;
         case "black":
        System.out.println(3);
        break;
        }
       
        
    }
}
