import java.util.*;

public class sortingArray {

 public static void main(String[] args) {
  int count, temp;

  Scanner input = new Scanner(System.in);
  System.out.print("type 1 for unit test demo, type 2 for array input ");
  int mode = input.nextInt();
  if (mode == 1) {
   System.out.println("unit testing");
  } else {
   System.out.print("Enter number of elements you want in the array: ");
   count = input.nextInt();
   int num[] = new int[count];
   System.out.println("Enter array elements:");
   for (int i = 0; i < count; i++) {
    num[i] = input.nextInt();
   }
   input.close();
  }
 }

}
