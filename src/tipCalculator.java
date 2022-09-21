import java.util.Scanner;
public class tipCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //setting up scanner
        System.out.println("Welcome to tip calculator user!"); //Welcoming user to the program

        System.out.print("First, please enter the amount of people paying with you:"); //Collecting initial inputs for people, tip percent, and initial bill
        int people = s.nextInt();
        System.out.print("Secondly, enter the total bill without the tip:");
        double initialBill = s.nextDouble();
        System.out.print("Lastly, enter the tip percent you wish to tip, without the % sign:");
        int tipPercent = s.nextInt(); //End of user inputs

        double tipPercentRaw = tipPercent/100.0; //Total tip and bill with tip calculations
        double fullTip = initialBill * tipPercentRaw;
        fullTip = Math.round(fullTip * 100);  //rounding off decimal points
        fullTip /=100;
        double fullBill = initialBill + fullTip;

        double tipPerPerson = fullTip / people; //Tip and bill per person calculations
        tipPerPerson = Math.round(tipPerPerson * 100);
        tipPerPerson /= 100; //rounding off decimal points
        double totalPerPerson = fullBill / people;
        totalPerPerson = Math.round(totalPerPerson * 100); //rounding off decimal points
        totalPerPerson /=100;

        System.out.print("A bill with a tip of " + tipPercent + "% and an initial bill cost of $" + initialBill + " split among " + people + " people ");
        System.out.println("will cost a total amount of $" + fullBill + " with a tip of $" + fullTip + ".");
        System.out.println("This totals to $" + totalPerPerson + " per person, each paying $" + tipPerPerson + " of the tip.");
    }
}