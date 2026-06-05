package entities;

import characteristics.ChessPosition;
import characteristics.Color;

public class ChessPiece {
	
	Color color;
	int moveCount;
	
    public ChessPosition getChessPosition(){}
    
    protected boolean isThereOponnetPiece(Position position) {}
    
    protected void increaseMoveCount(){}

    protected void decreaseMovesCount(){}
}
