import javax.swing.*;

public class app {

    // ===== LOGIC FUNCTIONS =====

    public static int countDigit(int number) {
        if (number == 0) return 0;
        return 1 + countDigit(number / 10);
    }

    public static int sumDigit(int number) {
        if (number == 0) return 0;
        return (number % 10) + sumDigit(number / 10);
    }

    public static int multiplyDigit(int number) {
        if (number == 0) return 1;
        return (number % 10) * multiplyDigit(number / 10);
    }

    public static int reverseDigit(int number, int reverse) {
        if (number == 0) return reverse;
        return reverseDigit(number / 10, reverse * 10 + number % 10);
    }

    public static String isPalindrome(int number) {
        return (number == reverseDigit(number, 0)) ? "Yes" : "No";
    }

    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    public static int sumOfPowerDigit(int number, int count) {
        if (number == 0) return 0;
        return power(number % 10, count) + sumOfPowerDigit(number / 10, count);
    }

    public static String isArmstrong(int number) {
        return (number == sumOfPowerDigit(number, countDigit(number))) ? "Yes" : "No";
    }

    public static boolean isAutomorphic(int number, int square) {
        if (number == 0) return true;
        if (number % 10 != square % 10) return false;
        return isAutomorphic(number / 10, square / 10);
    }

    public static String automorphic(int number) {
        return isAutomorphic(number, number * number) ? "Yes" : "No";
    }

    public static int sumUntilSingle(int number) {
        if (number <= 9) return number;
        return sumUntilSingle(sumDigit(number));
    }

    public static String isSpy(int number) {
        return (sumDigit(number) == multiplyDigit(number)) ? "Yes" : "No";
    }

    //  STRONG NUMBER
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int sumFactorialDigit(int number) {
        if (number == 0) return 0;
        return factorial(number % 10) + sumFactorialDigit(number / 10);
    }

    public static String isStrong(int number) {
        return (number == sumFactorialDigit(number)) ? "Yes" : "No";
    }

    // ⭐PERFECT NUMBER
    public static int sumOfDivisors(int number, int i) {
        if (i == number) return 0;
        if (number % i == 0)
            return i + sumOfDivisors(number, i + 1);
        return sumOfDivisors(number, i + 1);
    }

    public static String isPerfect(int number) {
        return (number == sumOfDivisors(number, 1)) ? "Yes" : "No";
    }

    // ===== GUI =====

    public static void main(String[] args) {

        JFrame frame = new JFrame("Number Analyzer");
        frame.setSize(520, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Number Analyzer Tool");
        title.setBounds(130, 10, 300, 30);
        title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));

        JLabel inputLabel = new JLabel("Enter Number:");
        inputLabel.setBounds(50, 60, 120, 25);

        JTextField input = new JTextField();
        input.setBounds(180, 60, 200, 30);

        String[] options = {
                "All",
                "Sum",
                "Count",
                "Reverse",
                "Palindrome",
                "Armstrong",
                "Automorphic",
                "Spy",
                "Strong",
                "Perfect"
        };

        JComboBox<String> choice = new JComboBox<>(options);
        choice.setBounds(50, 110, 150, 30);

        JButton btn = new JButton("Analyze");
        btn.setBounds(220, 110, 120, 30);

        JTextArea output = new JTextArea();
        output.setEditable(false);
        output.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 14));

        JScrollPane scroll = new JScrollPane(output);
        scroll.setBounds(50, 180, 380, 220);

        btn.addActionListener(e -> {
            try {
                int number = Integer.parseInt(input.getText());
                String selected = (String) choice.getSelectedItem();
                String result = "";

                switch (selected) {

                    case "All":
                        result =
                                "Sum: " + sumDigit(number) + "\n" +
                                "Count: " + countDigit(number) + "\n" +
                                "Reverse: " + reverseDigit(number, 0) + "\n" +
                                "Palindrome: " + isPalindrome(number) + "\n" +
                                "Armstrong: " + isArmstrong(number) + "\n" +
                                "Automorphic: " + automorphic(number) + "\n" +
                                "Spy: " + isSpy(number) + "\n" +
                                "Strong: " + isStrong(number) + "\n" +
                                "Perfect: " + isPerfect(number);
                        break;

                    case "Sum":
                        result = "Sum: " + sumDigit(number);
                        break;

                    case "Count":
                        result = "Count: " + countDigit(number);
                        break;

                    case "Reverse":
                        result = "Reverse: " + reverseDigit(number, 0);
                        break;

                    case "Palindrome":
                        result = "Palindrome: " + isPalindrome(number);
                        break;

                    case "Armstrong":
                        result = "Armstrong: " + isArmstrong(number);
                        break;

                    case "Automorphic":
                        result = "Automorphic: " + automorphic(number);
                        break;

                    case "Spy":
                        result = "Spy: " + isSpy(number);
                        break;

                    case "Strong":
                        result = "Strong: " + isStrong(number);
                        break;

                    case "Perfect":
                        result = "Perfect: " + isPerfect(number);
                        break;
                }

                output.setText(result);

            } catch (Exception ex) {
                output.setText("Enter valid number!");
            }
        });

        frame.add(title);
        frame.add(inputLabel);
        frame.add(input);
        frame.add(choice);
        frame.add(btn);
        frame.add(scroll);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}