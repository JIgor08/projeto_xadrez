package board_layer;

public class Piece {
    protected Position position;
    public boolean possibleMove(Position position) {
        return true;
    }

    public boolean[][] possibleMoves() {
        return new boolean[8][8];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
