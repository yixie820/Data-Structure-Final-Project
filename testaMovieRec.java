// Rishma Mendhekar
// Test for the Heap

public class testaMovieRec implements java.io.Serializable{
    public static void main(String[] args){
	aMovieRec r = new aMovieRec();
	Movie PulpFiction = new Movie("Pulp Fiction", 19940814, 00001, 94);
	Movie TheRing = new Movie("The Ring", 20021018, 00002, 55);
	Movie ParentTrap = new Movie("Parent Trap", 19980720, 00003, 64);
	Movie BackToTheFuture = new Movie("Back To The Future", 19850703, 00004, 96);
  Movie TheAvengers = new Movie("The Avengers", 20120504, 00005, 87);
  Movie Psycho = new Movie("Psycho", 19600908, 00006, 70);
  Movie Totoro = new Movie("Totoro", 19930507, 00007, 75);
  System.out.println();
  System.out.println("is empty?:");
  System.out.println(r.isEmpty());
  System.out.println();
	r.insert(PulpFiction); // first insertion
  System.out.println("print record first insertion:");
	r.printRecord();
  System.out.println();
	r.insert(TheRing);  // second insertion
  System.out.println();
  System.out.println("print record second insertion:");
  r.printRecord();
  System.out.println();
	r.insert(ParentTrap);  // third insertion
  System.out.println();
  System.out.println("print record third insertion:");
  r.printRecord();
  System.out.println();
	r.insert(BackToTheFuture);  // fourth insertion
  System.out.println();
  System.out.println("print record fourth insertion:");
  r.printRecord();
  System.out.println();
  r.insert(TheAvengers); // fifth insertion
  System.out.println();
  System.out.println("print record fifth insertion:");
  r.printRecord();
  System.out.println();
	r.insert(Psycho);  // sixth insertion
  System.out.println();
  System.out.println("print record sixth insertion:");
  r.printRecord();
  System.out.println();
  r.insert(Totoro);  // seventh insertion
  System.out.println();
  System.out.println("print record seventh insertion:");
  r.printRecord();
  System.out.println();
  System.out.println();
  System.out.println();
  System.out.println("is empty?:");
  System.out.println(r.isEmpty());
  System.out.println();
  System.out.println("print record:");
	r.printRecord();
	System.out.println();
  System.out.println("find min:");
	System.out.println(r.findMin().getrTscore());
	System.out.println();
  System.out.println("delete min:");
	r.deleteMin();
	System.out.println();
  System.out.println("print record:");
	r.printRecord();
    }
}
