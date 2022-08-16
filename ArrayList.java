import java.util.*;
class ArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> ar = new ArrayList();

        for(int i=0;i<n;i++)

        {

            ar.add(sc.nextInt());

        }

        System.out.println(ar);

    }

}
