package adpter;

/**
 * SimpleName Class
 * ----------------
 * Stores full name as a single string
 */
public class SimpleName implements SimpleNameInterface {

    private String name;

    @Override
    public void setSimpleName(String name) {
        this.name = name;
    }

    @Override
    public String getSimpleName() {
        return name;
    }
}