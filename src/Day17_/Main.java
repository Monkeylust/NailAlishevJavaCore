package Day17_;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] icons = new String[8];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < icons.length; i++) {
            if (i > 3) {
                icons[i] = ChessPiece.ROOK_BLACK.getName();
            } else {
                icons[i] = ChessPiece.PAWN_WHITE.getName();
            }
        }
        for (String string : icons) {
            sb.append(string).append(" ");
        }
        System.out.println(Arrays.toString(icons));
        System.out.println(sb);
    }
}