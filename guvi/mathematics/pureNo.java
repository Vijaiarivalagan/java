import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int sum=0;
    while(num>0){
      int rem=num%10;
      sum+=rem;
      num/=10;
    }
    if(sum%3==0)
      System.out.println("Yes");
    else
      System.out.println("Not");
  }
}

/*
You are given a task to tell whether the number is pure or not. A pure number is a number whose sum of digits is multiple of 3.

O(1) time and O(1) space

Input Description:
You are given a number n.

Output Description:
Print Yes if it is pure else Not

Sample Input :
13

Sample Output :
Not
*/
