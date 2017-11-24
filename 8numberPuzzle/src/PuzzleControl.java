
public class PuzzleControl {
	
	


	public static int searchForZero(int[] puzzle) {
		int zeroPosition = 0;
		boolean[] directionsArray = null;
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
		
		default:
			System.out.println("Can~t find");
			break;
		}
		
		return zeroPosition;
	}
	
	public static void createChildren(int zeroPosition, int[] puzzle) {
		
	}
}
