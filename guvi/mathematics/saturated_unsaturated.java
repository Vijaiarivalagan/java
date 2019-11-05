import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    boolean flag=true;
    HashSet<Integer> arr= new HashSet<Integer>();
    while(num>0){
      arr.add(num%10);
      num/=10;
      if(arr.size()>2){
        flag=false;
        break;
      }
    }
    if(flag)
      System.out.println("Saturated");
    else
      System.out.println("Unsaturated");
  }
}

/*
You are provided with a number ’n’. Your task is to tell whether that number is saturated. A saturated number is a number which is made by exactly two digits.

Input Description:
You are given with a number n.

Output Description:
Print Saturated if it is saturated else it is Unsaturated

Sample Input :
121

Sample Output :
Saturated
*/
