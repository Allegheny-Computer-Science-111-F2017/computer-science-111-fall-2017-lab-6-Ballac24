package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/** This program takes a string of DNA and prints the compliment of that DNA.
   *
   *
   */
public class ManipulateDna {
  /** This program will prompt the user to type a string of DNA.
   * It will then pring the complement at that DNA.
   */
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Chase Balla " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String input = scanner.nextLine();
    final String dna = input.toUpperCase();
    // Step Two: Compute the complement of the DNA String
    String dnacomp = dna;
    System.out.println("Okay I am going to manipulate the DNA string" + dna);

    dnacomp = dnacomp.replace('T','X');
    dnacomp = dnacomp.replace('A','Y');
    dnacomp = dnacomp.replace('G','Z');
    dnacomp = dnacomp.replace('C','W');

    dnacomp = dnacomp.replace('X','A');
    dnacomp = dnacomp.replace('Y','T');
    dnacomp = dnacomp.replace('Z','G');
    dnacomp = dnacomp.replace('W','C');

    // Printing the compliment 
    System.out.println("Here is the compliment of the dna sequence: " + dnacomp);
    System.out.println("Complement of ACTG is " + dnacomp);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    String allowed = "CGTA";
    Random ran = new Random();
    int randomNum = ran.nextInt(4);
    char randomletter = allowed.charAt(randomNum);
    System.out.println("Inserting " + randomletter + " at position 0 gives " + randomletter + dna);

    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int randompos = ran.nextInt(dna.length());
    String dnadelete = ("" + dna.substring(0, randompos)
        + dna.substring(randompos + 1, dna.length()));

       

    System.out.println("Deleting from postion " + (randompos + 1) + " gives " + dnadelete);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int randomNum2 = ran.nextInt(dna.length());
    char randomletter2 = allowed.charAt(randomNum2);
    int randomNum3 = ran.nextInt(dna.length());

    String dnasub = "" + dna.substring(0, randomNum2) + randomletter2
        + dna.substring(randomNum2 + 1, dna.length());
    System.out.println("Changing position " + (randomNum2 + 1) + " gives " + dnasub);

    // Step Six: Display a final thankyou message
    System.out.println("\nThank you for using the ManipulateDna program. \n Have a nice Day! ");

  }

}
