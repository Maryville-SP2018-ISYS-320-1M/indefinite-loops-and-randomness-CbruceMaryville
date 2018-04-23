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
 Repeats: 10
 Expected output: (starts at 1 then +10 every loop till 91)1 11 21 31 41 51 61 71 81 91
 (b)
 Repeats:Inf
 Expected output: An infinite counting down number
 (c)
 Repeats: Inf
 Expected output: 250 forever. Conditions to stop loop will never be met
 (d)
 Repeats:5 times
 Expected output: bbbbbabbbbb 5 b's on boths sides of word "a"
   
 */

/*
 Was your prediction correct?
 
 (a)yes
 (b)yes
 (c)yes
 (d)yes

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		// copy and paste the loop to test between here, between the println statements
		//d
		String word = "a";
		
		do {
			
		    word = "b" + word + "b";
		    
		} while( word.length() < 10 );
		System.out.println( word );
						
		System.out.println("ENDING LOOP TEST");

	}

}
