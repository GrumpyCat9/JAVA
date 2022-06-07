import java.util.*;

class bubbleSort 
{
    static void bubbleSort(int arr[], int n)
    {                                       
        if (n == 1)                
        {
            return;
        }

        for (int i=0; i<n-1; i++)
        {
            if (arr[i] > arr[i+1])//check if the elements are in order
            {                        
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
            
        bubbleSort(arr, n-1);  
    }

    void display(int arr[])                 
    {  
        int n = 1;

        System.out.println("---------------------------------------------- ");
        System.out.println("                     ID Sorted                 ");
        System.out.println("---------------------------------------------- ");

        for (int i=0; i<arr.length; ++i) 
        {
            System.out.println(n+ ". " + arr[i]+" ");
            n = n + 1;
        } 
        System.out.println("---------------------------------------------- ");
    } 
     
    public static void main(String[] args)
    {
        bubbleSort show = new bubbleSort();

        int[] array = new int[5];

        Scanner myObj = new Scanner(System.in); 

        System.out.println("********************************************** "); 
        System.out.println("      Enter the ID of the Patrticipants:       "); 
        System.out.println("********************************************** "); 

        int i = 1;

        for(int n=0; n<=4; n++)  
        {    
            System.out.print( i + ". ");
            array[n]=myObj.nextInt();
            
            i= i+1;
        }  

        bubbleSort(array, array.length);
        show.display(array);
    }
}