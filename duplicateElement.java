import java.util.Scanner;
public class  duplicateElement{
	public static void main(String ...args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =  scanner.nextInt();
		int []nums = new int[n];
		for(int i = 0 ; i < n ; i++){
			nums[i]=scanner.nextInt();
		}
		int maxi =  Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++){
			maxi=Math.max(nums[i],maxi);
		}
		int [] count =  new int[maxi+1];
		for(int i = 0 ; i < n ; i++){
		count[nums[i]]++;
		}
		for(int i = 0 ; i <=maxi ; i++){
		 if(count[i]==2){
			System.out.println(i);
}
		}
	}
}
