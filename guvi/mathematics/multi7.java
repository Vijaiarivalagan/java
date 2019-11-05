import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    if(num%7==0)
      System.out.println("yes");
    else
      System.out.println(num);
  }
}

/*
Given a number N, print yes if the number is a multiple of 7 else print no.
Sample Testcase :
INPUT
49
OUTPUT
yes
*/
