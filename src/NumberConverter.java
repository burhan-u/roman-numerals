public class NumberConverter implements RomanNumeralGenerator {
    private final String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private final int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String generate(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Invalid number. Number must be in the range 1 - 3999.");
        }

        StringBuilder romanNumeral = new StringBuilder();

        int i = 0;

        while (number > 0 && i < value.length) {
            if (number >= value[i]) {
                romanNumeral.append(symbol[i]);
                number -= value[i];
            } else {
                i++;
            }
        }

        return romanNumeral.toString();
    }
}
