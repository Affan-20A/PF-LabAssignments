/*TASK 2: 
Find and print all duplicate elements in an ArrayList.
Input: ArrayList: [1, 2, 3, 2, 4, 5, 3, 6, 1]
Output: Duplicates: [1, 2, 3]*/

import java.util.ArrayList;
public class Task02 {
	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(2);
		List.add(4);
		List.add(5);
		List.add(3);
		List.add(6);
		List.add(1);
		List.sort(null);
		ArrayList<Integer> Duplicates = new ArrayList<>();
		for(int i=0 ; i<List.size()-1 ; i++) {
			if(List.get(i) == List.get(i+1)) {
				int unique = List.get(i);
				boolean hasAdded = false;
				for(int j=0 ; j<Duplicates.size() ; j++) {
					if(Duplicates.get(j) == unique) {
						hasAdded = true;
						break;
					}
				}
				if(hasAdded == false) {
					Duplicates.add(unique);
				}
			}
		}
		System.out.println("Duplicate Values: " + Duplicates);
	}
}