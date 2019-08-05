package Matrix;

public class Matrix {
	protected int row;
	protected int column;
	int[][] mat= new int[10][10];
	public Matrix() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				mat[i][j]=0;
			}
		}
	
	}
	public Matrix(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public void setArrayElement(int row, int column, int value)

	{
		mat[row][column]=value;
	}
	
	public void printMatrix() {
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(mat[row][column]);
			}
		}
	}
}
