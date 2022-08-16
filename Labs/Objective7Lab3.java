public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    int max = 20;

    while (counter<=max){
      System.out.print(counter);
      if (counter%2 == 0){
        System.out.print(" is even\n");
      }
      else{
        System.out.print(" is odd\n");
      }
      counter = counter +1;
    }
  }
}
