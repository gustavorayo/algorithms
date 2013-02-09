/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritms;

/**
 *
 * @author Rayo
 */
class QuickUnion {
    int id[];
    public QuickUnion(int n) {
        id=new int[n];
        for(int i=0; i<id.length; i++){
            id[i]=i;
        }
        
    }

    void union(int p, int q) {
        id[root(p)]=root(q);
    }
    
    boolean connected(int p, int q){
        return root(p)==root(q);
    }
    
    private int root(int x){
        int root=x;
        while( id[root]!=root){
            root=id[root];
        }
        return root;
    }
    
}


