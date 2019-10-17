import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      char a[]=s.toCharArray();
      int t=in.nextInt();
      int p=in.nextInt();
      for(int i=p;i<a.length;i+=p){
        if(t==1)
          a[i-1]=Character.toLowerCase(a[i-1]);
        else if(t==2)
          a[i-1]=Character.toUpperCase(a[i-1]);
      }
      for(char i:a)
      System.out.print(i);
    }
}
