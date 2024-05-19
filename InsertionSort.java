public class InsertionSort {
  public static void main(String[] args) {
    InsertionSort insertionSort = new InsertionSort();
    insertionSort.printArray();

    insertionSort.insertionSort();

    insertionSort.printArray();

  }

  int[] zahlen = {6,8,11,3,12,4,2,1};

  void printArray() {
    for (int i : zahlen) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

  void insertionSort() {
    int n = zahlen.length;
    for(int i=1; i < n; i++ ){
      int v = zahlen[i];
      int j;
      for (j = i; ((j>0) && (zahlen[j-1] > v)); j--) {
        zahlen[j] = zahlen[j-1];
      }
      zahlen[j] = v;
    }
  }
}
