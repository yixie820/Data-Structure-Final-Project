/*watchList is an array that stores user's movie wish-list.
There are 20 available spots for the user to add what movies they want
from the movie database. This program also allows the user to:
- access the next movie in constant time, and gives an option to delete (O(n))
- list movies in order with title and ID (O(n))
- add new movies in any location (O(n))  */

import java.util.Arrays;
import java.util.Scanner;

public class WatchList implements java.io.Serializable{
  //initialize private variables that can only accessed/changed in this file
  private int n;
  private Movie [] wish;
  private int first;

  //constructor
  //integer first keeps track the first movie on the user's watch list
  public WatchList(){
    n = 0;
    first = 20;
    wish = new Movie[20];
  }

  //return the length of the linked list n
  public int length(){
      return n;
  }

  //return true if the list is empty and false if it is not
  public boolean isEmptyList(){
    return n == 0;
  }

  //delete a movie at index of k
  public void delete(int k){
    //the index position is empty
    if (wish[k] == null){
      System.out.println("There is no movie in this index position.");
    }
    else{
      //set it to null
      Movie x = wish[k];
      wish[k]=null;
      System.out.println("The movie " + x.getTitle() + " has been deleted from your wish-list.");
      x=null;
      if (n!=0){
        n--;
      }
      if (isEmptyList() != true){
        //if the movie we want to delete is the first movie in the wish list
        //reset the first movie variable by looking for the next available movie in the list
        if (k==first){
          while (wish[first]==null){
            first ++;
          }
        }
      }
    }
  }

  //constant time access the next movie in the wish list
  //the movie with the smallest index number is the first next movie
  public Movie nextMovie(){
    if (isEmptyList() != true){
      Movie next = wish[first];
      System.out.println("The next movie in the list is " + next.getTitle() + ".");
      //ask the user if they want to delete the movie
      Scanner input = new Scanner(System.in);
      System.out.println("Do you want to delete this movie? (Yes/No)");
      String s = input.nextLine();
      while (s.equals("Yes") == false && s.equals("No") == false){
        System.out.println("");
        System.out.println("Please enter a valid answer(Yes/No)");
        s=input.nextLine();
      }
      if (s.equals("Yes") == true){
        delete(first);
        System.out.println("");
      }
      return next;
    }
    System.out.println("Your wish-list is empty. Add movies to your wish list before accessing.");
    return null;
  }

  //insert x as the last element in the list
  public void insert(Movie x){
    wish[n] = x;
    n++;
  }

  //insert a movie node x at index of i
  public void inserti(Movie x, int i){
    if (i < first){
      first = i;
    }
    if (wish[i]==null){
      wish[i]=x;
    }
    else{
      int a=i;
      while(wish[a+1]!=null){
        a++;
      }
      for (int j = a; j >=i; j--){
        wish[j+1] = wish[j];
      }
      wish[i] = x;
    }
    n++;
  }

  //print out the available movies' information in user's wish list
  public void printMovies(){
    if (n != 0){
      System.out.println("There are " + n + " movies in the wish list.");
      for(int i = 0; i < 20; i++){
        if (wish[i] != null){
          System.out.println("Index: " + (i+1) + " ID: " + wish[i].getID() + " Name: " + wish[i].getTitle());
        }
      }
    }
    else{
      System.out.println("The wish list is empty.");
    }
  }

  //test code
  public static void main(String[] args){
    WatchList myWish = new WatchList();
  	Movie PulpFiction = new Movie("Pulp Fiction", 19940814, 00001, 94);
    myWish.insert(PulpFiction);
  	Movie TheRing = new Movie("The Ring", 20021018, 00002, 55);
    myWish.insert(TheRing);
    Movie ParentTrap = new Movie("Parent Trap", 19980720, 00003, 64);
    myWish.insert(ParentTrap);
    Movie BackToTheFuture = new Movie("Back To The Future", 19850703, 00004, 96);
    myWish.inserti(BackToTheFuture, 2);
    myWish.printMovies();
    System.out.println();

    myWish.nextMovie();
    myWish.printMovies();
    System.out.println();

    System.out.println("Delete the movie at the index of 1.");
    myWish.delete(1);
    myWish.printMovies();
    System.out.println();

    Movie Psycho = new Movie("Psycho", 19600908, 00006, 70);
    myWish.inserti(Psycho, 10);
    myWish.printMovies();
  }
}
