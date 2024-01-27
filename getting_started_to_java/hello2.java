import javax.swing.*;

// Making progress in variables in this file.
public class hello2 {
    public static void main(String args[]) {
        int num1; int num2; int sum; int sub; int mul; float div; // Declaring variables
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("1. Number: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("2. Number: "));

        sum = num1 + num2;
        mul = num1 * num2;
        div = num1 / num2;
        sub = num1 - num2;

        JOptionPane.showMessageDialog(null, "Addition: " + sum, "Addition Summary", -1);
        JOptionPane.showMessageDialog(null, "Multiplication: " + mul, "Multiplication Summary", -1);
        JOptionPane.showMessageDialog(null, "Division: " + div, "Division Summary", -1);
        JOptionPane.showMessageDialog(null, "Subtraction: " + sub, "Subtraction Summary", -1);
    }
}


// Make sure you don't have public class again. (You can't compile.)
class string_vars {
    public static void main(String[] args) {
        // We have seperate ways to declare String type variables:
        String name1 = "Egeeew";
        String name2 = new String("egg");
        System.out.println("Name 1 is: " + name1 + "\nName 2 is: " + name2);

        // We can do addition in String type variables like other languages:
        String fullname = name1 + " " + name2;
        System.out.println("\nFull Name is: " + fullname);

        // What about... Strings with one character: char
        // We have seperate ways again to declare char type variables:
        char letter = 'A'; // We mostly use '' with it.
        System.out.println("\nLetter is: " + letter);

        // But sometimes we want a special character: Writing "Æ" to the console
        char hello = '\u00C6'; // This is the "Unicoded" form of "Æ".
        // You can find these by searching for Unicode characters: http://unicode.org
        System.out.println("\nLet's say hello to this: " + hello);
    }
}

class boolean_vars {
    public static void main(String[] args) {
        // Boolean is a data type that has two values: true or false. [Maybe you know it as '1' or '0' :) ]
        boolean question1 = true;
        boolean question2 = false;

        System.out.println("Your first question was: " + question1 + "\nYour second question was: " + question2);

        /* Now, let's start comparisons. (It's necessary to understand boolean...)
            if, else if, else
            '&&' => and
            '||' => or
            '==' => equals
            '!=' => not equal
            '!'  => not
            '<=' => less than or equal to
            '>=' => more than or equal to
            '>'  => more than
            '<'  => less than
        */
            // Let's make a quiz program:
        int userAnswer = Integer.parseInt(JOptionPane.showInputDialog("What is the summary of '5 + 3': "));
        int realAnswer = 8;

        if (userAnswer == realAnswer) {
            JOptionPane.showMessageDialog(null, "Correct! The answer was 8.", "Information Message", 1);
        } // If user makes it 'TRUE', it will say this.

        else {
            JOptionPane.showMessageDialog(null, "Wrong! The correct answer was 8.", "Information Message", 0);
        } // Else situation, that means user did the question 'FALSE'. Message will say this.
    }
}

class double_vars {
    public static void main(String args[]) {
        // double type variables is for real numbers, like 5 = 5.0
        double num1 = 5.6;
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Say a real number: "));
        double sum = num1 + num2;

        JOptionPane.showMessageDialog(null, num1 + "+" + num2 + "=" + sum, null, -1);

        // what about static double numbers? => declaring Pi with 'final' statement
        // 'final' statement makes the variable static.
        final double pi = 3.141592653589793;
        JOptionPane.showMessageDialog(null, "Pi is: " + pi, null, 1);
        // When you try to change the value of the 'pi' variable with like pi *= 2, the program will cause an error.
    }
}

class bytes {
    public static void main(String args[]) {
        // Byte is a statement for characters. (Maybe you know decimal, hex, etc.)
        int example = 7; // 7's byte value is: 00000000000000000000000000000111
        /*
         * We can make operations in bytes with some operators:
         *  &   => AND
         *  |   => OR
         *  ^   => XOR
         *  ~   => NOT
         *  >>  => 1 byte right
         *  <<  => 1 byte left
         */
        example = example << 1;
        System.out.println(example);
        example = ~example;
        System.out.println(example);
    }
}
