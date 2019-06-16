package task_01;

public class Eqp2D {

	public static void main(String[] args) {
		//initializes 8x8 board with queens randomly placed/ per col
		startBoard();
		
	}
	
public static void startBoard(){
	// create an 8x8 array for the chess board
			final int CHESS_BOARD = 8;
			int[][] board = new int[CHESS_BOARD][CHESS_BOARD];
			
			int[] q = new int[8];
			
			//ints 0 - n-1
			for(int i = 0; i < 8; i++){
				q[i] = i;
			}
			
			//shuffle
			for(int i = 0; i < 8; i++){
			int r = (int)(Math.random()* (i + 1));
			int swap = q[r];
			q[r] = q[i];
			q[i] = swap;
			}
			
			
			for(int i = 0; i < CHESS_BOARD; i++){	
				for(int j = 0; j < CHESS_BOARD; j++){
					if(q[j] == i){
					board[i][j] = 1;
					System.out.print(board[i][j] + " ");
					}else{
						board[i][j] = 0;
						System.out.print(board[i][j] + " ");
					}
				}
				System.out.println();
			}
}
}
	