import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    List<Integer> li=new ArrayList<Integer>();
    String s=in.nextLine();
    String[] arr=s.split(" ");
    for(String i:arr){
      li.add(Integer.parseInt(i));
    }
      System.out.println(Collections.min(li));
    }
}

/*
Find the minimum among 10 numbers.
Sample Testcase :
INPUT
5 4 3 2 1 7 6 10 8 9
OUTPUT
1

*/
