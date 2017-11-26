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
				switch(i) {
				case 0: 
					int[] childrenOneArray = Arrays.copyOf(puzzle, puzzle.length);
					childrenOneArray[zeroPosition]=childrenOneArray[zeroPosition-3];
					childrenOneArray[zeroPosition-3] = 0;
					
					System.out.println("Array Children One: "+Arrays.toString(childrenOneArray));
					System.out.println(" Array Puzzle: "+Arrays.toString(puzzle));
					break;
				case 1:
					int[] childrenTwoArray = Arrays.copyOf(puzzle, puzzle.length);
					childrenTwoArray[zeroPosition] = childrenTwoArray[zeroPosition+3];
					childrenTwoArray[zeroPosition+3] = 0;
				
					System.out.println("Array Children Two: "+Arrays.toString(childrenTwoArray));
					System.out.println(" Array Puzzle: "+Arrays.toString(puzzle));
					break;
				case 2:
					int[] childrenThreeArray = Arrays.copyOf(puzzle, puzzle.length);
					childrenThreeArray[zeroPosition] = childrenThreeArray[zeroPosition-1];
					childrenThreeArray[zeroPosition-1]=0;
					
					System.out.println("Array Children Three: "+Arrays.toString(childrenThreeArray));
					System.out.println(" Array Puzzle: "+Arrays.toString(puzzle));
					break;
					
				case 3:
					int[]childrenFourArray = Arrays.copyOf(puzzle, puzzle.length);
					childrenFourArray[zeroPosition] = childrenFourArray[zeroPosition+1];
					childrenFourArray[zeroPosition+1]=0;
					
					System.out.println("Array Children Four: "+Arrays.toString(childrenFourArray));
					System.out.println(" Array Puzzle: "+Arrays.toString(puzzle));
					break;
				}
					
				
				
				
			}
		}
	}
}
