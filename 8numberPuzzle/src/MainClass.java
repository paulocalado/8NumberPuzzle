import java.util.ArrayList;

public class MainClass {
	
	public static void main (String args[]) {
		
		int[] puzzle = {0,5,3,1,2,6,4,7,8};
		ArrayList<int[]> initialArray = new ArrayList<>();
		initialArray.add(puzzle);
		PuzzleControl.searchForZero(initialArray);
	}

}
