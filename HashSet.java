
import java.util.*;
class HashSet{
    public static void main(String[] args)
{ 
 Scanner scan=new Scanner(System.in); 
 Set<Integer>set=new HashSet<Integer>(); 
 int n=scan.nextInt(); 
 for(int i=0;i<n;i++) 
 { 
  set.add(scan.nextInt()); 
 } 
 System.out.println(set);
} 
