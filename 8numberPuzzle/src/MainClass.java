import java.util.ArrayList;

public class MainClass {
	
	public static void main (String args[]) {
		
		int[] puzzle = {4,1,2,3,0,5,6,7,8};
		ArrayList<int[]> initialArray = new ArrayList<>();
		initialArray.add(puzzle);
		PuzzleControl.searchForZero(initialArray);
	}

}
