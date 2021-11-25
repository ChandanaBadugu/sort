import java.util.*;
public class Main 
{  
public static void main(String[] args)
{  
    Scanner scan = new Scanner(System.in); 
    int i,j,temp,size;
    
    int arr[] = new int[50]; 


    System.out.print("Array Size : ");  
    size = scan.nextInt(); 
    

    System.out.print("Enter Array Elements : ");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
         

       int n = arr.length;     
       for(i=0; i < n; i++)
       {  
        for(j=1; j < (n-i); j++)
        {  
                 if(arr[j-1] > arr[j])
                 {  
                        //swap elements  
                        temp = arr[j-1];  
                        arr[j-1] = arr[j];  
                        arr[j] = temp;  
                }  
                 
        }
        
        

        System.out.println("Array After Bubble Sort");  
                for(i=0; i < arr.length; i++)
                {  
                        System.out.print(arr[i] + " ");  
                }        
}  

}
