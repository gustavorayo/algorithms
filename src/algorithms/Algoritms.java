
package algorithms;

/**
 *
 * @author Rayo
 */
public class Algoritms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuickUnionWeighted qf=new QuickUnionWeighted(10);
        qf.union(4,3);
        qf.union(3,8);
        qf.union(6,5);
        qf.union(9,4);
        qf.union(2,1);
        System.out.println(qf.connected(8,9));
        System.out.println(qf.connected(5,4));
        qf.union(5,0);
        qf.union(7,2);
        qf.union(6,1);
        qf.union(7,3);
        System.out.println(qf.connected(6,8));
    }
}
