import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Computation computation;

        if (shouldMultiply())
            computation = new Multiplication();
        else
            computation = new Addition();

        int[] arguments = getArguments();
        String kindOfCalculation = computation instanceof Multiplication ? "multiplication" : "addition";
        System.out.println("Result of " + kindOfCalculation + " = " + computation.compute(arguments[0], arguments[1]));
    }

    private static boolean shouldMultiply() {
        String multiplicationOrAddition;
        do {
            System.out.println("multiPlication or addiTion ?");
            multiplicationOrAddition = scanner.nextLine();
        }
        while ( !(multiplicationOrAddition.equalsIgnoreCase("p") || multiplicationOrAddition.equalsIgnoreCase("t")) );

        return multiplicationOrAddition.equalsIgnoreCase("p") ? Boolean.TRUE : Boolean.FALSE;
    }

    private static int[] getArguments() {
        System.out.println("Enter first argument: ");
        int x = scanner.nextInt();
        System.out.println("Enter second argument: ");
        int y = scanner.nextInt();
        return new int[]{x, y};
    }
}
