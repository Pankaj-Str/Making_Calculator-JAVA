package p4n;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Making_Calculator {

    public static void main(String[] arg){
        //Create var...
        char operator;
        Double number1,number2,result;

        //create an object of Scanner Class

        Scanner input = new Scanner(System.in);

        //ask user to enter operator
        System.out.println("Choose an operator : +,-,*,or / :");
        operator= input.next().charAt(0);

        //ask user to enter numbers
        System.out.println("Enter the first number :");
        number1= input.nextDouble();

        System.out.println("Enter the Second Number :");
        number2= input.nextDouble();


        switch (operator){

            //performs addition between numbers
            case '+':
                result= number1+number2;
                System.out.print(number1+"+"+number2 + "=" + result);
                break;
            //performs subtraction between numbers
            case '-':
                result=number1-number2;
                System.out.print(number1+ " - " + number2 + " = " + result);
                break;

            //performs multiplication between numbers
            case '*':
                result=number1*number2;
                System.out.println(number1 + " * "+number2 + "=" + result);
                break;

            //performs division between numbers
            case '/':
                result=number1/number2;
                System.out.println(number1 + " / "+ number2 +" = "+ result);
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
        input.close();
    }

}
