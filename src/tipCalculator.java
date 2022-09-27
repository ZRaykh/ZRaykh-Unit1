import java.util.Scanner;
import java.text.DecimalFormat;
public class tipCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); //setting up scanner
        DecimalFormat df = new DecimalFormat("0.00"); // setting up decimal format

        //Welcoming user to the program
        System.out.println("Welcome to tip calculator user!");

        //Collecting input for people paying
        System.out.print("First, please enter the amount of people paying with you:");
        int people = s.nextInt();

        //Collecting input for total bill without the tip
        System.out.print("Secondly, enter the total bill without the tip:");
        double initialBill = s.nextDouble();

        //Collecting input for tip %
        System.out.print("Lastly, enter the tip percent you wish to tip, without the % sign:");
        int tipPercent = s.nextInt();

        //Converting tip percent to decimal format
        double tipPercentRaw = tipPercent/100.0;

        //Calculating the total dollar cost of the tip, then rounding
        double fullTip = initialBill * tipPercentRaw;
        fullTip = Math.round(fullTip * 100);
        fullTip /= 100;

        //Calculating the total cost of the bill
        double fullBill = initialBill + fullTip;

        //Calculating the amount of the tip paid per person, then rounding
        double tipPerPerson = fullTip / people;
        tipPerPerson = Math.round(tipPerPerson * 100);
        tipPerPerson /=100;

        //Calculating the amount of the bill paid per person, tip included
        double totalPerPerson = fullBill / people;
        totalPerPerson = Math.round(totalPerPerson * 100);
        totalPerPerson /= 100;

        //Printing out the original inputs
        System.out.print("A bill with a tip of " + tipPercent + "% and an initial bill cost of $" + df.format(initialBill) + " split among " + people + " people ");

        //Printing the total costs of the tip and bill
        System.out.println("will cost a total amount of $" + df.format(fullBill) + " with a tip of $" + df.format(fullTip) + ".");

        //Printing what each person is paying
        System.out.println("This totals to $" + df.format(totalPerPerson) + " per person, each paying $" + df.format(tipPerPerson) + " of the tip.");
    }
}