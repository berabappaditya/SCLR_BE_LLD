import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Student
 */
public class Student {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i < n; i++){
        //     System.out.print(arr[i] + " ");
        // }
       
        List<String> name = List.of("Alice", "Bob", "Charlie", "David", "Eve");


        ArrayList<String> names = new ArrayList<>(name);
        names.add("Frank");
        
        // Convert all names to uppercase
        // ArrayList<String> upperCaseNames = names.stream()
        //     .map(String::toUpperCase)
        //     .collect(Collectors.toCollection(ArrayList::new));
       // System.out.println(upperCaseNames);
         names.stream().map((x)->{
        System.out.println(x+"2");
        return x+"1";}).forEach((x)->{});;
      //  names.stream().forEach(x->System.out.println(x+"'s"));

      Subject math = new Subject("Math", 3, 10, 100);
      math.credits=20;
      System.out.println(math.credits);
       
    }
    
}