import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
	    SequenceReader sequence = new SequenceReader();

	    try {
			System.out.println("Enter your number");
			String str = scan.next();
			int parseCheck = Integer.parseInt(str);

			System.out.println("Enter limit");
			int limit = scan.nextInt();

			for (int i = 0; i < limit; i++) {
				System.out.println(str);
				str = sequence.read(str);
			}
		} catch (NumberFormatException e) {
	    	System.err.println("Enter integer value, please");
		} catch (InputMismatchException e) {
	    	System.err.println("Enter integer limit, please");
		}
    }
}
