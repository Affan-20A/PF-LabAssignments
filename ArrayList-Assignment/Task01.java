/*TASK 1
Remove all negative numbers from an ArrayList and display the remaining elements.
Input: ArrayList: [5, -3, 8, -1, 12, -7, 4]
output: ArrayList: [5, 8, 12, 4]*/

import java.util.ArrayList;
import java.util.Scanner;
public class Task01 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.print("Enter integers (type 0 to stop):");
            int num = read.nextInt();
            if (num == 0) { 
                break;
            }
            numbers.add(num);
        }
        if(numbers.size()==0) {
        	System.out.println("No Integers Entered !");
        }
        else{
        	for(int i=0 ; i<numbers.size() ; i++) {
        		if(numbers.get(i)<0) {
        		numbers.remove(i);
        		i--;
        		}
        	}
            System.out.println(numbers);
        }
	}
}