public class Movie implements java.io.Serializable{

	// declare variables
	public String title;
	public int release; // yyyymmdd
	public int id_num;
	public int rTscore;
	public boolean available;
	private Movie right;
	private Movie left;
	private Movie leftID;
	private Movie rightID;

	// construct new node
	public Movie(String title0, int release0, int id_num0, int rTscore0){
		title = title0; // set title
		release = release0; // set release date
		id_num = id_num0; // set initial ID number
		rTscore = rTscore0; // set Rotten Tomato rating
		available = true; // movie is available by default
		right = null;
		left = null;
		rightID = null;
		leftID = null;
	}

	// return title
	public String getTitle(){
		return title;
	}

	// set title
	public void setTitle(String newTitle){
		title = newTitle;
	}

	// set ID number
	public void setID(int newID){
		id_num = newID;
	}

	public void setRelease(int newRelease){
		release = newRelease;
	}

	// set pointer to new movie
	public void setLeft(Movie newLeft){
		left = newLeft;
	}

	public void setRight(Movie newRight){
		right = newRight;
	}

	public void setLeftID(Movie newLeftID){
		leftID = newLeftID;
	}

	public void setRightID(Movie newRightID){
		rightID = newRightID;
	}

	public void setRTscore(int newrTscore){
		rTscore = newrTscore;
	}

	// return movie that pointer is pointing to
	// get next movie
	public Movie getLeft(){
		return left;
	}

	public Movie getRight(){
		return right;
	}

	public Movie getLeftID(){
		return leftID;
	}

	public Movie getRightID(){
		return rightID;
	}

	// return ID number
	public int getID(){
		return id_num;
	}

	// get release
	public int getRelease(){
		return release;
	}

	// return rotten tomato score
	public int getrTscore(){
		return rTscore;
	}

}
