import java.util.Scanner;
public class main
{
    public static void Main(String[] args)
    {
        Scanner input = new Scanner(System.in); //creates a new scanner
        System.out.print("What is the total bill?"); //bill info
        double totalBill = input.nextDouble();
        System.out.print("What is the tip percentage as a whole number (without % symbol)?"); //percent info
        double tipPercentage = input.nextDouble();
        System.out.print("How many people are paying?"); //number of people paying
        int numberOfPeople = input.nextInt();


    }
}