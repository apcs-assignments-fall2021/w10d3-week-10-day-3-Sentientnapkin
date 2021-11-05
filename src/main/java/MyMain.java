import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int count = 0;
        for (String s : list) {
            if (s.toLowerCase().startsWith("a")) {
                count++;
            }
        }
        return count;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for(int i = 0;i<list.size();i++){
            list.set(i,list.get(i)+"!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int integer : list1) {
            for (int value : list2) {
                if (integer == value) {
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int count = 0;
        for (Integer i : list) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer>list= new ArrayList<>();
        for(int x:arr){
            list.add(x);
        }
        return list;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> total = new ArrayList<>();
        for(int x:list1){
            total.add(x);
        }
        for(int x:list2){
            total.add(x);
        }
        int between = 0;
        for(int i = 0;i<total.size();i++){
            for(int j = 0;j<i;j++){
                if (total.get(i)<total.get(j)){
                    between = total.get(j);
                    total.set(j,total.get(i));
                    total.set(i,between);
                }
            }
        }
        return total;
    }



    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 3, 5, 7, 9}));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 4, 6, 8, 10}));
        System.out.println(MyMain.merge(list1,list2));
    }
}
