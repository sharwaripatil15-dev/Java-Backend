package Operators;

public class Logical {
    public static void main(String[] args) {
    
      // && operator
      System.out.println((4 > 3) && (7 > 6)); // true
      System.out.println((4 > 3) && (7 < 6)); // false

      // || operator
      System.out.println((4 < 3) || (7 > 6)); // true
      System.out.println((4 > 3) || (7 < 6)); // true
      System.out.println((4 < 3) || (7 < 6)); // false

      // ! operator
      System.out.println(!(4 == 3)); // true
      System.out.println(!(4 > 3)); // false
  }
}
