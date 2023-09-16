package Rating.Data.Service.microserviceRatingDataService.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

    @GetMapping("users/{movieId}")
    public RatingListResource getRating(@PathVariable String movieId){
        List<Rating> items = Arrays.asList(
                new Rating("1234",4),
                new Rating("2345",5)
        );
        RatingListResource rs = new RatingListResource();
        rs.setList(items);
        return rs;


    }



}