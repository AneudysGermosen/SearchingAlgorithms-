
public class searchingAlgorithms {
	
	
	
	public static int linSearch(int[] number, int itemthatuyoulookfor) {
		
		for(int x=0;x <= number.length-1;x++) 
			{
			if( itemthatuyoulookfor== number[x])
			{
				return x;
			}
			}
		return -1;
		

		
	}

	public static int binsearch(int[] number, int woah)
	
	{
		int awhat = number.length-1;
		int dextur = 0;
		while(dextur <= awhat) 
		
		{
			int mid = dextur + (awhat-dextur)/2; 
			if(number[mid] == woah)
			{
				return mid;
			}
			else if(number[mid]<woah)
			{
				dextur = mid+1;
			}
			else if(number[mid]>woah)
		
			{
				awhat = mid-1;	
			}
			
		}
		return -1;
	
	}
		
		
		
		
		public static void main(String[] args)
	{
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		int[] test2 = {0,4,5,6,12,15,17,23,29};
		
		System.out.println(binsearch(test1,3));;
		System.out.println(linSearch(test1,3));;
		
		System.out.println(binsearch(test2,23));;
		System.out.println(linSearch(test2,23));;
		
		System.out.println(binsearch(test2,25));;
		System.out.println(linSearch(test2,25));;
		
		System.out.println(binsearch(test1,10));;
		System.out.println(linSearch(test1,1));;
		
		System.out.println(binsearch(test1,1));;
		
		
		


	}
	}

