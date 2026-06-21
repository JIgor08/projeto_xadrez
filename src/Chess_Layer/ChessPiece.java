package Chess_Layer;

import Board_Layer.Board;
import Board_Layer.Piece;
import Board_Layer.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() { return color; }
    public int getMoveCount() { return moveCount; }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    protected void increaseMoveCount() { moveCount++; }
    protected void decreaseMoveCount() { moveCount--; }
}