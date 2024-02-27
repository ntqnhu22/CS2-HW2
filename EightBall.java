import java.util.Random;

class EightBall {
    // Some responses
    private final String[] answers = { "Yes", "No", "Maybe", "Likely" };
    private Random r;
    private Integer i; // i is not isolate anything so the problem is i

    public EightBall() {
        r = new Random();
    }

    public void shake() {
        i = r.nextInt(answers.length);
    }

    public String read() {
        return answers[i];
    }

    public static void main(String[] args) {
        EightBall b = new EightBall();

        // (1) Error occurs here - read the error message to see
        // the line of code and try to figure out why its breaking
        System.out.println(b.read());
        
        // Make a whole row of them
        EightBall[] eightballs = new EightBall[4];

        // (3) After you fix the errors, change the previous line to the one below
        // that makes a 2D grid of eightballs; then fix the rest of code below
        // EightBall[][] eightballs = new EightBall[4][8];

        for (int i = 0; i < eightballs.length; i++) {
            // (2) A second error occurs here; again, deduce why it fails and fix!
            eightballs[i].shake();
            System.out.print(eightballs[i].read() + " ");
        }
        System.out.println();

        // (4) If you finish early, try to format the printed output
        // into a table as shown below:
        // ---------------------------------------------------------
        // | No|Likely| No|Likely|Likely| Maybe| No| Maybe|
        // | Maybe| No|Likely| No| No|Likely| Yes|Likely|
        // | Yes| No|Likely|Likely|Likely| Maybe|Likely| Yes|
        // | Yes|Likely|Likely| No|Likely| Yes| Yes|Likely|
        // ---------------------------------------------------------
    }

}
