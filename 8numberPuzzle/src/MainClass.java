import java.util.ArrayList;

public class MainClass {
	
	public static void main (String args[]) {
		
		int[] puzzle = {1,4,2,3,8,7,6,0,5};
		ArrayList<int[]> initialArray = new ArrayList<>();
		initialArray.add(puzzle);
		PuzzleControl.searchForZero(initialArray);
	}

}
