import java.util.*;
public class Main 
{  
public static void main(String[] args)
{  
    
    int[] numArray = {10,6,15,4,1,45};  

    
    int k, temp,j,i;

    
    for(k=1; k<numArray.length-1; k++)   
    {  
        temp = numArray[k];  
        j= k-1;  
        while(j>=0 && temp <= numArray[j])   
        {  
            numArray[j+1] = numArray[j];   
            j = j-1;  
        }  
        numArray[j+1] = temp;  
    }  
    
    
    for(i=0; i<numArray.length; i++)  
       {  
           System.out.print(numArray[i]+ "  ");  
       }  
}  
}  