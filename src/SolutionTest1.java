/**
A zero-indexed array A consisting of N integers is given. An equilibrium index of this array is any integer P such that 0 ≤ P < N and the sum of elements of lower indices is equal to the sum of elements of higher indices, i.e.
A[0] + A[1] + ... + A[P−1] = A[P+1] + ... + A[N−2] + A[N−1].
Sum of zero elements is assumed to be equal to 0. This can happen if P = 0 or if P = N−1.

For example, consider the following array A consisting of N = 8 elements:

  A[0] = -1
  A[1] =  3
  A[2] = -4
  A[3] =  5
  A[4] =  1
  A[5] = -6
  A[6] =  2
  A[7] =  1
P = 1 is an equilibrium index of this array, because:

A[0] = −1 = A[2] + A[3] + A[4] + A[5] + A[6] + A[7]
P = 3 is an equilibrium index of this array, because:

A[0] + A[1] + A[2] = −2 = A[4] + A[5] + A[6] + A[7]
P = 7 is also an equilibrium index, because:

A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] = 0
and there are no elements with indices greater than 7.

P = 8 is not an equilibrium index, because it does not fulfill the condition 0 ≤ P < N.

Write a function:

int solution(int A[], int N);

that, given a zero-indexed array A consisting of N integers, returns any of its equilibrium indices. The function should return −1 if no equilibrium index exists.

For example, given array A shown above, the function may return 1, 3 or 7, as explained above.

Assume that:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 */
public class SolutionTest1 {
    public int solution(int[] A) {
        int result = -1;
        int length, sumLeft = 0, sumRight = 0;
        if (A != null) {
            length = A.length;
        }   else    {
            return result;
        }
        if (length == 0)    {
            return result;
        }
        if (length == 1 && A[0] == 0)    {
            return 0;
        }
        if (length == 1 && A[0] != 0)    {
            return result;
        }
        for (int j = 0; j < length; j++) {
            for (int i = j + 1; i < length; i++) {
                sumRight = sumRight + A[i];
            }
            for (int i = j - 1; i > 0; i--) {
                sumLeft = sumLeft + A[i];
            }
            if (j == 0 && sumRight == 0)    {
                return 0;
            }
            if (sumLeft == sumRight)    {
                return j - 1;
            }
            sumLeft = 0;
            sumRight = 0;
            System.out.println("J = " + j);
        }
        return result;
        // write your code in Java SE 8
    }

    public static void main(String[] args)  {
        SolutionTest1 solutionTest1 = new SolutionTest1();
        int[] ar = null;
        int[] array = new int[0];
        int[] array0 = {};
        int[] array1 = { 0 };
        int[] array1_1 = { -3 };
        int[] array2 = { 0, 0 };
        int[] array2_1 = { 0, 0, 0 };
        int[] array2_2 = { 0, 0, 0, 0, 0, 0, 0 };
        int[] array2_3 = { 0, 0, 0, 9, 0, 0, 0 };
        int[] array3 = { -1, 3, -4, 5, 1, -6, 2, 1 };
        int[] array4 = { -2, 147, 483, 648, 2, 147, 483, 647 };
        System.out.println(solutionTest1.solution(array3));
    }
}
/*

 */