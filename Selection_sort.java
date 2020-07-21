

public class Main
{
    public int[] sorted_arry(int [] unsorted_array){
        
        int len_array = unsorted_array.length;
        for (int i = 0; i<len_array-1; i++){
            
            int min_val = i;
            for (int j =i+1; j< len_array; j++){
                if(unsorted_array[j]< unsorted_array[min_val]){
                    
                    min_val = j;
                }
                
            }
            
            int temp = unsorted_array[min_val];
            unsorted_array[min_val] = unsorted_array[i];
            unsorted_array[i] = temp;
            
            
            
            
        }
        
        
       return  unsorted_array;
        
    }
    
    
    
    
    
    
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] a = {2, 8,2,3,9,5,1};
		Main main1 =  new Main();
		int[] sorted_array_val = main1.sorted_arry(a);
		
		for (int i=0; i<sorted_array_val.length; ++i) {
            System.out.print(sorted_array_val[i] + " "); 
            
		}

	}
	
	
	
	
	
	
}
