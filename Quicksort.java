/**
 * Quicksort
 */
public class Quicksort {
  public static void main(String[] args) {
    var quicksort = new Quicksort();

    quicksort.sort(0, quicksort.numbers.length - 1);
  }

  int[] numbers = {6,8,11,12,7,4,2,1};

  void swap(int index1, int index2) {
    int a = numbers[index1];
    numbers[index1] = numbers[index2];
    numbers[index2] = a;
  }

  void printArray() {
    for (int i : numbers) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

  void sort(int low, int high) {
    if (low > high) return;

    if (low + 1 == high) {
      if (numbers[low] > numbers[high]) swap(low, high);
      return;
    }

    var indexMiddle = low + ((high - low) / 2);

    swap(indexMiddle, high);
    var swapLeft = low;
    var swapRight = high - 1;
    var middle = numbers[high];

    while (swapLeft < swapRight) {
      if(numbers[swapLeft] < middle) {
        swapLeft++;
      }
      if(numbers[swapRight] > middle && swapRight > swapLeft) {
        swapRight--;
      }
      if(numbers[swapLeft] >= middle && numbers[swapRight] <= middle) {
        swap(swapLeft, swapRight);
      }
    }

    if (numbers[swapRight] > middle) {
      swap(swapRight, high);
    } else {
      swap(++swapRight, high);
    }


    sort(low, swapRight - 1);
    sort(swapRight + 1, high);
  }
}