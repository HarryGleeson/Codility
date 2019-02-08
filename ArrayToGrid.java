/*
 * The challenge was to write a program that takes as input an array, A and 
 * an integer, K, representing the number of columns in each row of the output
 * grid. For example, given as input the array A{4, 35, 80, 123, 12345, 44, 8, 5, 24, 3}
 * and K= 4, the program should output: 
	+-----+-----+-----+-----+
	|    4|   35|   80|  123|
	+-----+-----+-----+-----+
	|12345|   44|    8|    5|
	+-----+-----+-----+-----+
	|   24|    3|
	+-----+-----+
 */
class ArrayToGrid {
    public static void solution(int[] A, int K) {
        // write your code in Java SE 8
    		int max = 0;

    		int lines = (int) Math.ceil((double)A.length/K);
    		for(int i=0; i<A.length; i++) {
    			if(A[i]>max) {
    				max = A[i];
    			}
    		}
    		String maxString = Integer.toString(max);
    		int maxLength = maxString.length();
    		String numString;
    		String spaceLine = "+";
    		String[] output = new String[lines+(lines+1)];
    		int c = 0;
    		if(K>A.length) {
    			for(int j=0; j<A.length; j++) {
    				for(int i=0; i<maxLength; i++) {
    					spaceLine+="-";
    				}
    				spaceLine+="+";
    			}
    		}
    		else {
	    		for(int j=0; j<K; j++) {
	    				for(int i=0; i<maxLength; i++) {
	    					spaceLine+="-";
	    				}
	    				spaceLine+="+";
	    		}
    		}
    		output[0]=spaceLine;
    		for(int i=1; i<output.length; i++) {
    			if(i%2==0) {
    				if(i!=output.length-1||A.length%K==0) {
    					output[i]=spaceLine;
    				}
    				else {
    					output[i]="+";
    					for(int j=0; j<(A.length%K); j++) {
    	    					for(int h=0; h<maxLength; h++) {
    	    						output[i]+="-";
    	    					}
    	    				output[i]+="+";
    					}
    	    			}
    			}
    			else {
    				output[i] = "|";
    				for(int j = 0; j<K; j++) {
    					if(j >= A.length||c>=A.length){
    						break;
    					}
    					else
    						numString = Integer.toString(A[c]);
    					for(int l=0; l<maxLength-numString.length(); l++) {
        					output[i]+=" ";
        				}
    				output[i]+=A[c]+"|";
    				c++;
    				}
    			}
    		}
    			
    		for(int i=0; i<output.length; i++) {
    			System.out.println(output[i]);
    		}
    			
    }
    
    public static void main(String[] args){
		int[] A = {4, 35, 80, 123, 12345, 44, 8, 5, 24, 3};
    		solution(A, 4);
    }
}