import java.util.*;

class selectionSort 
{ 
    void selectionSort(int arr[]) 
    { 
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) 
        { 
            pos = i; 
            for (int j = i+1; j < arr.length; j++) 
           {
                if (arr[j] < arr[pos])//find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = arr[pos];//swap the current element with the minimum element
            arr[pos] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    void display(int arr[])             
    { 
        System.out.println("---------------------------------------------- ");
        System.out.println("                     ID Sorted                 ");
        System.out.println("---------------------------------------------- ");

        int n = 1;
        for (int i=0; i<arr.length; i++) 
        {
            System.out.println(n + ". " +arr[i]);
            n = n + 1;
        } 
        System.out.println("----------------------------------------------- "); 
    } 
  
    public static void main(String args[]) 
    { 
        selectionSort ob = new selectionSort(); 

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

        ob.selectionSort(array); 
        ob.display(array); 
    } 
} 