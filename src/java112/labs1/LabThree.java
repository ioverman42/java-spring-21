package java112.labs1;

/**
 * Lab 3
 * @author iaoverman
 */
public class LabThree {
    /**
     * main method: checks number of args input
     * @param args [description]
     */
    public static void main (String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line");
        } else {
            LabThree lab3 = new LabThree();
            lab3.run(args[0]);
        }

    }

    /**
     * run method
     * @param input [description]
     */
    public void run(String input) {
        System.out.println("input: " + input);
    }
}
