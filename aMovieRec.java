// Rishma Mendhekar
// Priority Queue/Heap

public class aMovieRec implements java.io.Serializable{

  private Movie[] aMovieRec = new Movie[120];
  private int n;

  public aMovieRec(){
  // construct heap
    n = 0; // keep track of movies in heap
  }

  public boolean isEmpty(){
    // check whether array is empty
    if (n==0){
      return true;
    } else {
      return false;
    }
  }

  public Movie findMin(){
  // find min of heap (movie with least rotten tomatoes rating)
    if (aMovieRec[0] != null){
      return aMovieRec[0];
    } else {
      return null;
    }
  }

  public void insert(Movie x){ //
    aMovieRec[n]=x;
    n++;

    if (n==2){
      if (aMovieRec[0].getrTscore()>aMovieRec[1].getrTscore()){
        swap(0,1);
      }
    }

    else if (n==3){
      if (aMovieRec[0].getrTscore()>aMovieRec[leftOrRight(0)].getrTscore()){
        swap(0,leftOrRight(0));
      }
    }   

    else if (n>3){
      int index=n-1;
      int getParent=getParent(index);
      /*First check the base condition. If the key of the parent of x is greater the key of x, swap x and it's parent. And sign index 
      equal to the value of the index of it's new postion, which is the index of its parent. When its parent itself is a left child,
      the new value equal to (index-1)/2. And when its parent itself is a right child, its new value equal to (index-2)/2.*/
      if (aMovieRec[getParent].getrTscore()>aMovieRec[index].getrTscore()){
        swap(getParent,index);
        if (isLeft(index)){
          index = (index-1)/2;
        }
        else{
          index = (index-2)/2;
        }
      }
      /*Then use while loop to swap x and its parent until it's already at the position of root or move it to the right postion, at which
      the postion that the key of x is greater than the key of its parent*/ 
      while (index>0){
        if(x.getrTscore()<aMovieRec[getParent(index)].getrTscore()){
          swap(getParent(index),index);
          if (isLeft(index)){
            index=(index-1)/2;
          }
          else{
            index=(index-2)/2;
          }
        }
        else{
          index=-1;
        }
      }
    }



    else { // if heap is not empty
      aMovieRec[n] = x; // x is in next open index
      n = n + 1; // n is incremented

      // left child = 2 * parent + 1
      // (left child - 1) / 2 = parent

      // right child = 2 * parent + 2
      // (right child - 2) / 2 = parent

      int parIndex;
      if ((n-1) % 2 == 0){ // if index of new node is even, find parent as right child
        parIndex = ((n-1) - 2) / 2 ;
      } else { // if index of new node is odd, find parent as left child
        parIndex = ((n-1) - 1) / 2;
      }

      if (x.getrTscore() < (aMovieRec[parIndex].getrTscore())){ // if x is less than parent
        int childPos = n-1; // find position of child
        while (x.getrTscore() < (aMovieRec[parIndex]).getrTscore()){ // while x < parent
          Movie parent = aMovieRec[parIndex]; // assign variable to parent
          aMovieRec[parIndex] = x; // put x in parent's original position
          aMovieRec[childPos] = parent; // put parent in original position of x
          childPos = parIndex;

          if ((parIndex) % 2 == 0){ // if index of new node is even, find parent from right child
            parIndex = (((parIndex) - 1) / 2 );

          } else { // if index of new node is odd, find parent from left child
            parIndex = (((parIndex) - 2) / 2);
          }

        }
      }
    }
  }






    public void deleteMin(){
    //First check whether the heap is empty or not. If it is empty, we are not able to delete any node. Just print out "Heap is empty."
    if (isEmpty()){
      System.out.println("Movie archive is Empty! We do not have any least rated movie!");
    }
    /*When Heap is not empty. We know the node with smallest key is always at the postion of root index=0. So we swap the node with index
    0 and the last node, then decrement the length array by 1 to exclude to mininum node. Then check whether the key of the node that we 
    just put at the index 0 is greater than the smaller key of its children. It it is, continue swap it and it's smaller child until move 
    to the right position*/
    else{
      swap(0, n-1);
      aMovieRec[n-1]=null;
      n--;
      int i=0;
      while (leftOrRight(i)!=(-1)){
        if((i>-1)&&(aMovieRec[i].getrTscore() > aMovieRec[leftOrRight(i)].getrTscore())){
          int x=leftOrRight(i);
          swap(i,leftOrRight(i));
          i = x;
        }
        else{
          i=-1;
        }
      }   
    }
  }

  //leftOrRight(w): return the key of the smaller child of node with index w.
  private int leftOrRight(int w){
    //if w in in the range of the array and the node with index w has two children, check keys of its two children, and return the index of
    //the children with smaller key.
    if ((w>-1)&&(aMovieRec[2*w+1]!=null)&&(aMovieRec[2*w+2]!=null)){
      if (aMovieRec[2*w+1].getrTscore()>aMovieRec[2*w+2].getrTscore()){
        return 2*w+2;

      }
      else{
        return 2*w+1;
      }
    }
    //if w in in the range of the array and the node with index w only one child(it must be the left child), return the index of the left child
    //of the node with index w.
    else if((w>-1)&&(aMovieRec[2*w+1]!=null)){
      return 2*w+1;
    }
    //Otherwise, return -1.
    else{
      return (-1);
    }
  }



  /* isLeft(k): if k mod 2 is not equal to 0, which means k is an odd number, return true since the left childldren have odd index.
  And return false if k mod s is equal to 0 since the nodes with even index are right children.*/
  private Boolean isLeft(int k){
    if (k%2!=0){
      return true;
    }
    else{
      return false;
    }
  }

  /*getParent(int m): if m is the index of a left child, its parent's index is (m-1)/2. And if it is a right child, the index of its parent
  is (m-2)/2. Return the index of m's parent*/
  private int getParent(int m){
    int parent;
    if (isLeft(m)){
      parent=(m-1)/2;
    }
    else{
      parent=(m-2)/2;
    }
    return parent;
  }

  //swap(a,x): swap the node with index a and index x. 
  private void swap(int a, int x){
    Movie temp;
    temp=aMovieRec[a];
    aMovieRec[a]=aMovieRec[x];
    aMovieRec[x]=temp;
  }

  public void printRecord(){
    for (int i = 0; i < n ; i++){
      System.out.println("index"+i+": "+(aMovieRec[i]).getrTscore()); // print heap
    }
  }

}
