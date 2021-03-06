//test code for BSTID
public class TestBSTID implements java.io.Serializable{
    public static void main(String[] args){
	BSTID a = new BSTID();
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
	System.out.println(a.search(183759).getTitle());
	System.out.println(a.search(395712).getTitle());
	System.out.println(a.search(8395783).getTitle());
	System.out.println(a.search(294768).getTitle());
	a.traverse();
	a.printTree();
	System.out.println("searchFor 183759");
	System.out.println(a.search(183759).getTitle());
	System.out.println("delete183759");
	a.delete(xNode);
	a.traverse();
	a.printTree();
	System.out.println("delete204860");
	a.delete(mNode);
	a.traverse();
	a.printTree();
	System.out.println("delete234234");
	a.delete(nNode);
	a.traverse();
	a.printTree();
	System.out.println("insert392847");
	a.insert(aNode);
	a.traverse();
	a.printTree();
	System.out.println("insert395768");
	a.insert(bNode);
	a.traverse();
	a.printTree();
	System.out.println("delete8395783");
	a.delete(zNode);
	a.traverse();
	a.printTree();
	System.out.println("isEmptyTree = " + a.isEmptyTree());
    }
}
