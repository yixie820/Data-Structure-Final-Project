/*
Renkai LIu
1/04/2016
BST class in java
Implement a binary search tree class using linked Movies.
This programs allows access any movie in order of movie release date
in less than O(n) runtime.
*/

//Save the file name same as class

public class BSTDate implements java.io.Serializable{
	//fields
	//instance variables
	//have "type" for each variable
	private Movie root;
	private int n;

	//constructor
	//they are public
	//public Name of class with names of variables as parameters.public BST(){
	public BSTDate(){
		root = null;
	}

	//printTree method for BST
    public void printTree() {
		printTree2(root);
		System.out.println();
    }

    private void printTree2(Movie tree) {
		if (tree != null) {
	    	System.out.print(tree.getTitle() + " ");
            	if (tree.getLeft() != null)
	        		System.out.print("Left: " + tree.getLeft().getTitle() + " ");
            	else
                	System.out.print("Left: null ");
            	if (tree.getRight() != null)
	        		System.out.println("Right: " + tree.getRight().getTitle() + " ");
           		else
                	System.out.println("Right: null ");
	    		printTree2(tree.getLeft());
	    		printTree2(tree.getRight());
		}
    }



    //isEmptyTree(T): returns true if T is empty and false if it is not
	public boolean isEmptyTree(){
		return root == null;
	}

	//search(T, key): returns a pointer to the Movie in T that has a key that matches key
	public Movie search(int key){
		Movie temp=root;
		//if the key>than the key of temp, go left; otherwise, go right
		while (temp !=null && key!=temp.getRelease()){
			if (key<temp.getRelease()){
				temp=temp.getLeft();
			}
			else if (key> temp.getRelease()){
				temp=temp.getRight();
			}
		}
		//returns null if the Movie is not found
		if (temp==null){
			return null;
		}
		//if the Movie is found, return it
		else{
			return temp;
		}
	}

	//insert(T, p):Movie pointed to by p added in the proper location
	public void insert(Movie p){
		//if there is no Movie in the tree, add the Movie at the position of root
		if (root==null){
			root = p;
		}
		//otherwise, call the function insert2() to  check different situations to put p in the proper location
		else{
			insert2(root, p);
		}

	}

	//insert2 function to insert Movie p in the proper location
	private void insert2(Movie r, Movie p){
		//check wether the key of Movie p smaller than the key of r
		if (p.getRelease()<r.getRelease()){
			//if it is ,and there is no Movie on the left of r, add the Movie p on the left subtree of r
			if (r.getLeft()==null){
				r.setLeft(p);
			}
			//if r has a left child, call the function insert2 again
			else{
				insert2(r.getLeft(), p);
			}
		}
		//the sitiation that the key of Movie p is greater than the key of r
		else{
			if (r.getRight()==null){
				r.setRight(p);
			}
			else{
				insert2(r.getRight(), p);
			}
		}
	}

	//traverse(T):prints the contents of T in order
	public void traverse(){
		//if the root not equl to null, call the tranverse2 function
		if (root!=null){
			traverse2(root);
			System.out.println();
		}
	}
	/*tranverse2 fucntion with parameter r. When r not equl to null, go to the left,call the tranverse2 fucntion
	again with paramter r.left until we hit the Movie with the smallest key. Then print it out and go to the right,
	print the key of each Movie in order.*/
	private void traverse2(Movie r){
		if (r!=null){
			traverse2(r.getLeft());
			System.out.println("Movie: " + r.getTitle() + ";  " + "Release Date: " + r.getRelease()
				+ ";  " + "ID: " + r.getID()+ ";  " + "Rotten Tomatoes popularity score: " + r.getrTscore());
			traverse2(r.getRight());
		}
	}
	//delete(T, p):removes the Movie pointed to by p from the tree T
	public void delete(Movie p){
		//check to make sure the tree is not empty
		if (root!=null){
			//check whether root is the one we want to delete. If it is, call deleteRoot function.
			if (root.getRelease()==p.getRelease()){
				deleteRoot();
			}
			/*if root is not the one we want to delete, call the getParent function to find the parent of the Movie
			we want to delete, and then call the delete2 funtion*/
			else{
				Movie parent = getParent(p);
				delete2(parent,p);
			}
		}
	}
	// delete2 function: check different cases to delete the Movie p
	private void delete2(Movie parent, Movie p){
		//First, if the Movie we want to delete is a left child
		if (isLeft(parent,p)){
			//If it is a left child and  it does not have a left child
			if(parent.getLeft().getLeft()==null){
				/*if it does not have a right child either. So it has no child. It is a leaf. Just set its parent.left(since it is
				a leftchidl) to null.*/
				if(parent.getLeft().getRight()==null){
					parent.setLeft(null);
				}
				/*if it has a right child. So it is a Movie with single child (right child).Since it is a left child of its
				parent, set its parent.left equal to its right. So that it is removed from the tree*/
				else{
					parent.setLeft(parent.getLeft().getRight());
				}
			}
			//if it is a left child and itself has a left child
			else{
				/*if it has a left child, but does not have a right child. So it is a Movie with single child(left child). Since
				itself is a left child of its parent, set its parent.left to its left. So that it is removed from the tree*/
				if(parent.getLeft().getRight()==null){
					parent.setLeft(parent.getLeft().getLeft());
				}
				/*if it has a left child, and has a right child too. So it has two children. In this situation ,we need to find
				its successor. Call the successor funtion to get the Movie successor t and put the successor at the position of p
				by setting t.left equal to p.left, setting t.right equal to p.right and setting p's parent.left (since p is a left
				child)equal to successor. Then p is removed from the tree, and successor t goes to p's location*/
				else{
					Movie t;
					t=findSuccessor(p);
					t.setLeft(p.getLeft());
					t.setRight(p.getRight());
					parent.setLeft(t);
				}
			}
		}
		//send, if the Movie we want to delete is a right child
		else{
			//If it is a left child and  it does not have a left child
			if(parent.getRight().getLeft()==null){
				/*if it does not have a right child either. So it has no child. It is a leaf. Just set its parent.right(since
				it is a right child) to null.*/
				if(parent.getRight().getRight()==null){
					parent.setRight(null);
				}
				/*if it has a right child. So it is a Movie with single child (right child).Since it is a right child of its
				parent, set its parent.right equal to p. right. So that p is removed from the tree*/
				else{
					parent.setRight(parent.getRight().getRight());
				}
			}
			//if it is a right child and itself has a left child
			else{
				/*if it has a left child, but does not have a right child. So it is a Movie with single child(left child). Since
				itself is a right child of its parent, set its parent.right to its left. So that it is removed from the tree*/
				if(parent.getRight().getRight()==null){
					parent.setRight(parent.getRight().getLeft());
				}
				/*if it has a left child, and has a right child too. So it has two children. In this situation ,we need to find
				its successor. Call the successor funtion to get the Movie successor t and put the successor at the position of p
				by setting t.left equal to p.left, setting t.right equal to p.right and setting p's parent.right (since p is a right
				child)equal to successor. Then p is removed from the tree, and successor t goes to p's location*/
				else{
					Movie t;
					t=findSuccessor(p);
					t.setLeft(p.getLeft());
					t.setRight(p.getRight());
					parent.setRight(t);
				}
			}
		}
	}

