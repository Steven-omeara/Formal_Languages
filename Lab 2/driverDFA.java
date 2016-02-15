/**
  * file: driverDFA.java
  * author: Steven O'Meara
  * course: CMPT 440
  * assignment: Lab 2
  * due date: February 15, 20116
  * version: 1.3
  * 
  * This file contains the declaration of the driverDFA abstract data
  * type.
  */
public class driverDFA
{
  public static void main(String[] args) 
    {
      String userRoute = args[0];
      boolean checkUserAlpha;
		
      checkUserAlpha = ManWolf.checkAlphabet(userRoute);
      if (checkUserAlpha == true)
        {	
          System.out.println(ManWolf.checkRoute(userRoute));
        }
        else
        {
          System.out.println("The String you Input did not pass the alphabet check.");
        }
    }
}