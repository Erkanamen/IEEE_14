import java.util.ArrayList;
import java.util.Scanner;
// Morgan claypool publishers -- Rajus training
public class Solution {
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		String input = keyboard.nextLine();
		String inputLines[] = input.split(" ");
		int n=0, m=0;
		//try {
			/*if (inputLines.length != 2) {
				System.exit(0);
			}
			else {*/
				n = Integer.parseInt(inputLines[0]);
				m = Integer.parseInt(inputLines[1]);
			//}
		/*}
		catch (Exception e) {
			System.exit(0);
		}*/
		if (n < 1 || n > 1000 || m < 0 || m > 100000) {
			//int z = 1/0;
            System.exit(0);
		}
		else {
			ArrayList<int[]> constraints = new ArrayList<int[]>();
			//try {
				for (int i = 0; i < m; ++i) {
					String inputConstraint = keyboard.nextLine();
					String[] inputConstraintLines = inputConstraint.split(" ");
					if (inputConstraintLines.length != 2) {
						System.exit(0);
					}
					else {
						int[] constraintI = new int[2];
						constraintI[0] = Integer.parseInt(inputConstraintLines[0]);
						constraintI[1] = Integer.parseInt(inputConstraintLines[1]);
						if (constraintI[0]<1 || constraintI[0]> n || constraintI[1]<1 || constraintI[1]>n) {
							System.exit(0);
						}
						else constraints.add(constraintI);
					}
				}
			/*}
			catch (Exception e) {
				
			}*/
			String inputProposition = keyboard.nextLine();
			String[] inputPropositionLines = inputProposition.split(" ");
			/*if (inputPropositionLines.length != n) {
				System.exit(0);
			}
			else {*/
				ArrayList<Integer> proposition = new ArrayList<Integer>();
				//try {
					for (int i = 0; i < inputPropositionLines.length; ++i) {
						int subject = Integer.parseInt(inputPropositionLines[i]);
						if (subject<0 && subject>n) System.exit(0);
						else proposition.add(subject);
					}
				/*}
				catch (Exception e) {
					System.exit(0);
				}
				if (constraints.size() == 0) {
					System.out.println("YES");
					System.exit(0);
				}
				else {*/
					for (int i = 0; i<constraints.size(); ++i) {
						if (proposition.indexOf(constraints.get(i)[0]) > proposition.indexOf(constraints.get(i)[1])) {
							System.out.println("NO");
							System.exit(0);
						}
					}
					System.out.println("YES");
				//}
			//}
		}
	}
}
