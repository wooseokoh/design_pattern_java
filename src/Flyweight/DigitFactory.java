package Flyweight;

public class DigitFactory {
    private Digit[] pool = new Digit[]{
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
    };

    public Digit getDigit(int n) {
        if (pool[n] != null) {
            return this.pool[n];
        } else {
            String fileName = String.format("$d.txt", n);
            Digit digit = new Digit(fileName);
            pool[n] = digit;
            return digit;
        }
    }
}