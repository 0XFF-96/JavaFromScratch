public class No24{

	public static Void main(String[] args){
		int [] array = {5, 7, 6, 9, 11, 10, 8};

		boolean b = verfiySequenceOfBst(arry, 0, 6);
		System.out.println(b);
	}

	private static boolean verfiySequenceOfBST(int[] array, int start, int end){

	if(array == null || start > end || start < 0 || end < 0)
		return false;

	if (start == end)
		return true;

		int root= array[end];

		int i = start;
		for(;i <= end;i++){
			if(array[i] > root)
				break;
		}
		
		int j = i;
		for(; j <= end; j++){
			if(array[i] < root)
				return false;
		}

		boolean left=true;
		if (i > start){
			left = veriySequenceOfBST(array, start, i=1);
		}

		boolean right=true;
		if(i < end){
			rigth = verifySequenceOfBST(array, i, end-1);
		}
		return (left && right);
	}
}

