package entities;

import characteristics.ChessPosition;
import characteristics.Color;

public class ChessMatch {

	int turn;
	Color currentPlayer;
	boolean check;
    boolean cheackMate;
    ChessPiece enPassantVulnerable;
    ChessPiece promote;
    
    
   public ChessPiece[][] getPiece(){}

   public boolean[][] possibleMoves(ChessPosition sourcePosition){}

   public ChessPiece performChessMove(ChessPosition sourceposition; Chesspositon targetPosition ) {}
   
   public ChessPiece  replacePromotePiece(String type); 
   
  
}
