public class Print 1toN {
  static void PrintAscending(int N) {
    // Base Case  
    if(N == 0) {
      return;
    }
    //Recursive call first
     PrintAscending(N-1);

  //Then print
  System.out.println(N);
  }

//Main method
public static void main(String[] args) {
  int N = 5;
  PrintAscending(N);
}
}
