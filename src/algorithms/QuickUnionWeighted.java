/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Rayo
 */
class QuickUnionWeighted {
    int id[];
    public QuickUnionWeighted(int n) {
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
        while( id[x]!=x){
            id[x]=id[id[x]];
            x=id[x];
        }
        return x;
    }
}
