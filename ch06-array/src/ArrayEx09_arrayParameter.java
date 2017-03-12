
public class ArrayEx09_arrayParameter {

	public static void main(String[] args) {

		int[] arr={1, 2, 3, 4, 5};
		
		int[] ref={10, 20, 30, 40, 50, 60};
		
		
		ref = addArray(arr,10);
		
		if(arr == ref)
			System.out.println("같은 배열");
		else
			System.out.println("다른 배열");
		
		System.out.println(arr);
		System.out.println(ref);
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] addArray(int[] arr, int addVal){
		
		for(int i=0; i<arr.length; i++){
			arr[i] += addVal;
		}
		
		return arr;
	}

}
