import java.util.ArrayList;
import java.util.List;

public class GenerateXOnMatrix {
	/* Given a board of size NxN (4x4 matrix), determine how many ways N queens can be placed on this board 
	 * so that no two queens attack each other (vseki ot 4-te 'X' trqbva da se generirat na pone 2 hoda
	 * edin ot drug).
	 */
	public static boolean isValidMove(int proposedRow, int proposedCol, List<Integer> solution) {
		// we need to check with all queens in current solution
		for (int i = 0; i < proposedRow; ++i) {
			int oldRow = i;
			int oldCol = solution.get(i);
			
			int diagonalOffset = proposedRow - oldRow;
			if (oldCol == proposedCol || oldCol == proposedCol - diagonalOffset || 
					oldCol == proposedCol + diagonalOffset) {
			return false;
			}
		}
		return true;
	}
	
	public static void solveNQueensRec(int n, List<Integer> solution, int row, List<List<Integer>> results) {
		if (row == n) {
			results.add(new ArrayList<Integer>(solution));
			return;
		}
		
		for (int i = 0; i < n; ++i) {
			if (isValidMove(row, i, solution)) {
				solution.set(row, i);
				solveNQueensRec(n, solution, row+1, results);
			}
		}
	}
	public static void solveNQueens(int n, List<List<Integer>> results) {
		List<Integer> solution = new ArrayList<Integer>(n);
		for (int i = 0; i < n; ++i) {
			solution.add(-1);
		}
		solveNQueensRec(n, solution, 0, results);		
	}
}
