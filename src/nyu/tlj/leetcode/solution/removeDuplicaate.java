package nyu.tlj.leetcode.solution;

public class removeDuplicaate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeDuplicate("aaaaabc");
		

	}
	public static void removeDuplicate(String a) {
		char[] aa = a.toCharArray();
		int len = a.length();
		int index = 1;
		int i = 1,j=0;
		for( i = 1; i < len; i ++ ){
			
			for( j = 0; j < index; j ++ ) {
				if( aa[i] == aa[j] ) {
					break;
				}
			}
			if( j == index){
				
				aa[index++] = aa[i];
			}
		}
		
		aa[index] = 0;
		System.out.println(aa.toString());
	}

}
