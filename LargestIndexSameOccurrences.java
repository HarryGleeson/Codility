/*
 * Given 2 integers, X and Y, and an array, A, return the largest element of the array
 * at which point X and Y have occurred an equal number of times. For example, given 
 * X = 5, Y = 12 and array A = {1, 4, 5, 6, 2, 4, 12, 12, 1, 12}, the program should 
 * return 6.
 */
class LargestIndexSameOccurrences {
    static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }
        return result;
    }
    
    public static void main(String[] args){
		int[] A = {12, 4, 5, 6, 2, 4, 12, 12, 5, 12};
    		System.out.println(solution(5, 12, A));
    }
}
