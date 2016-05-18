/*Sam Barnes
Program 4
BST
This program cretaes a BST that can do all of the regular BST functions
*/
import java.io.*;
public class CustomerBST implements java.io.Serializable{
	private CustomerNode root;
	public CustomerBST(){
		root=null; //create BST instance

	}
	public boolean isEmptyTree(){
		return root==null; //return true if root=null, false otherwise
	}
	public CustomerNode search(int key){
		return search1(root, key); //call search1 with root and key
	}
	private CustomerNode search1(CustomerNode t, int key){
		if (t==null){
			return null; //if t current node is null return null (didn't find key)
		}
		else if (key==t.getKey()){
			return t; //if you find the node with the key you are looking for return it
		}
		else if ( key <t.getKey()){
			return search1(t.left(), key); //if key you are looking for is less than
		}                                  //current node key go left
		else {
			return search1(t.right(), key); //if key not equal of less go right (it is more)
		}
	}
	public void insert(CustomerNode p){
		if (root==null){
			root=p; //if empty tree set root to p
		}
		else{
			insert2(root,p); //else call insert2
		}
	}
	private void insert2(CustomerNode t, CustomerNode p){
		if (p.getKey()< t.getKey()){
			if (t.left()==null){
				t.setLeft(p); // if key of p is ledd than t and t.left is null
			}                 //put p as t.left
			else{
				insert2(t.left(), p); //else it should see wether to go left or
			}                         //right of t.left
		}
		else{
			if (t.right()==null){
				t.setRight(p);
			}
			else{
				insert2(t.right(), p); //same idea as above
			}
		}
	}

	private void traverse1(CustomerNode t){
		if (t != null){
			traverse1(t.left());
			System.out.println(t.getKey());
			traverse1(t.right()); //call traverse on every node of the tree untill
		}                         //you reach a null pointer printing each Node on the way
	}
	public void traverse(){
		traverse1(root); //start recursive call of traverse1
	}


    public void printTree() {
	printTree2(root);
	System.out.println();
    }

    private void printTree2(CustomerNode tree) {
	if (tree != null) {
	    System.out.print(tree.getKey() + " ");
            if (tree.left() != null)
	        System.out.print("Left: " + tree.left().getKey() + " ");
            else
                System.out.print("Left: null ");
            if (tree.right() != null)
	        System.out.println("Right: " + tree.right().getKey() + " ");
            else
                System.out.println("Right: null ");
	    printTree2(tree.left());
	    printTree2(tree.right());
	}
    }
    private CustomerNode getParent(CustomerNode x){
    	CustomerNode p=root;
    	CustomerNode parent = root;
    	while (x.getKey()!=p.getKey()){
		if (p.left()==null && p.right()==null){ //if the node isn't in the BST
    		return null;
    	}
    	if (x.getKey()>p.getKey()){
    		parent=p;
    		p=p.right();
    	}
    	if (x.getKey()<p.getKey()){
    		parent=p;
    		p=p.left(); //use the same method as above to find x, but keeping
    	}               //track of the parent
    	}
    	return parent; //return the parent
    }
    private boolean isLeft(CustomerNode x, CustomerNode y){
    	return y.left()==x; //if x is y.left return true otherwise return false
    }
    private CustomerNode findSuccessor(CustomerNode x){
    	x=x.right();
    	while (x.left()!=null){
    		x=x.left();
    	}
    	return x; //find successor by going right once and left as far as possible
    }
    private void deleteRoot(CustomerNode x){
    	if (x.left()==null && x.right()==null){
    		root=null; //if root has no children set make the tree empty
    	}
    	if (x.left()==null){
    		x=x.right();
    	}
    	if (x.right()==null){
    		x=x.left(); //if root has one child set the child to root
    	}

    	else{
    		CustomerNode S=null;
    		CustomerNode r=null;
    		CustomerNode p=null;
    		S=findSuccessor(x); //find successor of x
    		p=getParent(S); //get the parent of the successor
    		r=S.right(); //get pointer to node after S (could be null, nothing to the left)
    		S.setLeft(x.left()); //set the left of the successor to left of x
    		if (S.right()!=null){
    			S.setRight(x.right()); //if S.right is not null set S.right to x.right
    		}
    		if (p!= root){
    			p.setLeft(r); //if the parent of S is not the root set the left
    		}                 //of p to S.right otherwise it isnt nessesary
    		root=S; //set new root
    	}
    }
    public void delete(CustomerNode x){
    	if (x!=null){
    	if (x==root){
    		deleteRoot(x); //call deleteRoot if node being deleted is a root
    	}
    	else{
    		delete2(x); //call delete2 in all other cases
    	}
    	}
    }
    private void delete2(CustomerNode x){
    	CustomerNode y=null;
    	y=getParent(x);
    	if (y!=null){
    	if (x.left()==null && x.right()==null){
    		if (isLeft(x,y)){
    			y.setLeft(null);
    		}
    		else{
    		y.setRight(null); //if x has no children set it's parent's right or
    		}                 //left child (whichever x is) to null
    	}
    	else if (x.left()==null){
    	    if (isLeft(x,y)){
    			 getParent(x).setLeft(x.left());
    		}
    		else{
    			getParent(x).setRight(x.left());
    		}
    	}
    	else if (x.right()==null){
    		 if (isLeft(x,y)){
    			 getParent(x).setLeft(x.right());
    		}
    		else{
    			getParent(x).setRight(x.right());
    		} //if x has one child set it's parent's
    	}                                   //right or left (whichever x is) to x.left
    	else{
    		CustomerNode S=null;
    		CustomerNode r=null;
    		CustomerNode p=null;
    		S=findSuccessor(x);
    		p=getParent(S);
    		r=S.right(); //same as in deleteRoot
    		if (x.right()==S){
    			S.setLeft(x.left());
    		}
    		else{
    		S.setLeft(x.left());
    		S.setRight(x.right());
    		p.setLeft(r);
    		} //set the left of the parent to the right of S since there is no
    		  //left of S and S is the left of p unless p of S is x
    		if (isLeft(x,y)){
    			y.setLeft(S); //if x is the left of it's parent set successor to g.left
    		}
    		else{
    			y.setRight(S); //if x is right of it's parent set successor to g.right
	    		}
	    	}

	    }
    }
}
