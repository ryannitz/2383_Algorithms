public class InsertSort{
	public static void main(String args[]){
		int[] A = {7,4,8,2,5,3,9};
		sort(A);
		show(A); //display the sorted result A
	}

	public static void sort(int[] A){

	}

	public static void show(int[] A){
		String strArray = "Empty array";
		if(A.length > 0) {
			strArray = "{" + A[0];
			for (int i = 1; i < A.length; i++) {
				strArray += "," + A[i];
			}
			strArray += "}";
		}
		System.out.println(strArray);
	}


}