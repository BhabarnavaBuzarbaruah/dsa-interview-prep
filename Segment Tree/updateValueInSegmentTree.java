package SegmentTree;
public class updateValueInSegmentTree{
  //Time Complexity:-O(logn),since we only visit the nodes that cover the range where the index idx lies.
//   //Space Complexity:-O(n),due to tree[] of size 4*n.
     //Parameters:
      // i: current node index in segment tree
     // si, sj: start and end index of the range that this node covers
     // idx: index in the array that we want to update
     // diff: difference between new and old value (used to update the sum)
  public static int update(int i,int si,int sj,int idx,int diff){
       //Check if update idx is outside the current range
        //If the current segment [si,sj] does not include idx,no need to update just return;
        if(idx>sj || idx<si){
            return;
        }
        //Update current node
        //Add the diff to the current segment tree node,because it's range include the updated index.
        tree[i]+=diff;
        //If not a leaf node, go deeper
        //If this node is not a leaf, go deeper and update it's children
        //Recurse on both left and right children 
        if(si!=sj){
            int mid=(si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, diff);//Left Child
            updateUtil(2*i+2, mid+1, sj, idx, diff);//right child
        }
   }
}
