import java.util.Arrays;
//2016-01-19: 100%-100% Codility

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] k ={10,2,5,1,8,20};
		
		System.out.println(solution(k));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
		
		if(A==null) return 0;
		if(A.length<3) return 0;
		
		Arrays.sort(A);
		
		for (int i = 1; i < A.length-1; i++) {
			
			int P=A[i-1];
			int Q=A[i];
			int R=A[i+1];
			
			if(P==Q && Q==R){
				if(P>0)return 1;
				else return 0;
			}
			
			if((P+Q)>R&&(Q+R)>P&&(R+P)>Q){
				return 1;
			}
			
		}
		return 0;
    }

}
