/**
 * ManWolf
 * 
 * This class will be used to do all the calculations on the given route. It checks the given string against
 * the matrix table to see if it leads to a correct end state.
 * 
 * Parameters:
 * 	route: the given route from the command line
 * 
 * Return Value: String telling the user if the route is accepted or not
 */
public class ManWolf
{
	
	private static final int q0 = 0;
	private static final int q1 = 1;
	private static final int q2 = 2;
	private static final int q3 = 3;
	private static final int q4 = 4;
	private static final int q5 = 5;
	private static final int q6 = 6;
	private static final int q7 = 7;
	private static final int q8 = 8;
	private static final int q9 = 9;
	private static final int q10 = 10;
	
	private static int currState = q0;
	
	private static int[][] delta ={
		/*q0*/ {q1, q5, q5, q5},
		/*q1*/ {q0, q5, q5, q2},
		/*q2*/ {q5, q3, q4, q1},
		/*q3*/ {q6, q2, q5, q5},
		/*q4*/ {q7, q5, q2, q5},
		/*q5*/ {q5, q5, q5, q5},
		/*q6*/ {q3, q5, q8, q5},
		/*q7*/ {q4, q8, q5, q5},
		/*q8*/ {q5, q7, q6, q9},
		/*q9*/ {q10, q5, q5, q8},
		/*q10*/ {q9, q5, q5, q5}
		};
	
	/**
	 * checkAlphabet
	 * 
	 * This function checks to see if the string input that the user puts in correctly links up to the alphabet that the language follows
	 * 
	 * @param 
	 * 		route: the string that is inputted and needs to be check to see if it follows the alphabet
	 * 
	 * @return
	 * 		alphacheck: boolean that will return false if the alphabet doesn't link up to the language
	 */
	public static boolean checkAlphabet(String route)
	{
		boolean alphacheck = true;
		char[] alphabet = {'n', 'g', 'w', 'c'};
		
		
		for (int i = 0; i < route.length(); i++)
		{
			char curr = route.charAt(i);
			for (int j = 0; j < alphabet.length; j++)
			{
				if (curr == alphabet[j])
				{
					break;
				}
				else if (j == alphabet.length - 1 && curr != alphabet[j])
				{
					alphacheck = false;
				}
				
			}
		}
		
		return alphacheck;
	}

	
	public static String checkRoute (String route)
	{
		for(int i = 0; i < route.length(); i++)
		{
			char curr = route.charAt(i);
			//System.out.println(currState);
			//System.out.println(curr);
			if (curr == 'g')
			{
				//System.out.println("you are at g");
				currState = delta[currState][0];
			}
			else if (curr == 'w')
			{
				currState = delta[currState][1];
			}
			else if (curr == 'c')
			{
				currState = delta[currState][2];
			}
			else if (curr == 'n')
			{
				currState = delta[currState][3];
			}
		}
		if (currState == 10)
		{
			return "Congrats, thats corrrect";
		}
		else
		{
			return "That is not a correct answer";
		}
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//Test the alphabet checker function
		//System.out.println(checkAlphabet("gnwcc"));
		
		System.out.println(checkRoute("ggggggggg"));
	}

}
