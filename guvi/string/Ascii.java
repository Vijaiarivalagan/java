import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
      	String s=in.nextLine();
      	int sum=0;
      	for(int i=0;i<s.length();i++){
        	sum+=(int)s.charAt(i);
        }
      System.out.println(sum);
    }
}
