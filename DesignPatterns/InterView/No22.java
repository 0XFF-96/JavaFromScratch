import java.util.Stack;
import javax.sound.sampled.Line;

public class No22{

	public static void main(String[] args){
		Integer[] pushOrder={1, 2, 3, 4, 5}
		Integer[] popOrder={4, 5, 3, 1, 2}
		System.out.println(isRight(pushOrder, popOrder, 5));
	}

	private static boolean isRight(Integer[] pushOrder, Integer[] popOrder, int n){

	Stack<Integer> stack=new Stack<Integer>();
	int count = 0;
	for(int i = 0; i < popOrder.length;i++){
		if(!Stack.isEmpt() && stack.peek() == popOrder[i])
			stack.pop();
		else{
			if(count == pushOrder.length)
				return false;
			else{
				do{
					stack.push(pushOrder[count++];
				}
				while(stack.peek() != popOrder[i] &&count != popOrder.lenght){

				if(stack.peek() == popOrder[i])
				else{
					return fasle;
				}
			}
		}
		return false;
	}
}


