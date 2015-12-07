import java.util.*;
import java.io.*;
import java.math.*;

/**
 *  * Auto-generated code below aims at helping you parse
 *   * the standard input according to the problem statement.
 **/
class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // the number of temperatures to analyse
		in.nextLine();
		String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
		String[] strArray = temps.split(" ");
		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n ;i++){
			int iTemps =Integer.valueOf(strArray[i]);
			if((Math.abs(iTemps) < Math.abs(min))||(iTemps == -min && iTemps > 0)){
				min = iTemps;
			}
		}
		if(n > 0){
			System.out.println(min);
		}else{
			System.out.println("0");
		}
	}
}
