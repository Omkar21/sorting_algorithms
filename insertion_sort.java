public class Main
{
    public int [] insertion_sort(int [] unsorted_array){
        
        for (int i = 1; i< unsorted_array.length; i++){
            int key = unsorted_array[i];
            int j = i -1;
            
            while(j>=0 && unsorted_array[j]>key){
               unsorted_array[j+1] = unsorted_array[j];
               j = j -1;
                
            }
            
            unsorted_array[j+1] = key; 
            
            
            
        }
        
       return  unsorted_array;
    }
    
  
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int[] a = {2, 8,2,3,9,5,1};
		Main main1 =  new Main();
		int[] sorted_array_val = main1.insertion_sort(a);
		
		for (int i=0; i<sorted_array_val.length; ++i) {
            System.out.print(sorted_array_val[i] + " "); 
            
		}

	}
	
}
