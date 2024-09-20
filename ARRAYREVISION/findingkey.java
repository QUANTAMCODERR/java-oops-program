import java.util.*;

public class findingkey {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,7,545,44,32,23};
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the key to find...");
        int key = sc.nextInt();
        boolean keyy=findkey(num, key);
        if(keyy==true)
        {
            
        }
        else
        System.out.println("the key does not found please enter the valid key...!");


    }

    public static boolean findkey(int num[], int key)
    {
        for(int i = 0 ; i <num.length; i++)
        {
            if (num[i]==key) {
                System.out.println("the key found at ..:"+num[i]+"th position" );
                return true;
            }
           
         }
        return false;
    }
}
