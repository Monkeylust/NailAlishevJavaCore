package Day19_Final_Project.SeaWar;

public enum Field {
    SHIP("\uD83D\uDEA2"),
    EMPTY("\uD83D\uDFE8"),
    THE_SHIPS_HALO("🌊"),
    DAMAGE("\uD83D\uDFE5"),
    WAVE("✅"),
    RIP("⚓");

    private String view;

    Field(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }
}