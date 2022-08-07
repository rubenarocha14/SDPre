public class Objective3Lab3{
  public static void main(String[] args){
    // create 1st, 2nd, 3rd and sum int variables
    int first, second, thrid, sum;
    first = 1 + (int)(Math.random() *6);
    second = 1 + (int)(Math.random() *6);
    thrid = 1 + (int)(Math.random() *6);
    sum = first+second+thrid;

    System.out.println(first + " + " + second + " + " + thrid + " = " + sum);
  }
}
