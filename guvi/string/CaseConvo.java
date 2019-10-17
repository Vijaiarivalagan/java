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
          a[i]=Character.toLowerCase(a[i]);
        else if(t==2)
          a[i]=Character.toUpperCase(a[i]);
      }
      for(char i:a)
      System.out.print(i);
    }
}
