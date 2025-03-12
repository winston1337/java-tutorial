public class Decimals {
    public static void main(String[] args) {
        double percentage = 73.5;
        System.out.println(percentage + " of percentages are made up");

        int wallet  = 20; // always use double for math calculations
        double people = 3;
        System.out.println(wallet / people);
        // if at least one of the variables in a calculation is stored as a double, the result will be a double
        //if only integeres is used, the result will be an integer even if there should be a decimal
    }
}