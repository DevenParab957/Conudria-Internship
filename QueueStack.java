import java.util.*;

class QueueStack {

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

        Stack<Integer> s = new Stack<Integer>();

         s.push(1);

         s.push(2);

         System.out.println("Adding the removed elements inside the stack");

         System.out.println(s);

         Iterator<Integer> it = q.iterator();

         while(it.hasNext())

         {

           s.push(it.next());

         }

         

         System.out.println("Copying remaining elements from queue to stack");

         System.out.println(s);

    }

}
