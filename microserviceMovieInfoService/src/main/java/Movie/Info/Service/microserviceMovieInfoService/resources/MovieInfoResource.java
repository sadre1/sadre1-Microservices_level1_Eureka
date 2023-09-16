package Movie.Info.Service.microserviceMovieInfoService.resources;

import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {
    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable String movieId){

             List<Movie> movies= Arrays.asList( new Movie("1234","JAVAN"),
                new Movie("2345","pathan"));
             for(Movie m:movies){
                 if(m.getMovieId().equals(movieId))
                     return m;
             }
             return null;
    }
}
