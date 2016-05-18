//each customen node includes the user name, email address, and one's wish-list
public class CustomerNode implements java.io.Serializable{
	//initialize private variables that can only accessed/changed in this file
	private String name;
	private int credit;
	private String email;
	private int key;
	private CustomerNode left;
	private CustomerNode right;
	private WatchList wish;

	//constructor
	public CustomerNode(String name0, int credit0, String email0){
		name = name0;
		credit = credit0;
		email = email0;
		left = null;
		right = null;
		wish = new WatchList();
	}

	//set the name for the node
	public void setName(String newName){
		name = newName;
	}

	//return the name of the node as a string variable
	public String getName(){
		return name;
	}

	//set the credit card number for the node
	public void setCredit(int newCredit){
		credit = newCredit;
	}

	//return the credit card number as an integer
	public int getCredit(){
		return credit;
	}

	//set the email for the node
	public void setEmail(String newEmail){
		email = newEmail;
	}

	//return the email of the node as a string variable
	public String getEmail(){
		return email;
	}

	//set the empty array of wish list
	public void setWish(WatchList newWish){
		wish = newWish;
	}

  //return the wish list as an array
	public WatchList getWish(){
		return wish;
	}

	//return the last four digit of credit card number as the key value for the node
	//key = the remainder of credit card number/10000
	public int getKey(){
		key = credit % 10000;
		return key;
	}
	//set the node pointer "next"
	public void setLeft(CustomerNode newLeft){
		left = newLeft;
	}
	public void setRight(CustomerNode newRight){
		right = newRight;
	}

	//return the node pointer left/right
	public CustomerNode left(){
		return left;
	}
	public CustomerNode right(){
		return right;
	}

}
