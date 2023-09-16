package Movie.Catalog.Service.microserviceMovieCatalogService.resource;

import java.util.List;

public class RatingListResource {
    private List<Rating> list;

    public RatingListResource() {
    }

    public RatingListResource(List<Rating> list) {
        this.list = list;
    }

    public List<Rating> getList() {
        return list;
    }

    public void setList(List<Rating> list) {
        this.list = list;
    }
}
