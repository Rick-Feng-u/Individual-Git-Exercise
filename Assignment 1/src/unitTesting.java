import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class unitTesting {

  private int[] numbers;
  private final static int SIZE = 7;
  private final static int MAX = 20;

  @BeforeEach
  public void setUp() throws Exception {
    numbers = new int[SIZE];
    Random generator = new Random();
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = generator.nextInt(MAX);
    }
  }
  @Test
  public void testQuickSort() {
    System.out.println("\t" + "Unsorted");
    for (Integer i : numbers) {
      System.out.println(i + " ");
    }
    long startTime = System.currentTimeMillis();

    Quicksort sorter = new Quicksort();
    sorter.sort(numbers);

    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
    System.out.println("\t" + "Sorted");
    for (Integer i : numbers) {
      System.out.println(i + " ");
    }
    System.out.println("\t" + "Time takes for Quicksort " + elapsedTime);

    if (!validate(numbers)) {
      Assertions.fail("Should not happen");
    }
    Assertions.assertTrue(true);
  }

  @Test
  public void testBubbleSort() {
    System.out.println("\t" + "Unsorted");
    for (Integer i : numbers) {
      System.out.println(i + " ");
    }
    long startTime = System.currentTimeMillis();

    BubbleSort sorter = new BubbleSort();
    sorter.bubbleSort(numbers);

    long stopTime = System.currentTimeMillis();
    long elapsedTime = stopTime - startTime;
    System.out.println("\t" + "Sorted");
    for (Integer i : numbers) {
      System.out.println(i + " ");
    }
    System.out.println("\t" + "Time takes for Bubbelsort " + elapsedTime);

    if (!validate(numbers)) {
      Assertions.fail("Should not happen");
    }
    Assertions.assertTrue(true);
  }

  private boolean validate(int[] numbers) { // this validate if the sorted array is actually sorted
    for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] > numbers[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
