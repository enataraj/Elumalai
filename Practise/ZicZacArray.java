import tobesolved.MyUtil;

public class ZicZacArray {

	public static void convertZicZac(int[] a){
		int i=1;
		boolean flag = false; 
		while(i<a.length-2){
			if((a[i]>a[i+1])&& flag){
				
				int t = a[i];
				a[i] = a[i+1];
				a[i+1]  = t;
			}else if((a[i]<a[i+1])&& !flag){
				int t = a[i];
				a[i] = a[i+1];
				a[i+1]  = t;
				
			}
			i++;
			flag = !flag;
		}
		
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]);
			if(j%2==0){
				System.out.print(" < ");
			}else{
				System.out.print(" > ");
			}
		}
		
	
	}
	public static void main(String[] args) {
		int a[] = {3,2,4,2,5,6,32,5,34,5};
		convertZicZac(a);
		
	}
}