	//getParent function to get the Movie that is the parent of the Movie we want to delete
	private Movie getParent(Movie p){
		Movie tt=root;
		if ((tt.getLeft()==null)&&(tt.getRight()==null)){
			return null;
		}
		else{
			while((tt.getLeft()!=null)&&(tt.getRight()!=null)){
				if((tt.getLeft().getRelease()!= p.getRelease())&&(tt.getRight().getRelease()!= p.getRelease())){
					if (p.getRelease()>tt.getRelease()){
						tt=tt.getRight();
					}
					else if(p.getRelease()<tt.getRelease()){
						tt=tt.getLeft();
					}
				}
				else{
					return tt;
				}
			}
			while((tt.getLeft()==null)&&(tt.getRight()!=null)){
				if(tt.getRight().getRelease()!= p.getRelease()){
					if (p.getRelease()>tt.getRelease()){
						tt=tt.getRight();
					}
					else{
						tt=null;
					}
				}
				else{
					return tt;
				}
			}
		/*if tt has only left child, if the key of its left child not equal of the key we want to delete and if the key we want to delete
		is smaller than key of tt, let tt=tt.left; otherwise let tt =null, so that it will return null*/

			while((tt.getLeft()!=null)&&(tt.getRight()==null)){
				if(tt.getLeft().getRelease()!= p.getRelease()){
					if (p.getRelease()<tt.getRelease()){
						tt=tt.getLeft();
					}
					else{
						tt=null;
					}
				}
				else{
					return tt;
				}
			}
		//otherwise, set tt==null
			return null;
		}
	}



	/*findSuccessor function: we call it only when p has two children, so we do not need to check p.right equal to null case;
	we let tht instant Movie temp equal to p, and then sent equal to temp.right. Then we check whether the new temp has a left
	child. If it does have left child(ren),go the the left children until we hit the most left one. And we set temp's parent.left
	equal to temp.right to make sure we do not loss the child of the successor(if it has one). And it the new temp does not have
	a left child, the new temp is the successor. set its parent.right equal to temp.right to preventing lossing temp's child。
	Finally we return temp to get the successor.*/
	private Movie findSuccessor(Movie p){
		Movie temp = p;
		temp=temp.getRight();
		if (temp !=null){
			if(temp.getLeft()!=null){
				while (temp.getLeft()!=null){
					temp=temp.getLeft();
				}
			getParent(temp).setLeft(temp.getRight());
			}
			else{
				getParent(temp).setRight(temp.getRight());
			}
		}
		return temp;
	}
	//delete root function to delete the root, if the key of root match the Movie we want to delete. That means we will delete root
	private void deleteRoot(){
		/*Initialize a new Movie r. If the root has two children, we need to find the successor, and move the successor to the location
		of root, let it be the new root*/
		Movie r;
		if ((root.getLeft()!=null)&&(root.getRight()!=null)){
			r=findSuccessor(root);
			r.setLeft(root.getLeft());
			r.setRight(root.getRight());
			root=r;
		}
		//If root only has right child, let the new root equal to root.right.
		else if ((root.getLeft()==null)&&(root.getRight()!=null)){
			root=root.getRight();
		}
		//If the root only has left child, let the new root equal to root.left
		else{
			root=root.getLeft();
		}
	}

	//The function isLeft to return true if p the Movie we want to delete is a left child, and return false, if it is a right child.
	private Boolean isLeft(Movie parent, Movie p){
		if (p.getRelease()<parent.getRelease()){
			return true;
		}
		else{
			return false;
		}

	}

}
