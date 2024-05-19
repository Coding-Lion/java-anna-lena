class BinaryToDec {
  public static void main(String[] args) {
    int result = fibIter(5);
    System.out.println(result);
  }

  public static int convertToDecimal(String binary) {
    int conversion = 1;
    int result = 0;

    for (int i = 1; i < binary.length(); i++) {
      if (binary.charAt(binary.length() - i) == '1') {
        result = result + conversion;
      }

      conversion = conversion * 2;
    }
    return result;
  }

  public static int fakultät(int a) {
    if (a != 1) {
      int b = a * fakultät(a - 1);
      return b;
    }

    return 1;
  }


  public static int fakultätIter(int a) {
    int result = 1;
    for (int i = a; i > 1; i--) {
      result = result * i;
    }

    return result;
  }


  public static int fib(int zahl) {
    if (zahl == 1) {
      return 1;
    }
    
    if (zahl == 0) {
      return 0;
    }
    
    if (zahl < 0){
      throw new Error("fib < 0 is not defined");
    }
    
    zahl = fib(zahl-1) + fib(zahl-2);
    
    return zahl;
  }
  
  public static int fibIter(int zahl) {
    if (zahl == 1) return 1;
    if (zahl == 0) return 0;

    int ergebniss = 1;

    int a = 0;
    int b = 1;

    for (int i = 2; i < zahl; i++) {
      a = b;
      b = ergebniss;
      ergebniss = ergebniss + a; 
    }

    return ergebniss;
  }

}
