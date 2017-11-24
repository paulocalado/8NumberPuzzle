import java.util.Arrays;

public class PuzzleControl {
	
	


	public static int searchForZero(int[] puzzle) {
		int zeroPosition = 0;
		boolean[] directionsArray = {false, false, false, false};
		/*up, down, left, right*/
		
		for(int i=0; i<puzzle.length;i++) {
			if(puzzle[i]==0) {
				zeroPosition = i;
			}
		}
		

		switch(zeroPosition) {
		case 0: 
			directionsArray[0] = false; directionsArray[1] = true;
			directionsArray[2] = false; directionsArray[3] = true;
			break;
		case 1:
			directionsArray[0] = false; directionsArray[1] = true;
			directionsArray[2] = true; directionsArray[3] = true;
			break;
		case 2:
			directionsArray[0] = false; directionsArray[1] = true;
			directionsArray[2] = true; directionsArray[3] = false;
			break;
		case 3:
			directionsArray[0] = true; directionsArray[1] = true;
			directionsArray[2] = false; directionsArray[3] = true;
			break;
		case 4:
			directionsArray[0] = true; directionsArray[1] = true;
			directionsArray[2] = true; directionsArray[3] = true;
			break;
		case 5:
			directionsArray[0] = true; directionsArray[1] = true;
			directionsArray[2] = true; directionsArray[3] = false;
			break;
		case 6:
			directionsArray[0] = true; directionsArray[1] = false;
			directionsArray[2] = false; directionsArray[3] = true;
			break;
		case 7:
			directionsArray[0] = true; directionsArray[1] = false;
			directionsArray[2] = true; directionsArray[3] = true;
			break;
		case 8: 
			directionsArray[0] = true; directionsArray[1] = false;
			directionsArray[2] = true; directionsArray[3] = false;
			break;
		
		default:
			System.out.println("Can~t find");
			break;
		}
		
		createChildren(directionsArray, puzzle, zeroPosition);
		
		return zeroPosition;
	}
	
	public static void createChildren(boolean[] directionsArray, int[] puzzle, int zeroPosition) {
		
		for(int i=0; i< directionsArray.length; i++) {
			
			if(directionsArray[i]) {
				if(i==0) {
					int[] childrenOneArray = Arrays.copyOf(puzzle, puzzle.length);
					childrenOneArray[zeroPosition]=childrenOneArray[zeroPosition-3];
					childrenOneArray[zeroPosition-3] = 0;
					
					System.out.println("Array Children: "+Arrays.toString(childrenOneArray));
					System.out.println(" Array Puzzle: "+Arrays.toString(puzzle));
				}
				
			}
		}
	}
}
