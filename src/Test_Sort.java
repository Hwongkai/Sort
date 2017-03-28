
public class Test_Sort {

	public static void mysort_Bubble(double[] ListTest){
		for(int i=0;i<ListTest.length;i++){
			for(int j =0;j<ListTest.length-i-1;j++)
			{
				if(ListTest[j]>ListTest[j+1]){
					double temp = ListTest[j];
					ListTest[j] = ListTest[j+1];
					ListTest[j+1] = temp;
				}
			}
		}	
	}
	public static void mysort_Select(double[] a){
		for(int i =0;i<a.length;i++){
			double min=a[i];
			int pos =-1;
			for(int j =i+1;j<a.length;j++){
				if(a[j]<min){
					min =a[j];
					pos =j;
				}
			}
			if(pos!=-1){
				double temp = a[i];
				a[i] = a[pos];
				a[pos] =temp;
			}
		}
	}

	public static void mysort_Insert(double[] ListTest){
		int l = ListTest.length;
		for(int i =0;i<l-1;i++){
			int j = i+1;
			double x = ListTest[j];
			while(x<ListTest[i]){
				ListTest[i+1] = ListTest[i];
				i--;//往前遍历
			}
			ListTest[i+1] = x;
		}  
	}

	public static void print_my(double[] ListTest){
		for(int i =0;i<ListTest.length;i++){
			System.out.print(ListTest[i] + " ");
		}
		System.out.println("");
	}
	
	public static void mysort_Quick(double[] n,int left,int right){
		int dp;
        if (left < right) {
            dp = partition(n, left, right);
            mysort_Quick(n, left, dp - 1);
            System.out.println(" "+dp);
            mysort_Quick(n, dp + 1, right);
            print_my(n);
        }

	}

	private static int partition(double[] n, int left, int right) {
		// TODO Auto-generated method stub
		double pivot = n[left];
		while(left<right){
			while(left<right && n[right]>=pivot){
				right--;
			} 
			if(n[right]<pivot){
				n[left] = n[right];
				left++;
				
			}
			while(left<right && n[left]<=pivot){
				left++;
			}
			if(n[left]>pivot){
				n[right]=n[left];
				right--;
				
			}
			
		}
		n[left] = pivot;
		
		return left;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] testList = {1,2,3,6,5,75,18,24,7};
		print_my(testList);
		mysort_Bubble(testList);
		print_my(testList);
		double[] testList2 = {1,2,3,6,5,9,8,24,7};
		//mysort_Insert(testList2);
		//mysort_Select(testList2);
		print_my(testList2);
		System.out.println("Processing");
		mysort_Quick(testList2, 0, 8);
		print_my(testList2);
		
	}

}
