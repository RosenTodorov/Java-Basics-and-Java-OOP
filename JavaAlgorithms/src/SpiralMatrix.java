import java.util.Scanner;


public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a positive integer number N (N < 20): ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		drawMatrix(number);
	}
	public static void drawMatrix(int number) {
		int[][] matrix = new int[number][number];
		int row = 0;
		int col = 0;
		String direction = "left"; // pochvame ot dqsno na lqvo da varvim v obratna posoka
		int maxRange = number * number;
		
		for (int i = 1; i <= maxRange; i++) {
			if (direction == "left" && (col < 0 || matrix[row][col] != 0)) {
				direction = "down";
				col++;
				row++;
			}
			if (direction == "down" && (row > number - 1 || matrix[row][col] != 0)) {
				direction = "right";
				row--;
				col++;
			}
			if (direction == "right" && (col > number - 1 || matrix[row][col] != 0)) {
				direction = "up";
				col--;
				row--;
			}
			if (direction == "up" && (row < 0 || matrix[row][col] != 0)) {
				direction = "left";
				row++;
				col--;
			}	
			
			matrix[row][col] = i;
			
		    if (direction == "left")
	        {
	            col--;
	        }
	        if (direction == "down")
	        {
	            row++;
	        }
	        if (direction == "right")
	        {
	            col++;
	        }
	        if (direction == "up")
	        {
	            row--;
	        }
		}
	        
	        for (int r = 0; r < number; r++) {
	        	for (int c = 0; c < number; c++) {
	        		System.out.print(matrix[r][c] + "\t");
	        	}
	        	System.out.println();
	        }
		}	
	}

