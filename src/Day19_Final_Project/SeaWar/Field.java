package Day19_Final_Project.SeaWar;

public enum Field {
    SHIP("\uD83D\uDEA2"),
    EMPTY("⬜"),
    THE_SHIPS_HALO("⚓"),
    DAMAGE("\uD83D\uDFE5"),

    ZERO("0\uFE0F⃣"),
    ONE("1\uFE0F⃣"),
    TWO("2\uFE0F⃣"),
    THREE("3\uFE0F⃣"),
    FOUR("4\uFE0F⃣"),
    FIFE("5\uFE0F⃣"),
    SIX("6\uFE0F⃣"),
    SEVEN("7\uFE0F⃣"),
    EIGHT("8\uFE0F⃣"),
    NINE("9\uFE0F⃣");

    private String view;

    Field(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }
}