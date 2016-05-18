//test function for BSTDate
public class TestBSTDate implements java.io.Serializable{
    public static void main(String[] args){
	BSTDate a = new BSTDate();
	System.out.println("isEmptyTree = " + a.isEmptyTree());
	Movie xNode = new Movie("Ajfjfjf", 20030213, 183759, 8.3f);
	Movie yNode = new Movie("Bjdjdkfdk", 20010930, 395712, 9.0f);
	Movie zNode = new Movie("Cjdjkdoe", 20020330, 8395783, 5.6f);
	Movie kNode = new Movie("Dkckmfdkm", 20100302,294768,7.8f);
	Movie aNode = new Movie("Ejdjdjk", 20110305,392847, 9.3f);
	Movie bNode = new Movie("Fkdkdnd", 20140403,395768, 6.7f);
	Movie cNode = new Movie("Gkdkdmd", 20150220,392869, 7.9f);
	Movie dNode = new Movie("Hkdkdfnd", 19950324,998572, 6.8f);
	Movie mNode = new Movie("Indndkd", 19680525,204860, 5.9f);
	Movie nNode = new Movie("Jdkdmd", 19920318,234234,8.8f);
	Movie oNode = new Movie("Kkdmdkd", 19870319,345723, 6.7f);
	a.insert(xNode);
	a.insert(yNode);
	a.insert(zNode);
	a.insert(kNode);
	a.insert(cNode);
	a.insert(nNode);
	a.insert(oNode);
	a.traverse();
	a.printTree();
	a.insert(mNode);
	a.insert(dNode);
	System.out.println("search");
	System.out.println(a.search(20030213).getTitle());
	System.out.println(a.search(20150220).getTitle());
	System.out.println(a.search(19920318).getTitle());
	System.out.println(a.search(19870319).getTitle());
	a.traverse();
	a.printTree();
	System.out.println("searchFor 20030213");
	System.out.println(a.search(20030213).getTitle());
	System.out.println("delete20030213");
	a.delete(xNode);
	a.traverse();
	a.printTree();
	System.out.println("delete19680525");
	Movie qq=a.search(19680525);
	a.delete(mNode);
	a.traverse();
	a.printTree();
	System.out.println("delete19920318");
	a.delete(nNode);
	a.traverse();
	a.printTree();
	System.out.println("insert20110305");
	a.insert(aNode);
	a.traverse();
	a.printTree();
	System.out.println("insert20140403");
	a.insert(bNode);
	a.traverse();
	a.printTree();
	System.out.println("delete20020330");
	a.delete(zNode);
	a.traverse();
	a.printTree();
	System.out.println("isEmptyTree = " + a.isEmptyTree());
    }
}