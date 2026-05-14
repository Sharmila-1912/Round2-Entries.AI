import java.util.*;
public class Problem4{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
int sum=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	int target=s.nextInt();
	for(int i=0;i<n;i++){
		for(int j=1;j<=n;i++){
sum=a[i]+a[j];
if(sum==target){
System.out.println(a[i]+a[j]);
}else{
System.out.println("[]");
}
}
}
}
}