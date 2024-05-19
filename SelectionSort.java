public class SelectionSort {
  public static void main(String[] args) {
    SelectionSort selectionSort = new SelectionSort();
    selectionSort.printArray();

    selectionSort.selectionSort();

    selectionSort.printArray();

  }

  int[] zahlen = { 6, 8, 11, 3, 12, 4, 2, 1 };

  void printArray() {
    for (int i : zahlen) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

  void selectionSort() {
    int n = zahlen.length;
    for (int i = 0; i < n; i++) {
      
      int v = i;
      for (int j = i + 1; j < n; j++) {
        if (!(zahlen[v] < zahlen[j])) {
          v = j;
        }
      }
      int a = zahlen[i];
      zahlen[i] = zahlen[v];
      zahlen[v] = a;

      printArray();

      System.out.println("a");
    }
  }

}
