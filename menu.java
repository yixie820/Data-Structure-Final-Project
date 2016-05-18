import java.util.Scanner;
import java.io.*;

public class menu {

	public static void main(String []args){

		CustomerBST Customers = null;
		BSTDate MovieDates = null;
		aMovieRec MovieHeap = null;
		BSTID MovieID = null;

		// check if serialization has already occured: test to see if files exist

		// BSTDate
		File dateBST = new File("dateBST.txt");
		System.out.println("new file declared");
		if (dateBST.exists() && !dateBST.isDirectory()){
			System.out.println("File exists");
			// if file exists, deserialize

			try{
	    FileInputStream fileIn3 = new FileInputStream("dateBST.txt"); // new file input stream
	    ObjectInputStream in3 = new ObjectInputStream(fileIn3); // new object input stream
			MovieDates = (BSTDate) in3.readObject(); // assign contents of file to variable
			in3.close(); // close object input stream
			fileIn3.close(); // close file input stream

			System.out.println("BSTDate 'MovieDates' created");

			}
		  catch(IOException i)
		  {
		    i.printStackTrace();
		    return;
		  }catch(ClassNotFoundException c) // prevent class not found error from stopping code
		  {
		    System.out.println("Class not found");
		    c.printStackTrace();
		    return;
		  }

		} else{ // create new movie date BST
			System.out.println("Movie date file didn't exist.");
			MovieDates = new BSTDate();
		}

		// BSTID
		File idBST = new File("idBST.txt");
		System.out.println("new file declared");
		if (idBST.exists() && !idBST.isDirectory()){
			System.out.println("File exists");
			// if file exists, deserialize

			try{
	    FileInputStream fileIn4 = new FileInputStream("idBST.txt"); // new file input stream
	    ObjectInputStream in4 = new ObjectInputStream(fileIn4); // new object input stream
			MovieID = (BSTID) in4.readObject(); // assign contents of file to variable
			in4.close(); // close object input stream
			fileIn4.close(); // close file input stream

			System.out.println("BSTID 'MovieID' created");

			}
		  catch(IOException i)
		  {
		    i.printStackTrace();
		    return;
		  }catch(ClassNotFoundException c)
		  {
		    System.out.println("Class not found");
		    c.printStackTrace();
		    return;
		  }

		} else{ // create new movie ID BST
				System.out.println("MovieID file didn't exist.");
				MovieID = new BSTID();
		}

		// Movie heap
		File movHeap = new File("movHeap.txt");
		System.out.println("new file declared");
		if (movHeap.exists() && !movHeap.isDirectory()){ // if file exists, deserialize
			System.out.println("File exists");
			try{
	    FileInputStream fileIn1 = new FileInputStream("movHeap.txt"); // new file input stream
	    ObjectInputStream in1 = new ObjectInputStream(fileIn1); // new object input stream
			MovieHeap = (aMovieRec) in1.readObject(); // assign contents of file to variable
			in1.close(); // close object input stream
			fileIn1.close(); // close file input stream
			System.out.println("MovieRec 'MovieHeap' created");
			}
		  catch(IOException i)
		  {
		    i.printStackTrace();
		    return;
		  }catch(ClassNotFoundException c)
		  {
		    System.out.println("Class not found");
		    c.printStackTrace();
		    return;
		  }
		} else{ // create new movie heap, add movies
			System.out.println("Movie Heap didn't exist.");
			MovieHeap = new aMovieRec();

			Movie PulpFiction = new Movie("Pulp Fiction", 19940814, 1, 94);
			MovieDates.insert(PulpFiction);
			MovieID.insert(PulpFiction);
			MovieHeap.insert(PulpFiction);
			Movie TheRing = new Movie("The Ring", 20021018, 2, 55);
			MovieDates.insert(TheRing);
			MovieID.insert(TheRing);
			MovieHeap.insert(TheRing);
			Movie ParentTrap = new Movie("Parent Trap", 19980720, 3, 64);
			MovieDates.insert(ParentTrap);
			MovieID.insert(ParentTrap);
			MovieHeap.insert(ParentTrap);
			Movie BackToTheFuture = new Movie("Back To The Future", 19850703, 4, 96);
			MovieDates.insert(BackToTheFuture);
			MovieID.insert(BackToTheFuture);
			MovieHeap.insert(BackToTheFuture);
			Movie TheAvengers = new Movie("The Avengers", 20120504, 5, 87);
			MovieDates.insert(TheAvengers);
			MovieID.insert(TheAvengers);
			MovieHeap.insert(TheAvengers);
			Movie Psycho = new Movie("Psycho", 19600908, 6, 70);
			MovieDates.insert(Psycho);
			MovieID.insert(Psycho);
			MovieHeap.insert(Psycho);
			Movie Totoro = new Movie("Totoro", 19930507, 7, 75);
			MovieDates.insert(Totoro);
			MovieID.insert(Totoro);
			MovieHeap.insert(Totoro);
			Movie TheGodfather = new Movie("The Godfather", 19720324, 8, 97);
			MovieDates.insert(TheGodfather);
			MovieID.insert(TheGodfather);
			MovieHeap.insert(TheGodfather);
			Movie Zootopia = new Movie("Zootopia", 20160304, 9, 83);
			MovieDates.insert(Zootopia);
			MovieID.insert(Zootopia);
			MovieHeap.insert(Zootopia);
			Movie InsideOut = new Movie("Inside Out", 20150619, 10, 85);
			MovieDates.insert(InsideOut);
			MovieID.insert(InsideOut);
			MovieHeap.insert(InsideOut);
			Movie BlackSwan = new Movie("Black Swan", 20101217, 11, 80);
			MovieDates.insert(BlackSwan);
			MovieID.insert(BlackSwan);
			MovieHeap.insert(BlackSwan);
			Movie Oz = new Movie("The Wizard of Oz", 19390825, 12, 81);
			MovieDates.insert(Oz);
			MovieID.insert(Oz);
			MovieHeap.insert(Oz);
			Movie Vertigo = new Movie("Vertigo", 19580621, 13, 84);
			MovieDates.insert(Vertigo);
			MovieID.insert(Vertigo);
			MovieHeap.insert(Vertigo);
			Movie Frank = new Movie("Frankenstein", 19311121, 14, 74);
			MovieDates.insert(Frank);
			MovieID.insert(Frank);
			MovieHeap.insert(Frank);
			Movie Charlie = new Movie("Charlie and the Chocolate Factory", 20050715, 15, 67);
			MovieDates.insert(Charlie);
			MovieID.insert(Charlie);
			MovieHeap.insert(Charlie);
			Movie Shining = new Movie("The Shining", 19800523, 16, 89);
			MovieDates.insert(Shining);
			MovieID.insert(Shining);
			MovieHeap.insert(Shining);
			Movie Tiny = new Movie("Tiny Furniture", 20120330, 17, 63);
			MovieDates.insert(Tiny);
			MovieID.insert(Tiny);
			MovieHeap.insert(Tiny);
			Movie Silver = new Movie("Silver Lingings Playbook", 20121225, 18, 78);
			MovieDates.insert(Silver);
			MovieID.insert(Silver);
			MovieHeap.insert(Silver);
			Movie April = new Movie("Enchanted April", 19920405, 19, 74);
			MovieDates.insert(April);
			MovieID.insert(April);
			MovieHeap.insert(April);
			Movie Train = new Movie("The Arrival of a Train", 18951228, 20, 79);
			MovieDates.insert(Train);
			MovieID.insert(Train);
			MovieHeap.insert(Train);

		}

		// Customer BST

		File cBST = new File("cBST.txt");
		System.out.println("new file declared");
		if (cBST.exists() && !cBST.isDirectory()){
			// if file exists, deserialize
			System.out.println("File exists");
			try{
	    FileInputStream fileIn2 = new FileInputStream("cBST.txt"); // new file input stream
	    ObjectInputStream in2 = new ObjectInputStream(fileIn2); // new object input stream
			Customers = (CustomerBST) in2.readObject(); // assign contents of file to variable
			in2.close(); // close object input stream
			fileIn2.close(); // close file input stream

			System.out.println("CustomerBST 'Customer' created");
			}
		  catch(IOException i)
		  {
		    i.printStackTrace();
		    return;
		  }catch(ClassNotFoundException c)
		  {
		    System.out.println("Class not found");
		    c.printStackTrace();
		    return;
		  }

		} else{ // create new customer bst
			System.out.println("CustomerBST didn't exist.");
			Customers = new CustomerBST();

			CustomerNode xNode = new CustomerNode("Jane", 123456789, "Jane.@email");
			CustomerNode yNode = new CustomerNode("Joe", 934567890,"Joe.@email");
			CustomerNode zNode = new CustomerNode("Jack", 223452234,"Jack.@email");
			CustomerNode kNode = new CustomerNode("Jill", 934567856,"Jill.@email");
			CustomerNode aNode = new CustomerNode("Abe", 123456788,"Abe.@email");
			CustomerNode mNode = new CustomerNode("Mike", 723452237,"Mike.@email");
			CustomerNode nNode = new CustomerNode("Nick", 734567857,"Nick.@email");
			CustomerNode oNode = new CustomerNode("Otis", 734562222,"Otis.@email");
			Customers.insert(xNode);
			Customers.insert(yNode);
			Customers.insert(zNode);
			Customers.insert(kNode);
			Customers.insert(nNode);
			Customers.insert(mNode);
			Customers.insert(aNode);
			Customers.insert(oNode);

		}
        //There are many repeated ideas used, like the ones that operate options menus
        //or the code used to stop non integers from erroring the code. These will only be
        //commented the first time they appear

		Scanner readerS = new Scanner(System.in); //string scanner
		Scanner reader = new Scanner(System.in); //int scanner

		System.out.println("");
		System.out.println("Welcome to Netflix!");

		boolean mainloop=true; //set mainloop to true so it runs initially
		while (mainloop==true){ //loop to run code over and over until user wants to quit
			mainloop=false; //so that loop doesn't restart unless told to
			System.out.println(""); //below all the options will be displayed
			System.out.println("Would you like to access as an administrator or a customer?");
			System.out.println("Enter 1 if you are an administrator");
			System.out.println("Enter 2 if you are a customer");
			System.out.println("Enter 3 if you want to exit");
			System.out.print("Number(1-3): ");
			while(!reader.hasNextInt()){ //while the next line does not have an int
				System.out.println("Please enter a valid integer from 1-3!!!	"); //error message
				reader.nextLine(); //go to the next line (new input from user)
			}
			int n=reader.nextInt(); //create n equal to the integer entered by user
			while (n!=1&& n!=2&& n!=3){ //if the n is not a valid integer
				System.out.println(""); //ask to enter a valid number
				System.out.println("Please enter a valid number from 1-3.");
				System.out.print("Number(1-3): ");
				while(!reader.hasNextInt()){ //won't error for not integers
					System.out.println("Please enter a valid integer from 1-3!!!	");
					reader.nextLine();
				}
				n=reader.nextInt(); //set n to the int, in case it is valid and needed
			} //all menus have the same structure
			//admin
			if (n==1){ //if the user enters 1 for the first option
				boolean adminloop=true; //same idea as mailoop, initialize as true
				while(adminloop==true){ //while the user wants to stay in admin section
					adminloop=false; //set to false to loop ends unless told otherwise
					System.out.println("");
					System.out.println("Enter 1 to access customer information");
					System.out.println("Enter 2 to access movie archive");
					System.out.println("Enter 3 to return to the main menu");
					System.out.println("Enter 4 to exit");
					System.out.print("Number(1-4): ");
					while(!reader.hasNextInt()){
						System.out.println("");
						System.out.println("Please enter a valid integer from 1-4!!!	");
						reader.nextLine();
					}
					int a=reader.nextInt();
					while (a!=1&& a!=2&& a!=3&&a!=4){
						System.out.println("");
						System.out.println("Please enter a valid number from 1-4.");
						System.out.print("Number(1-4): ");
						while(!reader.hasNextInt()){
							System.out.println("Please enter a valid integer from 1-4!!!	");
							reader.nextLine();
						}
						a=reader.nextInt();
					}
					if (a==1){
						System.out.println("");
						System.out.println("Enter 1 to access an already existed customer node");
						System.out.println("Enter 2 to add a new customer(node)");
						System.out.print("Number(1-2): ");
						while(!reader.hasNextInt()){
							System.out.println("Please enter a valid integer from 1-2!!!	");
							reader.nextLine();
						}
						int c=reader.nextInt();
						while (c!=1&& c!=2){
							System.out.println("");
							System.out.println("Please enter number from 1-2.");
							System.out.print("Number(1-2): ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid integer from 1-2!!!	");
								reader.nextLine();
							}
							c=reader.nextInt();
						}
						if (c==1){
							//access the customer node, maybe have another menu asking
							//what the user wants to change about the node
							System.out.println("");
							System.out.println("Enter the credit card number of the customer node you want to access:");
							while(!reader.hasNextInt()){ //same idea as above, so that non integers dont error the code
								System.out.println("Please enter a valid credit card number. It should be 9-digit integer.");
								reader.nextLine(); //go to the next line
							}
							int num = reader.nextInt();
							CustomerNode currentCustomer = Customers.search(num % 10000); //search for the customer requested
							while (currentCustomer==null){ //to make sure that the customer actually exists
								System.out.println("");
								System.out.println("The customer with this credit card number does not exist.");
								System.out.println("Please enter a valid credit card number (9-digit).");
								while(!reader.hasNextInt()){ //make sure that an intiger is entered
									System.out.println("Please enter a valid credit card number. It should be 9-digit integer.");
									reader.nextLine();
								}
								num = reader.nextInt();
							    currentCustomer = Customers.search(num % 10000); //search for the node entered
							}

							System.out.println(""); //print out all of the requested information
							System.out.println("Below is the customer information you want to access:");
							System.out.println("Name: " + currentCustomer.getName());
							System.out.println("Credit card number: " + currentCustomer.getCredit());
							System.out.println("Email: " + currentCustomer.getEmail());
							System.out.println("Movie list: ");
							currentCustomer.getWish().printMovies(); //prints the customer wish list
							System.out.println("");

							System.out.println("Do you want to change/delete this customer information? (Yes/No)"); //if the user wants to change the customer node
							String decide = readerS.nextLine(); //new reder needed for string data type
							while (decide.equals("Yes") == false && decide.equals("No") == false){ //get input until Yes or No is said
								System.out.println("");
								System.out.println("Please enter a valid answer(Yes/No)");
								decide=reader.nextLine();
							}
							if (decide.equals("Yes") == true){
									System.out.println("");
									System.out.println("Enter 1 if you want to delete this customer information");
									System.out.println("Enter 2 if you want to change this customer information");
									System.out.print("Number(1-2): ");
									while(!reader.hasNextInt()){
										System.out.println("Please enter a valid integer from 1-2!!!	");
										reader.nextLine();
									}
									int cus = reader.nextInt();
									while (cus!=1&& cus!=2){
										System.out.println("");
										System.out.println("Please enter a valid number from 1-2.");
										System.out.print("Number(1-2): ");
										while(!reader.hasNextInt()){
											System.out.println("Please enter a valid integer from 1-2!!!	");
											reader.nextLine();
										}
										cus=reader.nextInt();
									}
									if (cus == 1){
										Customers.delete(currentCustomer); //delete the node the customer chose to delete
										System.out.println("");
										System.out.println("The customer "+currentCustomer.getName()+" has been deleted."); //confirmation statement
									}
									else if (cus == 2){
										System.out.println("");
										System.out.println("Enter 1 to change this customer name");
										System.out.println("Enter 2 to change this customer credit card number");
										System.out.println("Enter 3 to change this customer email address");
										System.out.print("Number(1-3): ");
										Boolean changeInfo=true;
										while (changeInfo==true){
											changeInfo=false;
											while(!reader.hasNextInt()){
												System.out.println("Please enter a valid integer from 1-3!!!	");
												reader.nextLine();
											}
											int change = reader.nextInt();
											while (change!=1&& change!=2&& change!=3){
												System.out.println("");
												System.out.println("Please enter a valid number from 1-3 to change information of this customer.");
												System.out.print("Number: ");
												while(!reader.hasNextInt()){
													System.out.println("Please enter a valid integer from 1-3!!!	");
													reader.nextLine();
												}
												change=reader.nextInt();
											}
											if (change == 1){
												System.out.println("");
												System.out.println("Please enter the new customer name:"); //take in new name
												String name = readerS.nextLine();
												currentCustomer.setName(name); //set the customer node's new name
												System.out.println("Do you want to change other information of this customer? (Yes/No)");
												System.out.println("If Yes, enter number from 1-3 to choose what to change.");
												decide = readerS.nextLine();
												while (decide.equals("Yes") == false && decide.equals("No") == false){
													System.out.println("");
													System.out.println("Please enter a valid answer (Yes/No)");
													decide=reader.nextLine();
												}
												if (decide.equals("Yes") == true){
													changeInfo=true;
													System.out.println(""); //display menu since it wouldn't be displayed otherwise on the loop
													System.out.println("Enter 1 to change this customer name");
													System.out.println("Enter 2 to change this customer credit card number");
													System.out.println("Enter 3 to change this customer email address");
													System.out.println("Number(1-3): ");
												}
											}
											else if (change == 2){
												System.out.println("");
												System.out.println("Please enter the new customer credit card number (9-digit):");
												while(!reader.hasNextInt()){
													System.out.println("Please enter a valid credit card number. It should be a 9-digit integer.");
													reader.nextLine();
												}
												int credit = reader.nextInt(); //take in customer credit card number
												currentCustomer.setCredit(credit); //change customer credit card number
												System.out.println("Do you want to change other information of this customer? (Yes/No)");
												System.out.println("If Yes, enter number from 1-3 to choose what to change.");
												decide = readerS.nextLine();
												while (decide.equals("Yes") == false && decide.equals("No") == false){
													System.out.println("");
													System.out.println("Please enter a valid answer (Yes/No)");
													decide=reader.nextLine();
												}
												if (decide.equals("Yes") == true){
													changeInfo=true;
													System.out.println("");
													System.out.println("Enter 1 to change this customer name");
													System.out.println("Enter 2 to change this customer credit card number");
													System.out.println("Enter 3 to change this customer email address");
													System.out.print("Number(1-3): ");
												}
											}
											else if (change == 3){
												System.out.println("");
												System.out.println("Please enter the new customer email address:");
												String email = readerS.nextLine(); //take in the new email
												currentCustomer.setEmail(email); //set the new email
												System.out.println("");
												System.out.println("Do you want to change other information of this customer? (Yes/No)");
												System.out.println("If Yes, enter number from 1-3 to choose what to change.");
												decide = readerS.nextLine();
												while (decide.equals("Yes") == false && decide.equals("No") == false){
													System.out.println("");
													System.out.println("Please enter a valid answer (Yes/No)");
													decide=reader.nextLine();
												}
												if (decide.equals("Yes") == true){
													changeInfo=true;
													System.out.println("");
													System.out.println("Enter 1 to change this customer name");
													System.out.println("Enter 2 to change this customer credit card number");
													System.out.println("Enter 3 to change this customer email address");
													System.out.print("Number(1-3): ");
												}
											}
										}
									}
							}

							else if (decide.equals("No") == true){ //if the user said they didnt want to change the customer info
								adminloop=true;
							}

						}
						else if (c==2){
							System.out.println("");
							System.out.println("Please enter the new name of this customer:");
							String newName = readerS.nextLine(); //take in customer name for the new customer
							System.out.println("");

							System.out.println("Please enter the new credit card number of this customer (9-digit):");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid credit card number. It should be a 9-digit integer.");
								reader.nextLine();
							}
							int newCredit = reader.nextInt();//get credit card number of new user
							System.out.println("");

							System.out.println("Please enter the new email address of this customer:");
							String newEmail = readerS.nextLine(); //get email address of new user
							System.out.println("");

							CustomerNode newCus = new CustomerNode(newName,newCredit,newEmail); //use the information to create a new node
							Customers.insert(newCus); //insert the node into customer BST
						}
						System.out.println("");
						System.out.println("Enter 1 to go back to the administrator main menu");
						System.out.println("Enter 2 to go back to the main menu");
						System.out.println("Enter 3 to quit");
						System.out.print("Number(1-3): ");
						while(!reader.hasNextInt()){
							System.out.println("Please enter a valid integer from 1-3!!!	");
							reader.nextLine();
						}
						int f=reader.nextInt();
						while (f!=1&& f!=2&& f!=3){
							System.out.println("");
							System.out.println("Please enter a valid number from 1-3.");
							System.out.print("Number(1-3): ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid integer from 1-3!!!	");
								reader.nextLine();
							}
							f=reader.nextInt();
						}
						if (f==1){
							adminloop=true; //if user says to go back to the top of admin menu
						}
						else if (f==2){
							mainloop=true; //if user wants to continue usng program, "activate" the loop
						}
						else if (f==3){
							System.out.println("");
							System.out.println("Ending program"); //ENDPROGRAM

							// serialize movie heap

							try{
								FileOutputStream fileOut1 =
								new FileOutputStream("movHeap.txt");
								ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
								out1.writeObject(MovieHeap);
								out1.close();
								fileOut1.close();
								System.out.println("Movie Heap has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

							// serialize customer BST

							try{
								FileOutputStream fileOut2 =
								new FileOutputStream("cBST.txt");
								ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
								out2.writeObject(Customers);
								out2.close();
								fileOut2.close();
								System.out.println("CustomerBST has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

							// serialize date BST

							try{
								FileOutputStream fileOut3 =
								new FileOutputStream("dateBST.txt");
								ObjectOutputStream out3 = new ObjectOutputStream(fileOut3);
								out3.writeObject(MovieDates);
								out3.close();
								fileOut3.close();
								System.out.println("CustomerBST has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

							// serialize ID BST

							try{
								FileOutputStream fileOut4 =
								new FileOutputStream("idBST.txt");
								ObjectOutputStream out4 = new ObjectOutputStream(fileOut4);
								out4.writeObject(MovieID);
								out4.close();
								fileOut4.close();
								System.out.println("ID BST has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

						}
					}
					else if (a==2){
						System.out.println("");
						System.out.println("Enter 1 to see the worst rated movie");
						System.out.println("Enter 2 to delete the worst rated movie");
						System.out.println("Enter 3 to insert a new movie to the movie archive");
						System.out.print("Number(1-3): ");
						while(!reader.hasNextInt()){
							System.out.println("Please enter a valid integer from 1-3!!!	");
							reader.nextLine();
						}
						int m=reader.nextInt();
						while (m!=1&& m!=2&& m!=3){
							System.out.println("Please enter a valid number from 1-3.");
							System.out.print("Number(1-3): ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid integer from 1-3!!!	");
								reader.nextLine();
							}
							m=reader.nextInt();
						}
						if (m==1){
							Movie movie=MovieHeap.findMin(); //find the minimum rated movie node
							System.out.println(""); //show movie node information
							System.out.println("Here is the information of the movie with worst rate movie. " );
							System.out.println("Movie: " + movie.getTitle() + ";  " + "Release Date: " + movie.getRelease()
								+ ";  " + "ID: " + movie.getID()+ ";  " + "Rotten Tomatoes popularity score: " + movie.getrTscore());
						}
						else if (m==2){
							Movie movie=MovieHeap.findMin();
							System.out.println("");
							System.out.println("Here is the information of the movie with worst rate movie. " );
							System.out.println("Movie: " + movie.getTitle() + ";  " + "Release Date: " + movie.getRelease()
								+ ";  " + "ID: " + movie.getID()+ ";  " + "Rotten Tomatoes popularity score: " + movie.getrTscore());
							System.out.println("Do you want to delete this movie? (Yes/No)");
						    String s = readerS.nextLine();
						    while (s.equals("Yes") == false && s.equals("No") == false){
						        System.out.println("");
						        System.out.println("Please enter a valid answer(Yes/No)");
						        s=readerS.nextLine();
						    }
						    if (s.equals("Yes") == true){
							    Movie min=MovieHeap.findMin();
							    MovieHeap.deleteMin();
							    MovieDates.delete(min);
							    MovieID.delete(min);
							    System.out.println("Movie " + min.getTitle()+" has been removed.");
							}
						}
						else if (m==3){
							System.out.println("");
							System.out.println("Enter the movie name that you want to insert:");
							String moviename = readerS.nextLine(); //name of new movie node

							System.out.println("Enter the release date of the movie: ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid release date. It should be in a format of 8-digit integer(YYYYMMDD).");
								reader.nextLine();
							}
							int movierelease = reader.nextInt(); //get release date of new movie node
							System.out.println("Enter the id code of the movie: ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid ID. It should be an integer");
								reader.nextLine();
							}
							int movieID =reader.nextInt(); //get ID of new movie

							System.out.println("Enter the rotten tomatoes score of the movie: ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a rotten tomatoes score. It should be an integer.");
								reader.nextLine();
							}
							int movieRT=reader.nextInt(); //get rotten tomatoes score of new movie

							Movie moviea = new Movie(moviename, movierelease, movieID, movieRT); //create new movie node with given information
				      MovieHeap.insert(moviea); //insert movie into the heap
							MovieDates.insert(moviea); //insert the movie into the dates BST
							MovieID.insert(moviea); //insert the movie into the ID BST
							System.out.println("");
							System.out.println("Movie " + moviea.getTitle()+ " has been added.");
						}
						System.out.println("");
						System.out.println("Enter 1 to go back to the administrator main menu");
						System.out.println("Enter 2 to go back to the main menu");
						System.out.println("Enter 3 to quit");
						System.out.print("Number(1-3): ");
						while(!reader.hasNextInt()){
							System.out.println("Please enter a valid integer from 1-3!!!	");
							reader.nextLine();
						}
						int f=reader.nextInt();
						while (f!=1&& f!=2&& f!=3){
							System.out.println("");
							System.out.println("Please enter a valid number from 1-3.");
							System.out.print("Number(1-3): ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid integer from 1-3!!!	");
								reader.nextLine();
							}
							f=reader.nextInt();
						}
						if (f==1){
							adminloop=true;
						}
						else if (f==2){
							mainloop=true;
						}
						else if (f==3){
							System.out.println("");
							System.out.println("Ending program"); //ENDPROGRAM

							// serialize movie heap

							try{
								FileOutputStream fileOut1 =
								new FileOutputStream("movHeap.txt");
								ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
								out1.writeObject(MovieHeap);
								out1.close();
								fileOut1.close();
								System.out.println("Movie Heap has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

							// serialize customer BST

							try{
								FileOutputStream fileOut2 =
								new FileOutputStream("cBST.txt");
								ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
								out2.writeObject(Customers);
								out2.close();
								fileOut2.close();
								System.out.println("CustomerBST has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

							// serialize date BST

							try{
								FileOutputStream fileOut3 =
								new FileOutputStream("dateBST.txt");
								ObjectOutputStream out3 = new ObjectOutputStream(fileOut3);
								out3.writeObject(MovieDates);
								out3.close();
								fileOut3.close();
								System.out.println("CustomerBST has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

							// serialize ID BST

							try{
								FileOutputStream fileOut4 =
								new FileOutputStream("idBST.txt");
								ObjectOutputStream out4 = new ObjectOutputStream(fileOut4);
								out4.writeObject(MovieID);
								out4.close();
								fileOut4.close();
								System.out.println("ID BST has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

						}
					}
					else if (a==3){
						mainloop=true;
					}
					else if (a==4){
						System.out.println("");
						System.out.println("Ending program"); //ENDPROGRAM

						// serialize movie heap

						try{
							FileOutputStream fileOut1 =
							new FileOutputStream("movHeap.txt");
							ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
							out1.writeObject(MovieHeap);
							out1.close();
							fileOut1.close();
							System.out.println("Movie Heap has been serialized");
						} catch(IOException i)
						{
							i.printStackTrace();
						}

						// serialize customer BST

						try{
							FileOutputStream fileOut2 =
							new FileOutputStream("cBST.txt");
							ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
							out2.writeObject(Customers);
							out2.close();
							fileOut2.close();
							System.out.println("CustomerBST has been serialized");
						} catch(IOException i)
						{
							i.printStackTrace();
						}

						// serialize date BST

						try{
							FileOutputStream fileOut3 =
							new FileOutputStream("dateBST.txt");
							ObjectOutputStream out3 = new ObjectOutputStream(fileOut3);
							out3.writeObject(MovieDates);
							out3.close();
							fileOut3.close();
							System.out.println("CustomerBST has been serialized");
						} catch(IOException i)
						{
							i.printStackTrace();
						}

						// serialize ID BST

						try{
							FileOutputStream fileOut4 =
							new FileOutputStream("idBST.txt");
							ObjectOutputStream out4 = new ObjectOutputStream(fileOut4);
							out4.writeObject(MovieID);
							out4.close();
							fileOut4.close();
							System.out.println("ID BST has been serialized");
						} catch(IOException i)
						{
							i.printStackTrace();
						}

					}
			    }
			}
			if(n==2){
				//Customers
				boolean customerloop=true;
				while(customerloop==true){
					customerloop=false;
					System.out.println("");
					System.out.println("Enter 1 to access customer information");
					System.out.println("Enter 2 to search for a movie");
					System.out.println("Enter 3 to return to the main menu");
					System.out.print("Number(1-3): ");
					while(!reader.hasNextInt()){
						System.out.println("Please enter a valid integer from 1-3!!!	");
						reader.nextLine();
					}
					int t=reader.nextInt();
					while (t!=1&& t!=2&& t!=3){
						System.out.println("Please enter number from 1-3.");
						System.out.print("Number(1-3): ");
						while(!reader.hasNextInt()){
							System.out.println("Please enter a valid integer from 1-3!!!	");
							reader.nextLine();
						}
						t=reader.nextInt();
					}
					if (t==1){
						System.out.println("");
						System.out.println("Enter 1 to access your personal information");
						System.out.println("Enter 2 to view/change your wish list");
						System.out.print("Number(1-2): ");
						while(!reader.hasNextInt()){
							System.out.println("Please enter a valid integer from 1-2!!! ");
							reader.nextLine();
						}
						int m=reader.nextInt();
						while (m!=1&& m!=2){
							System.out.println("");
							System.out.println("Please enter number from 1-2.");
							System.out.print("Number(1-2): ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid integer from 1-2!!!	");
								reader.nextLine();
							}
							m=reader.nextInt();
						}
						if (m==1){
							//access the customer node, maybe have another menu asking
							//what the user wants to change about the node
							System.out.println("");
							System.out.println("Enter the credit card number of your customer node to access:");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid credit card number. It should be a 9-digit integer.");
								reader.nextLine();
							}
							int num = reader.nextInt();
							CustomerNode currentCustomer = Customers.search(num % 10000);
							while (currentCustomer==null){
								System.out.println("");
								System.out.println("The customer with this credit card number does not exit. Please enter a valid credit card number: ");
								num = reader.nextInt();
							    currentCustomer = Customers.search(num % 10000);
							}
							System.out.println(""); //print out customer node information
							System.out.println("Below is your customer information:");
							System.out.println("Name: " + currentCustomer.getName());
							System.out.println("Credit card number: " + currentCustomer.getCredit());
							System.out.println("Email: " + currentCustomer.getEmail());
							System.out.println("Movie list: ");
							currentCustomer.getWish().printMovies();
							System.out.println("");

							System.out.println("Do you want to change/delete your customer information? (Yes/No)");
							String decide = readerS.nextLine();
							while (decide.equals("Yes") == false && decide.equals("No") == false){
								System.out.println("Please enter a valid answer: Yes/No");
								System.out.print("Yes/No: ");
								decide=readerS.nextLine();
							}

							if (decide.equals("Yes") == true){
								System.out.println("");
								System.out.println("Enter 1 if you want to delete your customer information");
								System.out.println("Enter 2 if you want to change your customer information");
								System.out.print("Number(1-2): ");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid integer from 1-2!!!	");
									reader.nextLine();
								}
								int cus = reader.nextInt();
								while (cus!=1&& cus!=2){
									System.out.println("Please enter number from 1-2!!!");
									while(!reader.hasNextInt()){
										System.out.println("Please enter a valid integer from 1-2!!!	");
										reader.nextLine();
									}
									cus=reader.nextInt();
								}
								if (cus == 1){
									Customers.delete(currentCustomer); //delete current customer node
									System.out.println("");
									System.out.println("The customer "+currentCustomer.getName()+" has been deleted"); //confirmation
								}
								else if (cus == 2){
									System.out.println("");
									System.out.println("Enter 1 to change your name");
									System.out.println("Enter 2 to change your credit card number");
									System.out.println("Enter 3 to change your email address");
									System.out.print("Number(1-3): ");
									Boolean changeInfo=true;
									while (changeInfo==true){
											changeInfo=false;
											while(!reader.hasNextInt()){
												System.out.println("Please enter a valid integer from 1-3!!!");
												reader.nextLine();
											}
											int change = reader.nextInt();
											while (change!=1&& change!=2&& change!=3){
												System.out.println("");
												System.out.println("Please enter number from 1-3 to change information of this customer.");
												System.out.print("Number(1-3): ");
												while(!reader.hasNextInt()){
													System.out.println("Please enter a valid integer from 1-3!!!	");
													reader.nextLine();
												}
												change=reader.nextInt();
											}
											if (change == 1){
												System.out.println("");
												System.out.println("Please enter your new name:");
												String name = readerS.nextLine(); //get new name
												currentCustomer.setName(name); //change the current customer nodes name to new name
												System.out.println("Do you want to change your other information? (Yes/No). ");
												System.out.println("If Yes, enter number from 1-3 to choose what to change.");
												decide = readerS.nextLine();
												while (decide.equals("Yes") == false && decide.equals("No") == false){
													System.out.println("");
													System.out.println("Please enter a valid answer: Yes/No");
													System.out.print("Yes/No: ");
													decide=reader.nextLine();
												}
												if (decide.equals("Yes") == true){
													changeInfo=true;
													System.out.println("");
													System.out.println("Enter 1 to change your name");
													System.out.println("Enter 2 to change your credit card number");
													System.out.println("Enter 3 to change your email address");
													System.out.print("Number(1-3): ");
												}
											}
											else if (change == 2){
												System.out.println("");
												System.out.println("Please enter the your new credit card number:");
												while(!reader.hasNextInt()){
													System.out.println("Please enter a valid credit card number. It should be a 9-digit integer.");
													reader.nextLine();
												}
												int credit = reader.nextInt();
												currentCustomer.setCredit(credit);
												System.out.println("Do you want to change your other information? (Yes/No). ");
												System.out.println("If Yes, enter number from 1-3 to choose what to change.");
												System.out.println("Yes/No: ");
												decide = readerS.nextLine();
												while (decide.equals("Yes") == false && decide.equals("No") == false){
													System.out.println("");
													System.out.println("Please enter a valid answer: Yes/No");
													decide=reader.nextLine();
												}
												if (decide.equals("Yes") == true){
													changeInfo=true; //run loop again if user says they want to (if Yes)
													System.out.println("Enter 1 to change your name");
													System.out.println("Enter 2 to change your credit card number");
													System.out.println("Enter 3 to change your email address");
													System.out.print("Number(1-3): ");
												}
											}
											else if (change == 3){
												System.out.println("");
												System.out.println("Please enter your new email address:");
												String email = readerS.nextLine(); //take in new email address to change the current nodes email
												currentCustomer.setEmail(email); //set the new email
												System.out.println("");
												System.out.println("Do you want to change your other information? (Yes/No). If Yes, enter number from 1-3 to choose what to change");
												decide = readerS.nextLine();
												while (decide.equals("Yes") == false && decide.equals("No") == false){
													System.out.println("");
													System.out.println("Please enter a valid answer: Yes/No");
													System.out.print("Yes/No: ");
													decide=reader.nextLine();
												}
												if (decide.equals("Yes") == true){
													changeInfo=true;
													System.out.println("");
													System.out.println("Enter 1 to change your name");
													System.out.println("Enter 2 to change your credit card number");
													System.out.println("Enter 3 to change your email address");
													System.out.print("Number(1-3): ");
												}
											}
									}

									System.out.println(""); //print out the current customer node information
									System.out.println("Here is your updated information:");
									System.out.println("Name: " + currentCustomer.getName());
									System.out.println("Credit card number: " + currentCustomer.getCredit());
									System.out.println("Email: " + currentCustomer.getEmail());
									System.out.println("Movie list: ");
									currentCustomer.getWish().printMovies();
									System.out.println("");
								}
							}
							else if(decide.equals("Yes") == true){
								customerloop=true;
							}
						}

						else if (m==2){
							System.out.println("");
							System.out.println("Enter the credit card number of your customer node to access:");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid credit card number. It should be a 9-digit integer.");
								reader.nextLine();
							}
							int num = reader.nextInt(); //get credit car information
							CustomerNode currentCustomer = Customers.search(num % 10000); //seardch for the requested node
							while (currentCustomer==null){
								System.out.println("The customer with this credit card number does not exit. Please enter a valid credit card number");
								num = reader.nextInt();
							    currentCustomer = Customers.search(num % 10000);
							}
							System.out.println("");
						    System.out.println("Enter 1 to print the movie list in order with title and ID");
						    System.out.println("Enter 2 to access the next movie");
						    System.out.println("Enter 3 to add a movie");
						    System.out.println("Enter 4 to delete a movie");
						    System.out.print("Number(1-4): ");
						    while(!reader.hasNextInt()){
								System.out.println("Please enter a valid integer from 1-4!!!	");
								reader.nextLine();
							}
						    int list = reader.nextInt();
							while (list!=1&& list!=2 &&list!=3&&list!=4){
								System.out.println("Please enter number from 1-4.");
								System.out.print("Number(1-4): ");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid integer from 1-4!!!	");
									reader.nextLine();
								}
								list=reader.nextInt();
							}
						    if (list == 1){
						    	System.out.println("");
						        currentCustomer.getWish().printMovies(); //if user chose 1 to print wish list, then print the movies
						    }
						    else if (list == 2){
						        Movie movie=currentCustomer.getWish().nextMovie(); //access the next movie in the wish list, code in wish list dels with deleting/watching movie
						        if (movie==null){
						        	System.out.println("");

						        }
						    }
					        else if (list == 3){
					        	System.out.println("");
					            System.out.println("Here are all of the movies in order of release date: ");
					            MovieDates.traverse(); //print all information in all movie nodes, for user to chose movie
								System.out.println("Enter the release date of a specific movie that you want to add to your wish-list.");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid release date. It should be in a format of 8-digit integer(YYYYMMDD).");
									reader.nextLine();
								}
								int date =reader.nextInt(); //take in the release date of the movie you want
								Movie movie = MovieDates.search(date); //find the requested movie
								while (movie==null){
									System.out.println("Sorry, the movie with the release date your entered does not exit. Please enter a valid release date: ");
									System.out.println("Date(YYYYMMDD): ");
									while(!reader.hasNextInt()){
										System.out.println("Please enter a release date. It should be a 8-digit integer.(YYYYMMDD)	");
										reader.nextLine();
									}
									date = reader.nextInt(); //take new date until it gives a movie node (not null)
								    movie = MovieDates.search(date);
								}
							  	System.out.println("You are adding movie " + movie.getTitle()+ " into " + currentCustomer.getName() +"'s wish-list.");
							 	 //add movie to the wish list
							  	System.out.println("Enter the index number you want the movie to be in your movie list (1-20)");
						 		while(!reader.hasNextInt()){
									System.out.println("Please enter a valid integer from 1-20.");
									reader.nextLine();
								}
							  	int movieIndex = reader.nextInt(); //get index between 1 and 20
							  	movieIndex = movieIndex-1; //movie index is actually between 0 and 19 not 1 and 20
								while (movieIndex<0||movieIndex>19){ //if the indedx entered is invalid (greater than 20 or less than 0)
									System.out.println("You can only have twenty movies in your wish list. Plase enter a valid index number(1-20)");
									System.out.print("Number(1-20): ");
									while(!reader.hasNextInt()){
										System.out.println("Please enter a valid integer from 1-20!!!	");
										reader.nextLine();
									}
									movieIndex=reader.nextInt(); //get new movie index
									movieIndex = movieIndex-1; //subtract 1 to make it work with wish list
								}
							  	currentCustomer.getWish().inserti(movie,movieIndex); //insert the chosen movie at the chosen location.
					        }
					        else if (list == 4){
					        	System.out.println("");
					        	System.out.println("Below are the movies in your wish list:");
					        	currentCustomer.getWish().printMovies(); //show movies in wish list
					        	System.out.println("");
					            System.out.println("Enter the index of the movie that you want to delete (1-20):");
						        while(!reader.hasNextInt()){
									System.out.println("Please enter a valid integer from 1-20.");
									reader.nextLine();
								}
					            int deleteIndex = reader.nextInt();
							  	deleteIndex = deleteIndex-1; //get index of movie to delete (read next int then subtract 1)
								while (deleteIndex<0||deleteIndex>19){ //get valid index
									System.out.println("There are at most twenty movies in your wish list. Plase enter a valid index number(1-20)");
									System.out.print("Number(1-20): ");
									while(!reader.hasNextInt()){
										System.out.println("Please enter a valid integer from 1-20!!!	");
										reader.nextLine();
									}
									deleteIndex=reader.nextInt();
									deleteIndex = deleteIndex-1;
								}
					            currentCustomer.getWish().delete(deleteIndex); //delete the movie from the wish list at the chosen index
					        }
						}
					}
					else if(t==2){
						System.out.println("");
						System.out.println("Enter 1 to print out all of movies in order of release date");
						System.out.println("Enter 2 to access a movie in term of release date");
						System.out.println("Enter 3 to access a movie node based on movie ID");
						System.out.print("Number(1-3): ");
						while(!reader.hasNextInt()){
							System.out.println("Please enter a valid integer from 1-3.");
							reader.nextLine();
						}
						int h=reader.nextInt();
						while (h!=1&& h!=2&& h!=3){
							System.out.println("Please enter number from 1-3.");
							System.out.print("Number(1-3): ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid integer from 1-3!!!	");
								reader.nextLine();
							}
							h=reader.nextInt();
						}
						if (h==1){
							System.out.println("");
							MovieDates.traverse(); //traverse tree to print movies in order of release date
						}
						else if (h==2){
							System.out.println("");
							System.out.println("Enter the release date of a specific movie that you want to access.");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid release date. It should be in a format of 8-digit integer(YYYYMMDD).");
								reader.nextLine();
							}
							int date =reader.nextInt();
							Movie movie = MovieDates.search(date); //search for movie with given date
							while (movie==null){ //get new date until it is the date of a movie to access
								System.out.println("Sorry, the movie with the release date your entered does not exit. Please enter a valid release date: ");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid release date. It should be in a format of 8-digit integer(YYYYMMDD)	");
									reader.nextLine();
								}
								date = reader.nextInt();
								movie = MovieDates.search(date);
							}
							System.out.println(""); //show the accessed movie node
							System.out.println("Here is the information of the movie with release date: " + date);
							System.out.println("Movie: " + movie.getTitle() + ";  " + "Release Date: " + movie.getRelease()
								+ ";  " + "ID: " + movie.getID()+ ";  " + "Rotten Tomatoes popularity score: " + movie.getrTscore());
							System.out.println("Do you want to add this movie to your wish-list?");
							System.out.println("Enter 1 to add this movie to your wish-list");
							System.out.println("Enter 2 to return back to the main menu");
							System.out.print("Number(1-2): ");
							int a = reader.nextInt();
							while (a!=1&& a!=2){
								System.out.println("Please enter number from 1-2.");
								System.out.print("Number(1-2): ");
								a=reader.nextInt();
							}
							if (a==1){
								System.out.println("");
								System.out.println("Enter the credit card number of your customer node to access");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid credit card number. It should be a 9-digit integer.");
									reader.nextLine();
								}
								int creditNum = reader.nextInt(); //take in the credit card to find which wish list to add to
								CustomerNode currentCustomer = Customers.search(creditNum % 10000); //search for the customer
								while (currentCustomer==null){ //get credit card numbers until a valid credit card number is entered (for an existing customer)
									System.out.println("The customer with this credit card number does not exit. Please enter a valid credit card number");
									while(!reader.hasNextInt()){
										System.out.println("Please enter a valid integer.	");
										reader.nextLine();
									}
									creditNum = reader.nextInt();
								    currentCustomer = Customers.search(creditNum % 10000);
								}
								System.out.println("You are adding movie " + movie.getTitle() + " into " + currentCustomer.getName() +"'s wish-list.");
								//add movie to the wish list
								System.out.println("Enter the index number you want the movie to be in your movie list (1-20)");
								System.out.print("Number(1-20): ");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid integer from 1-20.");
									reader.nextLine();
								}
								int movieIndex = reader.nextInt(); //get movie index
								movieIndex  = movieIndex -1;
								while (movieIndex <0||movieIndex >19){ //maek sure it is a valid index
									System.out.println("There are at most twenty movies in your wish list. Plase enter a valid index number(1-20)");
									System.out.print("Number(1-20): ");
									while(!reader.hasNextInt()){
										System.out.println("Please enter a valid integer from 1-20!!!	");
										reader.nextLine();
									}
									movieIndex =reader.nextInt();
									movieIndex  = movieIndex -1;
								}
								currentCustomer.getWish().inserti(movie,movieIndex); //insert movie into the correct spot/
							}
							else if (a==2){
								customerloop=true;
							}
						}
						else if (h==3){ //same as date BST but accessing movies based on ID
							System.out.println("");
							System.out.println("Enter the ID of a specific movie that you want to access");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid ID. It should be an integer");
								reader.nextLine();
							}
							int id =reader.nextInt();
							Movie movie = MovieID.search(id);
							while (movie==null){
								System.out.println("Sorry, the movie with the id your entered does not exist. Please enter a valid id: ");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid integer.	");
									reader.nextLine();
								}
								id = reader.nextInt();
								movie = MovieID.search(id);
							}
							System.out.println("");
							System.out.println("Here is the information of the movie with id: " + id);
							System.out.println("Movie: " + movie.getTitle() + ";  " + "Release Date: " + movie.getRelease()
								+ ";  " + "ID: " + movie.getID()+ ";  " + "Rotten Tomatoes popularity score: " + movie.getrTscore());
							System.out.println("");
							System.out.println("Do you want to add this movie to your wish-list?");
							System.out.println("Enter 1 to add this movie to your wish-list");
							System.out.println("Enter 2 to return back to the main menu");
							System.out.print("Number(1-2): ");
							while(!reader.hasNextInt()){
								System.out.println("Please enter a valid integer from 1-2.");
								reader.nextLine();
							}
							int a = reader.nextInt();
							while (a!=1&& a!=2){
								System.out.println("Please enter number from 1-2.");
								System.out.print("Number(1-2): ");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid integer from 1-2!!!	");
									reader.nextLine();
								}
								a=reader.nextInt();
							}
							if (a==1){
								System.out.println("");
							    System.out.println("Enter the credit card number of your customer node to access");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid credit card number. It should be a 9-digit integer");
									reader.nextLine();
								}
							    int creditNum = reader.nextInt();
							    CustomerNode currentCustomer = Customers.search(creditNum % 10000);
								while (currentCustomer==null){
									System.out.println("The customer with this credit card number does not exit. Please enter a valid credit card number");
									while(!reader.hasNextInt()){
										System.out.println("Please enter a valid credit card number. It should be a 9-digit integer.	");
										reader.nextLine();
									}
									creditNum = reader.nextInt();
								    currentCustomer = Customers.search(creditNum % 10000);
								}
							    System.out.println("You are adding this movie into" + currentCustomer.getName() +"'s wish-list.");
							    //add movie to the wish list
							    System.out.println("Enter the index number you want the movie to be in your movie list (1-20)");
								while(!reader.hasNextInt()){
									System.out.println("Please enter a valid integer from 1-20.");
									reader.nextLine();
								}
							    int movieIndex = reader.nextInt();
								while (movieIndex <0||movieIndex >19){
									System.out.println("There are at most twenty movies in your wish list. Plase enter a valid index number(1-20)");
									System.out.print("Number: ");
									while(!reader.hasNextInt()){
										System.out.println("Please enter a valid integer from 1-20!!!	");
										reader.nextLine();
									}
									movieIndex =reader.nextInt();
									movieIndex  = movieIndex -1;
								}
							    currentCustomer.getWish().inserti(movie,movieIndex);
							}
							else if (a==2){
								customerloop=true;
							}
						}
					}
					else if(t==3){
						mainloop=true;
					}
					if(mainloop==false){
						System.out.println("");
						System.out.println("Enter 1 to go back to the customer main menu");
						System.out.println("Enter 2 to go back to the main menu");
						System.out.println("Enter 3 to quit");
						System.out.print("Number: ");
						while(!reader.hasNextInt()){
							System.out.println("Please enter a valid integer from 1-3.");
							reader.nextLine();
						}

						int f=reader.nextInt();
						while (f!=1&& f!=2&& f!=3){
							System.out.println("Please enter number from 1-3.");
							System.out.print("Number(1-3): ");
							f=reader.nextInt();
						}
						if (f==1){
							customerloop=true;
						}
						else if (f==2){
							mainloop=true;
						}
						else if (f==3){
							System.out.println("");
							System.out.println("Ending program"); // ENDPROGRAM

							// serialize movie heap

							try{
								FileOutputStream fileOut1 =
								new FileOutputStream("movHeap.txt");
								ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
								out1.writeObject(MovieHeap);
								out1.close();
								fileOut1.close();
								System.out.println("Movie Heap has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

							// serialize customer BST

							try{
								FileOutputStream fileOut2 =
								new FileOutputStream("cBST.txt");
								ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
								out2.writeObject(Customers);
								out2.close();
								fileOut2.close();
								System.out.println("CustomerBST has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

							// serialize date BST

							try{
								FileOutputStream fileOut3 =
								new FileOutputStream("dateBST.txt");
								ObjectOutputStream out3 = new ObjectOutputStream(fileOut3);
								out3.writeObject(MovieDates);
								out3.close();
								fileOut3.close();
								System.out.println("CustomerBST has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

							// serialize ID BST

							try{
								FileOutputStream fileOut4 =
								new FileOutputStream("idBST.txt");
								ObjectOutputStream out4 = new ObjectOutputStream(fileOut4);
								out4.writeObject(MovieID);
								out4.close();
								fileOut4.close();
								System.out.println("ID BST has been serialized");
							} catch(IOException i)
							{
								i.printStackTrace();
							}

						}
					}
				}
			}
			else if (n==3){
				System.out.println("");
				System.out.println("Ending program"); // ENDPROGRAM

				// serialize movie heap

				try{
					FileOutputStream fileOut1 =
					new FileOutputStream("movHeap.txt");
					ObjectOutputStream out1 = new ObjectOutputStream(fileOut1);
					out1.writeObject(MovieHeap);
					out1.close();
					fileOut1.close();
					System.out.println("Movie Heap has been serialized");
				} catch(IOException i)
				{
					i.printStackTrace();
				}

				// serialize customer BST

				try{
					FileOutputStream fileOut2 =
					new FileOutputStream("cBST.txt");
					ObjectOutputStream out2 = new ObjectOutputStream(fileOut2);
					out2.writeObject(Customers);
					out2.close();
					fileOut2.close();
					System.out.println("CustomerBST has been serialized");
				} catch(IOException i)
				{
					i.printStackTrace();
				}

				// serialize date BST

				try{
					FileOutputStream fileOut3 =
					new FileOutputStream("dateBST.txt");
					ObjectOutputStream out3 = new ObjectOutputStream(fileOut3);
					out3.writeObject(MovieDates);
					out3.close();
					fileOut3.close();
					System.out.println("CustomerBST has been serialized");
				} catch(IOException i)
				{
					i.printStackTrace();
				}

				// serialize ID BST

				try{
					FileOutputStream fileOut4 =
					new FileOutputStream("idBST.txt");
					ObjectOutputStream out4 = new ObjectOutputStream(fileOut4);
					out4.writeObject(MovieID);
					out4.close();
					fileOut4.close();
					System.out.println("ID BST has been serialized");
				} catch(IOException i)
				{
					i.printStackTrace();
				}

			}
		}
	}
}
