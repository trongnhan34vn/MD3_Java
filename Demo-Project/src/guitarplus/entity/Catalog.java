package guitarplus.entity;

public class Catalog {
    private int catalogId;
    private String catalogName;
    private boolean catalogStatus;

    public Catalog(int catalogId, String catalogName, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.catalogStatus = catalogStatus;
    }

    public Catalog() {
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
}
