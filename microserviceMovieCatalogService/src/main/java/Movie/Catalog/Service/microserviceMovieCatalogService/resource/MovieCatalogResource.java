package Movie.Catalog.Service.microserviceMovieCatalogService.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/{UserId}")
    public List<CatalogItem> getCatalogs(@PathVariable("UserId") String UserId){

        RatingListResource rating = restTemplate.getForObject("http://MOVIERATINGSERVICE/ratingsdata/users/"+UserId,RatingListResource.class);
        List<CatalogItem> cs = new ArrayList<>();

        for(Rating ratings : rating.getList() ){
            Movie movie=restTemplate.getForObject("http://MovieInfoService/movies/"+UserId,Movie.class);
            if(ratings.getMovieId().equals(UserId))
                 cs.add(new CatalogItem(movie.getName(),"des", ratings.getRating()));
        }
        return cs;
//        return items.stream().map(rating-> {
//            Movie movie=restTemplate.getForObject("http://localhost:8080/movies/"+rating.getMovieId(),Movie.class);
//            return new CatalogItem(movie.getName(),"des",rating.getRating());
//        }).collect(Collectors.toList());
    }
}
