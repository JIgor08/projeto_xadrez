import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.Color;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        System.out.println("Chess game started!");
        System.out.println("Enter moves like: e2 e4");
        System.out.println("Castling: move the king two squares toward the rook, for example e1 g1 or e1 c1.");
        System.out.println("Type 'exit' to quit.\n");

        while (!chessMatch.getCheckMate()) {
            printBoard(chessMatch);
            System.out.println("Turn " + chessMatch.getTurn());
            System.out.println("Current player: " + chessMatch.getCurrentPlayer());
            System.out.print("Your move: ");

            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Game ended.");
                break;
            }

            try {
                String[] parts = input.split("\\s+");
                if (parts.length != 2) {
                    System.out.println("Invalid move format. Use: e2 e4");
                    continue;
                }

                ChessPosition source = new ChessPosition(parts[0].charAt(0), Character.getNumericValue(parts[0].charAt(1)));
                ChessPosition target = new ChessPosition(parts[1].charAt(0), Character.getNumericValue(parts[1].charAt(1)));

                chessMatch.performChessMove(source, target);
                System.out.println();
            } catch (Exception e) {
                System.out.println("Invalid move: " + e.getMessage());
                System.out.println();
            }
        }

        if (chessMatch.getCheckMate()) {
            System.out.println("Checkmate! Game over.");
        }

        scanner.close();
    }

    private static String formatPiece(ChessPiece piece) {
        return piece.getColor() == Color.WHITE ? "W" + piece : "B" + piece;
    }

    private static void printBoard(ChessMatch chessMatch) {
        ChessPiece[][] pieces = chessMatch.getPieces();

        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == null) {
                    System.out.print("-  ");
                } else {
                    System.out.print(formatPiece(pieces[i][j]) + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
