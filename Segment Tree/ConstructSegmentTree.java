package SegmentTree;
public class ConstructSegmentTree{
  //Declare the segment tree[] that store all node values(Segment sums of arr[])
  static int tree[];
  //Recursive function that builds the segment tree
  //1.arr:-> original array
  //2.sti:-> index in segment tree
  //3.start,end:-> (current segment range in arr[])
  public class int buildST(int arr[],int tree[],int start, int end,int sti){
       //Base Case:-If segment has only one element
       if(start==end){
         //Copy that element to tree[sti](leaf node)
         tree[sti]=arr[start];
         //Return the value to parent node.
         return tree[sti];
       }
     //Find the middle point to divide the array into two parts
      int mid=(start+end)/2;
    //Left Subtree
    //Recurse on left half:- start to mid
    //2*sti+1 is the index of left child in tree
    int left=buildST(arr,tree,start,mid,2*sti+1);
    //Right Subtree
    //Recurse on right half:-mid+1 to end
    //2*sti+2 is the index of right child in tree
    int right=buildST(arr,tree,mid+1,end,2*sti+2);
    //Merge Step:-
    tree[sti]=left+right;//store the sum of left right children in current node
    return tree[sti];//return the value of current segment sum to parent node.
  }
  public static void main(String args[]){
    //Initialize arr[]  
    int arr[]={1,2,3,4,6,7,8};
    int n=arr.length;//length of arr[]
    //Initialize tree[] of size n*4
    tree[]=new int[n*4];
    //Call buildST method
    System.out.println(buildST(arr,tree,0,n-1,0));
    //Print tree[]
    for(int i=0;i<tree.length;i++){
      System.out.print(tree[sti]+" ");
    }
  }
}
