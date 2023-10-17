/*
* <h1>CommentTypes</h1>
*  This program shows how to format the text for a table in Markdown based on
* initiative order commonly used for Table Top Role Playing Games when run.
*  This program also serves as an example of shifting elements to the left by
* two places in an array.
*
* Programmer: <|David Cox|>
* Version: <|1.0|>
* Since: <|03/07/2022|>
*/

class Main {
  public static void main(String[] args) {
    String[] playerChars = {"Carl", "Barbl", "Remmy", "Roy", "Sqall"}; //sets names for printing
    int[] init = {1, 2, 3, 4, 5}; // used to shift order of names in initiative

    System.out.println("");
    System.out.println("   This program shows how to format the text for a table in Markdown based on initiative order commonly used for Table Top Role Playing Games when run.");
    System.out.println("   This program also serves as an example of shifting elements to the left by two places in an array.");
    System.out.println("");
    System.out.println("For the purpose of formatting the text in the Markdown file:"); //explains purpose when run
    System.out.println(""); 

    for(String pc : playerChars) { // display names in entered order
      System.out.println(pc);
    }
    
    System.out.println("");
    System.out.println("");
    System.out.println("Name | Speed"); // top row of table
    System.out.println("____________");
    
    int first = init[0]; // saves the values of the first two elements in init
    int second = init[1];
    
    for(int i = 0; i < init.length-2; i++) {
      init[i] = init[i+2]; // replaces first three values of init with the values two place right of them
    }
    init[init.length-2] = first; 
    init[init.length-1] = second; // replaces the last two values of init with the original vaulues of the first two elements

    // prints the text version of the table in CombOrd.md 
    int i = 1; // start count for player speed
    for (int in : init) {
      System.out.println(playerChars[in - 1] + " | " + i); // prints player name and speed with bar for formatting
      System.out.println("____________"); // prints next row bar for formatting
      i++; // increases speed by one
    } 
  }
}