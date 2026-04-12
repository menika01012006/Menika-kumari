import javax.swing.*;

public class app {

    // ===== LOGIC FUNCTIONS =====

    public static int countDigit(int number) {
        if (number == 0) {
            return 0;
        }
        return 1 + countDigit(number / 10);
    }

    public static int sumDigit(int number) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        return digit + sumDigit(number / 10);
    }

    public static int reverseDigit(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }
        int digit = number % 10;
        reverse = reverse * 10 + digit;
        return reverseDigit(number / 10, reverse);
    }

    public static int largestDigit(int number, int largest) {
        if (number == 0) {
            return largest;
        }
        int digit = number % 10;
        if (digit > largest) {
            largest = digit;
        }
        return largestDigit(number / 10, largest);
    }

    public static int secondlargestDigit(int number, int secondlargest, int largest) {
        if (number == 0) {
            return secondlargest;
        }
        int digit = number % 10;
        if (digit > largest) {
            secondlargest = largest;
            largest = digit;

        } else if (digit < largest && digit > secondlargest) {
            secondlargest = digit;
        }
        return secondlargestDigit(number / 10, secondlargest, largest);
    }

    public static String isPalindrome(int number, int reverse) {
        int reversed = reverseDigit(number, reverse);
        return (number == reversed) ? "is Palindrome" : "is not Palindrome";
    }

    public static int PowerDigit(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * PowerDigit(base, exp - 1);
    }

    public static int sumOfPowerDigit(int number, int counts) {
        if (number == 0) {
            return 0;
        }
        int digit = number % 10;
        return PowerDigit(digit, counts);
    }

    public static String isArmstrong(int number, int counts) {

        return (number == sumOfPowerDigit(number, counts)) ? "it is armstrong" : "it is not armstrong";
    }

    public static boolean isAutomorphic(int number, int square) {
        if (number == 0) {
            return true;
        }
        if (square % 10 != number % 10) {
            return false;
        }
        return isAutomorphic(number / 10, square / 10);
    }

    public static String Automorphic(int number, int square) {
        return isAutomorphic(number, square) ? "It is automorphic" : "it is not automorphic";
    }

    public static int sumUntilSingle(int number) {
        if (number <= 9) {
            return number;
        }

        return sumUntilSingle(sumDigit(number));
    }

    // ===== MAIN GUI =====

    public static void main(String[] args) {

        JFrame frame = new JFrame("Number Analyzer");

        JTextField input = new JTextField();
        JButton btn = new JButton("Analyze");
        JTextArea output = new JTextArea();

        input.setBounds(50, 50, 200, 30);
        btn.setBounds(50, 100, 100, 30);
        output.setBounds(50, 150, 300, 150);
        String[] options = {
                "Sum",
                "Count",
                "Reverse",
                "Palindrome",
                "Armstrong"
        };

        JComboBox<String> choice = new JComboBox<>(options);
        choice.setBounds(50, 90, 150, 30);

        frame.add(choice);
        btn.addActionListener(e -> {
            try {
                int number = Integer.parseInt(input.getText());
                String selected = (String) choice.getSelectedItem();

                String result = "";

                switch (selected) {
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
                        result = "Palindrome: " + isPalindrome(number, 0);
                        break;

                    case "Armstrong":
                        result = "Armstrong: " + isArmstrong(number, countDigit(number));
                        break;
                }

                output.setText(result);

            } catch (Exception ex) {
                output.setText("Enter valid number!");
            }
        });

        frame.add(input);
        frame.add(btn);
        frame.add(output);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}