
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i ++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

        // for (int i = 0; i <= 50; i++) {
        //     String result = "";
        //     if (i % 3 == 0) result += "Fizz";
        //     if (i % 5 == 0) result  += "Buzz";

        //     System.out.println(result.isEmpty() ? i : result);
        // }
    }
}