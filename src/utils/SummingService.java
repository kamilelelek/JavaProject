package utils;

public class SummingService {
    public static int sumDigit(int i) {
        int digit = i;
        int sum = 0;
        while (digit > 0) {
            sum += digit % 10;
            digit /= 10;
        }
        return sum;
    }
}
