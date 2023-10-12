package homework7;

public enum Terrain {
    FOREST("Густой лес"), PLAIN("Равнина"), SWAMP("Болото");

    private final String description;

    Terrain(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}