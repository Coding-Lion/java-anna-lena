public class MergeSort {
  public static void main(String[] args) {
    var mergeSort = new MergeSort();
    mergeSort.printArray();
  }

  
  void printArray() {
    for (int i : numbers) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

  int[] numbers = {6,8,11,12,7,4,2,1};

}
