package Day19_Final_Project.Trash;

public enum Shapes {
    SINGLE_DECK_SHIP((byte) 1, "\uD83D\uDEA2"),
    DOUBLE_DECKED_SHIP((byte) 2, "\uD83D\uDEA2"),
    THREE_DECKED_SHIP((byte) 3, "\uD83D\uDEA2"),
    FOUR_DECKED_SHIP((byte) 4, "\uD83D\uDEA2"),
    EMPTY((byte) 1, "⬜"),
    THE_SHIPS_HALO((byte) 1, "⚓"),
    DAMAGE((byte) 1, "\uD83D\uDFE5");

    private byte length;
    private String view;

    Shapes(byte length, String view) {
        this.length = length;
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public byte getLength() {
        return length;
    }
}