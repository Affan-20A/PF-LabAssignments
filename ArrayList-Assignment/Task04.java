/*TASK 4: 
Reverse the elements of an ArrayList without using any built-in reverse method.
Input: ArrayList: [1, 2, 3, 4, 5]
Output: ArrayList: [5, 4, 3, 2, 1]*/

import java.util.ArrayList;
public class Task04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int LastIndex = list.size() - 1;
        for (int i=0 ; i<LastIndex ; i++) {           
            int value = list.get(LastIndex);
            list.remove(LastIndex);
            list.add(i, value);
        }
        System.out.print("Reversed List: " + list);
    }
}