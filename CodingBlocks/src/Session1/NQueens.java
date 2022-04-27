package Session1;

public class NQueens {

	public static void main(String[] args) {
		int n=4;
		boolean [][] board=new boolean[n][n];
		QueensP(board,n,0);
		
	}
	private static void QueensP(boolean[][] board,int tl,int row) {
		if(tl==0) {
			display(board);
			return;
		}
		if(row>=board.length) {
			return;
		}
		for ( int col=0;col<board[0].length;col++) {
			if(isissafe(board,row,col)) {
				board[row][col]=true;
				QueensP(board,tl-1,row+1);
				board[row][col]=false;
				
			}
		}
	}
	private static void display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i=0;i<board.length;i++) {
			for (int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	private static boolean isissafe(boolean[][] board, int row, int col) {
		//Forcol
		int r=row;
		while(r>=0) {
			if (board[r][col]==true) {
				return false;
			}
			r--;
		}
		//leftdiagonal
		r=row;
		int c=col;
		while(r>=0 && c>=0) {
			if (board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		//rightdiagonal
		r=row;
		c=col;
		while(r>=0 && c<board[0].length) {
			if (board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		
		return true;//means can place
	}

}
