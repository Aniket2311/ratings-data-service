package com.aniket.ratingsdataservice.resources;

import com.aniket.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ratings")
public class RatingsDataResource {

    @GetMapping(path = "/{movieId}")
    public Rating setRatings(@PathVariable("movieId") String movieId){

        return new Rating(movieId, 5);
    }
}
