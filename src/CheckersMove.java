class CheckersMove {
 // A CheckersMove object represents a move in the game of Checkers.
 // It holds the row and column of the piece that is to be moved
 // and the row and column of the square to which it is to be moved.
 // (This class makes no guarantee that the move is legal.)
private int fromRow;
private int fromCol;
private int toCol;
private int toRow;

 // Position of piece to be moved.

 // Square it is to move to.
 
 // Constructor.  Just set the values of the instance variables.
 public CheckersMove(int fromRow1, int fromCol1, int toRow1, int toCol1)
{
  fromRow=fromRow1;
  fromCol=fromCol1;
  toRow=toRow1;
  toCol=toCol1;
 }
 // Accessors
public int getFromRow()
{
  return fromRow;
}
public int getFromCol()
{
  return fromCol;
}
public int getToRow()
{
  return toRow;
}
public int getToCol()
{
  return toCol;
}
public boolean isJump()
{
  return Math.abs(fromRow-toRow)==2;
}
 
}   // end class CheckersMove.
