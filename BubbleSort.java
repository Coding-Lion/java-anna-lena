public class BubbleSort {
  public static void main(String[] args) {
    BubbleSort bubbleSort = new BubbleSort();

    bubbleSort.printArray();

    bubbleSort.bubbleSortV3();

    bubbleSort.printArray();
  }

  int[] zahlen = { 6, 8, 11, 3, 1, 4, 2, 12 };

  void printArray() {
    for (int i : zahlen) {
      System.out.print(i + ", ");
    }
    System.out.println();
  }

  void bubbleSort() {
    for (int i = zahlen.length - 1; i > 0; i--) {
      for (int j = zahlen.length - 1; j >= zahlen.length - i; j--) {
        if (zahlen[j] < zahlen[j - 1]) {
          int v = zahlen[j];
          zahlen[j] = zahlen[j - 1];
          zahlen[j - 1] = v;
        }
      }
    }
  }

  void bubbleSortV2() {
    for (int i = zahlen.length - 1; i > 0; i--) {
      boolean switched = false;
      for (int j = zahlen.length - 1; j >= zahlen.length - i; j--) {
        if (zahlen[j] < zahlen[j - 1]) {
          int v = zahlen[j];
          zahlen[j] = zahlen[j - 1];
          zahlen[j - 1] = v;

          switched = true;
        }
      }
      if (!switched) {
        System.out.println("Abbruch bei " + i);
        break;
      }
    }
  }

  void bubbleSortV3() {
    int lower = 0;
    for (int i = 0; i < zahlen.length; i++) {
      boolean switched = false;

      for (int j = 0; j < zahlen.length - i - 1; j++) {
        if (i % 2 == 0) {
          if (zahlen[lower + j] > zahlen[lower + j + 1]) {
            int v = zahlen[lower + j];
            zahlen[lower + j] = zahlen[lower + j + 1];
            zahlen[lower + j + 1] = v;

            switched = true;
          }
        } else {
          if (zahlen[zahlen.length - j - 1 - lower ] < zahlen[zahlen.length - j - 2 - lower ]) {
            int v = zahlen[zahlen.length - j - 1 - lower ];
            zahlen[zahlen.length - j - 1 - lower ] = zahlen[zahlen.length - j - 2 - lower ];
            zahlen[zahlen.length - j - 2 - lower ] = v;
            
            switched = true;
          }
        }
      }
      printArray();

      if (i % 2 == 0) 
        lower++;

      if (!switched) {
        System.out.println("Abbruch bei " + i);
        break;
      }
    }
  }
}
