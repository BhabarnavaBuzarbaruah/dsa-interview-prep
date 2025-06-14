package Segment Tree;
public class getSumRange{
  //Time Complexity:-O(logn),since each node split the array into two halves like in binary search
  //Space Complexity:-O(n),due to segment tree[] of size 4*n.
  public static int getSum(int arr[],int si,int sj,int qi,int qj){
    //If the query range and this segment do not overlap at all, then:
    // Either the query ends before the segment starts
    // Or the query starts after the segment ends 
    if(qi<=si || qi>=sj){
          return 0;// So we ignore this segment and return 0.
    //If this segment is completely inside the query range
      }else if(si>=qi && sj<=qj){
          return tree[i];// Use the value stored at node i in the segment tree — it already holds the sum for this range.
          //If the segment partially overlaps with the query, then:
          // We need to go deeper, check both left and right children.
      }else{
           //Find the midpoint of the segment, so we can split it into two halves.
          int mid=(si+sj)/2;
          //Go left in the segment tree:
            // Left child is at index 2*i + 1
            // It covers segment range si to mid
            // Same query range qi to qj
          int left=getSum(2*i+1,si,mid,qi,qj);
           //Go right in the segment tree:
           // Right child is at index 2*i + 2
           // It covers segment range mid+1 to sj
           // Same query range qi to qj
          int right=getSum(2*i+2,mid+1,sj,qi,qj);
          return left+right;//Add the results from both left and right — this gives the final sum for the query.
      }
  }
}
