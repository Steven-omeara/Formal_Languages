/**
  * file: lex.java
  * author: Steven O'Meara
  * course: CMPT 440
  * assignment: Milestone 2
  * due date: May 2, 2016
  * version: 1.3
  * 
  * This file contains the matrix traversal, in switch case format.
  */
public class lex 
{
  /**
   * lexString
   * 
   * This function takes in the a string, which is ripped from the HTML box, and runs this string through 
   * the matrix given in the matrix.java file. It also takes in accept and comment color so that it can
   * change depending on what color the user prefers.
   * 
   * Parameters:
   *   currString: the string that the user puts in to be checked by the DFA
   *   acceptcolor: the color the user wants the accepted tokens to be
   *   commentcolor: the color that the user wants the comments to be
   * 
   * Return value: Returns a string that is in html format to be set as the value of the text in the 
   * html editor.
   */
  public static String lexString(String currString, String acceptcolor, String commentcolor)
    {
      String lexToHTML = "<html><head></head><body>";
      
      String buildNext = "";
      char currChar;
      int currState = 0;
      Boolean commentCheck = false;
      
      //Create the matrix for the DFA
      matrix theMatrix = new matrix();
	  
      //Start the loop through the user given string
      for(int i = 0; i < currString.length(); i++)
      {
        //Get the character to be compared
        currChar = currString.charAt(i);
        //Run the character through the switch case to see what state it ends up at
        switch (currChar)
        {
          case 'a':
              currState = theMatrix.DFAmatrix[currState][0];
              buildNext = buildNext + 'a';
              break;
          case 'b':
              currState = theMatrix.DFAmatrix[currState][1];
              buildNext = buildNext + 'b';
              break;
          case 'c':
              currState = theMatrix.DFAmatrix[currState][2];
              buildNext = buildNext + 'c';
              break;
          case 'd':
              currState = theMatrix.DFAmatrix[currState][3];
              buildNext = buildNext + 'd';
              break;
          case 'e':
              currState = theMatrix.DFAmatrix[currState][4];
              buildNext = buildNext + 'e';
              break;
          case 'f':
              currState = theMatrix.DFAmatrix[currState][5];
              buildNext = buildNext + 'f';
              break;
          case 'g':
              currState = theMatrix.DFAmatrix[currState][6];
              buildNext = buildNext + 'g';
              break;
          case 'h':
              currState = theMatrix.DFAmatrix[currState][7];
              buildNext = buildNext + 'h';
              break;
          case 'i':
              currState = theMatrix.DFAmatrix[currState][8];
              buildNext = buildNext + 'i';
              break;
          case 'j':
              currState = theMatrix.DFAmatrix[currState][9];
              buildNext = buildNext + 'j';
              break;
          case 'k':
              currState = theMatrix.DFAmatrix[currState][10];
              buildNext = buildNext + 'k';
              break;
          case 'l':
              currState = theMatrix.DFAmatrix[currState][11];
              buildNext = buildNext + 'l';
              break;
          case 'm':
              currState = theMatrix.DFAmatrix[currState][12];
              buildNext = buildNext + 'm';
              break;
          case 'n':
              currState = theMatrix.DFAmatrix[currState][13];
              buildNext = buildNext + 'n';
              break;
          case 'o':
              currState = theMatrix.DFAmatrix[currState][14];
              buildNext = buildNext + 'o';
              break;
          case 'p':
              currState = theMatrix.DFAmatrix[currState][15];
              buildNext = buildNext + 'p';
              break;
          case 'q':
              currState = theMatrix.DFAmatrix[currState][16];
              buildNext = buildNext + 'q';
              break;
          case 'r':
              currState = theMatrix.DFAmatrix[currState][17];
              buildNext = buildNext + 'r';
              break;
          case 's':
              currState = theMatrix.DFAmatrix[currState][18];
              buildNext = buildNext + 's';
              break;
          case 't':
              currState = theMatrix.DFAmatrix[currState][19];
              buildNext = buildNext + 't';
              break;
          case 'u':
              currState = theMatrix.DFAmatrix[currState][20];
              buildNext = buildNext + 'u';
              break;
          case 'v':
              currState = theMatrix.DFAmatrix[currState][21];
              buildNext = buildNext + 'v';
              break;
          case 'w':
              currState = theMatrix.DFAmatrix[currState][22];
              buildNext = buildNext + 'w';
              break;
          case 'x':
              currState = theMatrix.DFAmatrix[currState][23];
              buildNext = buildNext + 'x';
              break;
          case 'y':
              currState = theMatrix.DFAmatrix[currState][24];
              buildNext = buildNext + 'y';
              break;
          case 'z':
              currState = theMatrix.DFAmatrix[currState][25];
              buildNext = buildNext + 'z';
              break;
          case '0':
              currState = theMatrix.DFAmatrix[currState][26];
              buildNext = buildNext + '0';
              break;
          case '1':
              currState = theMatrix.DFAmatrix[currState][27];
              buildNext = buildNext + '1';
              break;
          case '2':
              currState = theMatrix.DFAmatrix[currState][28];
              buildNext = buildNext + '2';
              break;
          case '3':
              currState = theMatrix.DFAmatrix[currState][29];
              buildNext = buildNext + '3';
              break;
          case '4':
              currState = theMatrix.DFAmatrix[currState][30];
              buildNext = buildNext + '4';
              break;
          case '5':
              currState = theMatrix.DFAmatrix[currState][31];
              buildNext = buildNext + '5';
              break;
          case '6':
              currState = theMatrix.DFAmatrix[currState][32];
              buildNext = buildNext + '6';
              break;
          case '7':
              currState = theMatrix.DFAmatrix[currState][33];
              buildNext = buildNext + '7';
              break;
          case '8':
              currState = theMatrix.DFAmatrix[currState][34];
              buildNext = buildNext + '8';
              break;
          case '9':
              currState = theMatrix.DFAmatrix[currState][35];
              buildNext = buildNext + '9';
              break;
          case '*':
              currState = theMatrix.DFAmatrix[currState][36];
              buildNext = buildNext + '*';
              break;
          case '-':
              currState = theMatrix.DFAmatrix[currState][37];
              buildNext = buildNext + '-';
              break;
          case '"':
              currState = theMatrix.DFAmatrix[currState][38];
              buildNext = buildNext + '"';
              break;
          case '(':
              currState = theMatrix.DFAmatrix[currState][39];
              buildNext = buildNext + '(';
              break;
          case ')':
              currState = theMatrix.DFAmatrix[currState][40];
              buildNext = buildNext + ')';
              break;
          case '+':
              currState = theMatrix.DFAmatrix[currState][41];
              buildNext = buildNext + '+';
              break;
          case '=':
              currState = theMatrix.DFAmatrix[currState][42];
              buildNext = buildNext + '=';
              break;
          case '~':
              currState = theMatrix.DFAmatrix[currState][43];
              lexToHTML = lexToHTML + "<p>";
              break;
          case ' ':
              currState = theMatrix.DFAmatrix[currState][44];
              buildNext = buildNext + ' ';
              break;
          default:
              //System.out.print("Invalid character: " + currChar);           
              break;
        }
        //System.out.println(currChar + " " + currState);
        //Check the state you get to against accepted states/error state
        switch(currState)
        {
          case 17:
              buildNext = "<font color='"+acceptcolor+"'>" + buildNext + "</font>";
              lexToHTML = lexToHTML + buildNext;
              buildNext = "";
              currState = 0;
              break;
          case 25:
        	  //If at end of file and find that you are at 25, this should be accepted as it is an accept state
        	  if (i == (currString.length() - 1))
        	  {
                buildNext = "<font color='"+acceptcolor+"'>" + buildNext + "</font>";
                lexToHTML = lexToHTML + buildNext;
                buildNext = "";
                currState = 0;
        	  }
        	  else
              {
                //If not at end of file, check to see if the 2nd character is a +, if so its trying a different path
                if(currString.charAt(i+2) != '+')
                {
             	  buildNext = "<font color='"+acceptcolor+"'>" + buildNext + "</font>";
                  lexToHTML = lexToHTML + buildNext;
                  buildNext = "";
                  currState = 0;
                }
              }
              break;
          case 29:
              buildNext = "<font color='"+acceptcolor+"'>" + buildNext + "</font>";
              lexToHTML = lexToHTML + buildNext;
              buildNext = "";
              currState = 0;
              break;
          case 34:
              buildNext = "<font color='"+acceptcolor+"'>" + buildNext + "</font>";
              lexToHTML = lexToHTML + buildNext;
              buildNext = "";
              currState = 0;
              break;
          case 35:
        	  //So that we know that we are in a comment
              commentCheck = true;
              break;
          case 40:
              buildNext = "<font color='"+commentcolor+"'>" + buildNext + "</font>";
              lexToHTML = lexToHTML + buildNext;
              buildNext = "";
              currState = 0;
              commentCheck = false;
              break;
          case 41:
        	  //Check if the current error is in a comment, if it is and the current character is not a * it should stay there as it will all be broken anyway
              if (commentCheck == true && currChar != '*')
              {
                currState = 41;
              }
              else
              {
                buildNext = "<font color='red'>" + buildNext + "</font>";
                lexToHTML = lexToHTML + buildNext;
                buildNext = "";
                currState = 0;
                commentCheck = false; 
              }
              break;
        }
      }
    //If we hit the end and we aren't at an accept state, it is an error so make it so
    if (buildNext.length() > 0)
    {
      buildNext = "<font color='red'>" + buildNext + "</font>";
      lexToHTML = lexToHTML + buildNext;
    }
    //Add the ending tags to the HTML and return it
    lexToHTML = lexToHTML + "</body></html>";
    return lexToHTML;
	}
}
