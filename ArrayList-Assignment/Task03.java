/*TASK 3: 
Merge two sorted ArrayLists into one sorted ArrayList.
Input:
    List1: [1, 3, 5, 7] 
    List2: [2, 4, 6, 8]
Output: [1, 2, 3, 4, 5, 6, 7, 8]*/

import java.util.ArrayList;
public class Task03 {
	public static void main(String[] args) {
		ArrayList<Integer> List1 = new ArrayList<>();
		List1.add(1);
		List1.add(3);
		List1.add(5);
		List1.add(7);
		ArrayList<Integer> List2 = new ArrayList<>();
		List2.add(2);
		List2.add(4);
		List2.add(6);
		List2.add(8);
		ArrayList<Integer> MergedList = new ArrayList<>();
		for(int i=0 ; i<List1.size() ; i++) {
			MergedList.add(List1.get(i));
		}
		for(int j=0 ; j<List2.size() ; j++) {
			MergedList.add(List2.get(j));
		}
		MergedList.sort(null);
		System.out.println("Merged List: " + MergedList);
	}
}