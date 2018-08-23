package tobesolved;

/*
 * If we notice, there is just one index in the complete array, where the numbers start decreasing.

    Each number in the left of this point is greater than the last element in the array.
    Each element in the right of this point is smaller than the last element in the array.
    Lets find a middle index M in the range [L .. R] and probe it in comparison to the last element of the array
    If the element is smaller than the last,
        the point of rotation definitely lies in the left of the middle element
        Hence, redefine the range for probing [L .. M – 1]
    Else
        The point of rotation certainly lies in the right of the middle element
        Hence, redefine the range for probing [M+1, L]
    Re-calculate the M and repeat the probing.
    Terminate the loop when start is not less than or equal to end

 */
public class FindTheRotationPoint {

}
