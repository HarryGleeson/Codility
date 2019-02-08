/*
 * This exercise required a program that took as input 2 strings, each representing 
 * a players hand of cards, with each character of each string representing an
 * individual card. Each card in each hand is compared and the winner is the player
 * who's card has a higher numeric value where an ace is worth 13, king 12, queen 11
 * and jack 10. The program returns the number of cards player A won with.
 */

public class HigherCardGame {
	public static void main(String[] args){
		System.out.println(solution("23A84Q", "K2Q25J"));
	}
    public static int solution(String A, String B) {
        char[] Aarray = A.toCharArray();
        char[] Barray = B.toCharArray();
        int[] alecArray = new int[Aarray.length];
        int[] bobArray = new int[Barray.length];
        int alecWins = 0;
        for(int i=0; i<Aarray.length; i++) {
	        		if(Aarray[i]=='A')
	        			alecArray[i]=13;
	        		else if(Aarray[i]=='K') {
	        			alecArray[i]=12;
	        		}
	        		else if(Aarray[i]=='Q') {
	        			alecArray[i]=11;
	        		}
	        		else if(Aarray[i]=='J') {
	        			alecArray[i]=10;
	        		}
	        		else
	        			alecArray[i] = Character.getNumericValue(Aarray[i]);
        			
        }
        
        for(int i=0; i<Barray.length; i++) {
	    		if(Barray[i]=='A')
	    			bobArray[i]=13;
	    		else if(Barray[i]=='K') {
	    			bobArray[i]=12;
	    		}
	    		else if(Barray[i]=='Q') {
	    			bobArray[i]=11;
	    		}
	    		else if(Barray[i]=='J') {
	    			bobArray[i]=10;
	    		}
	    		else
	    			bobArray[i] = Character.getNumericValue(Barray[i]);
    			
        }
        
        for(int i=0; i<alecArray.length; i++) {
        		if(alecArray[i]>bobArray[i]) {
        			alecWins++;
        		}
        }
        return alecWins;
    }
}
