public class rreversingarray {
    public static void main(String[] args) {
        int num[]={2,3,5,7,8,9,12,14,25,54,76};


        reverse(num);
        for(int i=0; i<num.length; i++)
        {
            System.out.print(num[i]+" ");

        }
        System.out.println();
    }
    public static void reverse(int num[])
    {
        int start = 0; 
        int end = num.length -1;
        int temp;
        while(start<end)
        {
            temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
            

        }
         
    }
}
