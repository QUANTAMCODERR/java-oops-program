/* ok so in this program we have one array of numbers and from that given numbers i have to find the largest number ...  */

public class largestarray
{
    public static void main(String[] args) {
        int num [] = {23,32,43,45,12,65,64};
        System.out.println("the largest value from the given array is :"+getlargest(num));

    }

    // so first i am going to create one function name getlargest

    public static int getlargest(int num[])
    {
        //first we find the minimum value of the array using Integer.Min.Value 
        int largest = Integer.MIN_VALUE;

        // then i will run a loop that iterate from idex o to last index of the array..

        for(int i = 0 ; i< num.length; i++)
        {
            if (largest<num[i]) {
                largest = num[i];
                
            }
        }
        return largest;
    }
}