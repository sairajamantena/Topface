
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.lang.*;
import java.util.*;

public class Exam1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<>();

		while (a > 0) {
			int rem = a % 3;
			al.add(rem);
			a = a / 3;
		}

		Collections.reverse(al);

		int sum = 0;
		for (int i = 0; i < al.size(); i++) {
			sum = sum * 10 + al.get(i);
		}

		System.out.println(sum);

	}

}
