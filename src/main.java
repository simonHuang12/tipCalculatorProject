import java.util.Scanner;
public class main
{
    public static void Main(String[] args)
    {
        Scanner input = new Scanner(System.in); //creates a new scanner
        System.out.print("What is the total bill?"); //bill info
        double totalBill = input.nextDouble();
        System.out.print("What is the tip percentage as a whole number (without % symbol)?"); //percent info
        double tipPercent = input.nextDouble();
        System.out.print("How many people are paying?"); //number of people paying
        int numberOfPeople = input.nextInt();

        double totalTip = totalBill * (tipPercent / 100); // calculates the tip
        totalBill += totalTip; // adds the tip to the total bill
        double totalPerPerson = totalBill / numberOfPeople; // calculates how much each person pays

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("Total Tip Amount: $%.2f\n", totalTip);
        System.out.printf("Total Bill With Tip: $%.2f\n", totalBill);
        System.out.printf("Tip Per Person: $%.2f\n", totalPerPerson);
        System.out.printf("Total Cost Per Person: $%.2f\n", totalPerPerson);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}