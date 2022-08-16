import java.util.*;
class Queue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> q =new LinkedList<Integer>();

        q.add(1);

        q.add(2);

        q.add(3);

        q.add(4);

        q.add(5);

        q.add(6);

        System.out.println("Queue after adding elements");

        System.out.println(q);

        q.remove(1);

        q.remove(2);

        System.out.println("Queue after removing elements");

        System.out.println(q);

Queue<Integer> q2 =new LinkedList<Integer>();

         q2.add(1);

         q2.add(2);

         System.out.println("Removed elements from queue are");

         System.out.println(q2);

         Iterator<Integer> it = q.iterator();

         while(it.hasNext())

         {

           q2.add(it.next());

         }

         

         System.out.println("Copying remaining elements from queue to another queue");

         System.out.println(q2);

    }
 }

