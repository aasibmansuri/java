//prime number
public class practical5 {

    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("The first 10 prime numbers are:");

        while (count < 10) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
