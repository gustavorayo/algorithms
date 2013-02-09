/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Rayo
 */
class QuickFind {
    private int[] i;
    public QuickFind(int n) {
        i=new int[n];
        for(int j=0; j<i.length; j++){
            i[j]=j;
        }
    }
    
    public boolean connected(int p,int q){
        return i[p] == i[q];
    }
    
    public void union(int p, int q){
        
        int pid=i[p];
        int qid=i[q];
        for(int j=0;j<i.length;j++){
            if(i[j]==qid)
            {
                i[j]=pid;
            }
        }
    }
    
    
}
