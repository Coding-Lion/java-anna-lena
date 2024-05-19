import java.util.Arrays;
import java.util.LinkedList;

public class Tuerme {
  static Integer[] start = { 1, 2, 3, 4, 5 };

  public static void main(String[] args) {
    Tuerme tuerme = new Tuerme();
    tuerme.a = new LinkedList<>(Arrays.asList(start));
    tuerme.sortieren();
  }

  LinkedList<Integer> a = new LinkedList<>();
  LinkedList<Integer> b = new LinkedList<>();
  LinkedList<Integer> c = new LinkedList<>();

  void sortieren() {
    
  }
}
