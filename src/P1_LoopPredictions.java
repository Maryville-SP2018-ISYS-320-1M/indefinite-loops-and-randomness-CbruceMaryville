/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/22/2018
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 “zero,” “infinity,” and “unknown” are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats:10 times
 Expected output:1 11 21 31 41 51 61 71 81 91 (1 then increase by 10 each loop)
 (b)
 Repeats: never
 Expected output:max is 10 so loop will do nothing
 (c)
 Repeats:Inf
 Expected output:Loops 250 FOREVERRRR
 (d)
 Repeats: never
 Expected output:Conditions don't meet so prints nothing again!
   
 */

/*
 Was your prediction correct?
 
 (a) Yes
 (b) Yes
 (c) Yes
 (d) Yes

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		// copy and paste the loop to test between here, between the println statements
		// d
		String word = "a";
		while( word.length() < 10 ) {
		    word = "b" + word + "b";
		}
				
		System.out.println("ENDING LOOP TEST");
	}

}
