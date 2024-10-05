import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ll = new Scanner(System.in);
        int n = ll.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        combination(arr, n, new ArrayList<>(),0);
    }
    public static void combination(int[] arr, int n, List<Integer> emp,int f) {
        if (n == 0) {
            System.out.println(emp);
            return;
        }
        for (int i = f; i < arr.length ; i++) {
                if (arr[i]>n){
                    continue;
                }
                emp.add(arr[i]);
               combination(arr, n-arr[i],emp,i);
                emp.remove(emp.size()-1);
        }
    }
}