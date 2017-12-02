import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PuzzleChecker {
	
	public static HashMap<String, int[]> visitedNodes = new HashMap<>();
	public static int[] arrayAnswer = {0,1,2,3,4,5,6,7,8};
	
	public static  HashMap<String, int[]> checkChildrens(ArrayList<int[]> childrensList) {
		
		for(int[] children : childrensList) {
			
			if(Arrays.equals(children,arrayAnswer )) {
				
				System.out.println("Resposta encontrada! FIM");
				
				System.exit(0);
				
			}else if(visitedNodes.containsValue(children)) {
				System.out.println("nó já visitado");
			}else {
				visitedNodes.put(Arrays.toString(children),children);
				System.out.println(visitedNodes);
				
			}
		}
		
		return visitedNodes;
		
	}
}
