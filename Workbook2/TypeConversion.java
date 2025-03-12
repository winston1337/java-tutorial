package Workbook2;

public class TypeConversion {
    public static void main(String[] args) {
        int ants = 2000;
        int purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants and " + purchasedBlocksOfCheese + " blocks of cheese");
        System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount");

        double salary = 5423.94;
        int roundedSalary = (int)salary;
        System.out.println("My Mortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + roundedSalary);
        System.out.println(487 / 32);
        int subs = 2655;
        double subPaySplit = 3.5;
        System.out.println("On YouTube, having " + subs + " members would net $" + (subs * subPaySplit) + " per month.");
        System.out.println("This would amount to $" + (subPaySplit * subs) * (12) + " dollars per year");
    }
}
