/*
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.

Write a function:

int solution(int N);
that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn’t contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.

Assume that:

N is an integer within the range [1..2,147,483,647].
 */

public class BinaryGap {
	public static String toBinary(int N) {
		return Integer.toBinaryString(N);
	}
	
	public static int solution(int N) {
		char[] binary = toBinary(N).toCharArray();
		int oneCount=0;
		int longest = 0;
		for(int i=0; i<binary.length; i++) {
			if(binary[i]=='1') {
				oneCount++;
			}
		}
		if(oneCount<2||oneCount>=binary.length) {
			return 0;
		}
		else {
			int x = 0;
			for(int i=0; i<binary.length; i++) {
				if(binary[i]=='1') {
					int currentLong = 0;
					if(i+1<=binary.length) {
						x = i+1;
						if(x<binary.length) {
							while(binary[x]=='0') {
								currentLong++;
								x++;
								if(x>=binary.length) {
									break;
								}
							}
						}
					}
				if(currentLong>longest) {
					longest = currentLong;
				}
					else
						break;
					
				}
			}
		}
		
		return longest;
        // write your code in Java SE 8
    }
	
	public static void main(String[] args){
		 System.out.println(solution(1041));
	 }
}