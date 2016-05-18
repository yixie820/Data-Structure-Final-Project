//test code for CustomerBST function
public class TestCustomerBST implements java.io.Serializable {
	public static void main(String[] args){
		CustomerBST a = new CustomerBST();
		System.out.println("isEmptyTree = " + a.isEmptyTree());
		CustomerNode xNode = new CustomerNode("Jane", 123456789, "email");
		CustomerNode yNode = new CustomerNode("Joe", 934567890,"email");
		CustomerNode zNode = new CustomerNode("Jack", 223452234,"email");
		CustomerNode kNode = new CustomerNode("Jill", 934567856,"email");
		CustomerNode aNode = new CustomerNode("Abe", 123456788,"email");
		CustomerNode mNode = new CustomerNode("Mike", 723452237,"email");
		CustomerNode nNode = new CustomerNode("Nick", 734567857,"email");
		CustomerNode oNode = new CustomerNode("Otis", 734562222,"email");
		a.insert(xNode);
		a.insert(yNode);
		a.insert(zNode);
		a.insert(kNode);
		a.traverse();
		a.printTree();
		a.insert(mNode);
		a.insert(nNode);
		System.out.println("search");
		System.out.println(a.search(6789).getName());
		System.out.println(a.search(7890).getName());
		System.out.println(a.search(2234).getName());
		System.out.println(a.search(7856).getName());
		a.traverse();
		a.printTree();
		System.out.println("searchFor 7890");
		System.out.println(a.search(7890).getName());
		System.out.println("delete6789");
		a.delete(xNode);
		a.traverse();
		a.printTree();
		System.out.println("delete2237");
		a.delete(mNode);
		a.traverse();
		a.printTree();
		System.out.println("delete7857");
		a.delete(nNode);
		a.traverse();
		a.printTree();
		System.out.println("insert6788");
		a.insert(aNode);
		a.traverse();
		a.printTree();
		System.out.println("insert2222");
		a.insert(oNode);
		a.traverse();
		a.printTree();
		System.out.println("delete2234");
		a.delete(zNode);
		a.traverse();
		a.printTree();
		System.out.println("isEmptyTree = " + a.isEmptyTree());
	    }
}
