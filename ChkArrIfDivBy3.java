package arrques1;

public class ChkArrIfDivBy3 {
	static int isPossible(int N, int arr[]){
		  int sum=0;
		  for(int i=0;i<N;i++){
		     
		          sum +=arr[i]%10;
		          arr[i] /=10;
		      
		  }
		  return (sum%3==0) ?1 :0;
		      }

	public static void main(String[] args) {
int a[]= {10,20,30,50};
int n=a.length;
System.out.println("it iss "+isPossible(n, a));

	}

}
