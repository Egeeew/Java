// For app-like view
import javax.swing.JApplet;

// For windowed messages
import javax.swing.JOptionPane;

// For BufferedReader (Input)
import java.io.*;
// '*' means everything

class welcome_to_java {
    public static void main(String args[]) {
        // Printing to console
        System.out.println("Here's the classic: Hello World!");

        // Showing windowed messages
        JOptionPane.showMessageDialog(null, "I'm the true language you've waited for years...", "Hey You!", 1);
        /* messageType parameters:
            0  : x             (JOptionPane.ERROR_MESSAGE)
            1  : i             (JOptionPane.INFORMATION_MESSAGE)
            2  : !             (JOptionPane.WARNING_MESSAGE)
            3  : ?             (JOptionPane.QUESTION_MESSAGE)
            -1 : Default(Void) (JOptionPane.PLAIN_MESSAGE)
        */
    }
}

public class getting_warm extends JApplet {
    public void paint(Graphics app){
        app.drawString("Welcome.", 10, 10);
    }
}


// Input and print app
class still_welcome_file {
    public static void main(String[] args) throws IOException {
        BufferedReader pop = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What's your name: ");
        String name = new String(pop.readLine()); // First variable in Java!
        System.out.println("\nHello " + name + "!");
        pop.close();
    }
}

// Input and Windowed message
class this_is_getting_out_of_hand {
    public static void main(String args[]) {
        String name = JOptionPane.showInputDialog("What's your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!", "Hello Message", 1);
        System.exit(0);
    }
}