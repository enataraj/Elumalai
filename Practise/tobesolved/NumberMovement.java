package tobesolved;

public class NumberMovement {
	
	private static void numberfind(int a[]){
		int i =0;
		int j= a.length-1;
		int count = 0;
		while(i<j){
			if(a[i] == 0){
				if(a[j] == 1){
					count = count + (j-i);
					a[i]=1;
					a[j] =0;
				}else{
					j--;
				}
			}else{
				i++;
			}
		}
		
		System.out.println("Count : "+count);
		
	}
	
	private static void approach2(int a[]){
		int count =0;
		for(int i =0;i<a.length;i++){
			if(a[i] == 1){
				continue;
			}else{
				for(int j =a.length-1;j>=i;j--){
					if(a[j] ==0){
						continue;
					}else{
						count = count+(j-i);
						a[i] = 1;
						a[j] = 0;
						MyUtil.printArray(a);
						break;
						
					}
				}
			}
		}
		
		System.out.println("Count : "+count);
	}
	
	public static void main(String[] args) {
		int a[] = {1,1,1,1,0,1,0,1};
		numberfind(a);
//		approach2(a);
	}

}
