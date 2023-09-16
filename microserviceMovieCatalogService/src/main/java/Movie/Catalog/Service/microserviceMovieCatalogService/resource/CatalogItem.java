package Movie.Catalog.Service.microserviceMovieCatalogService.resource;

public class CatalogItem {
    private String name;
    private String des;
    private int rating;

    public CatalogItem(String name, String des, int rating) {
        this.name = name;
        this.des = des;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "CatalogItem{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                ", rating=" + rating +
                '}';
    }
}
