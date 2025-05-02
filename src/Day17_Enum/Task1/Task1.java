package Day17_Enum.Task1;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] icons = {
                ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
                ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK
        };
        for (ChessPiece string : icons) {
            System.out.print(string.getView() + " ");
        }
    }
}