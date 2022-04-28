package com.aniket.ratingsdataservice.resources;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniket.ratingsdataservice.models.Rating;
import com.aniket.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping(path = "/ratings")
public class RatingsDataResource {

    @GetMapping(path = "/{movieId}")
    public Rating getRatings(@PathVariable("movieId") String movieId){

        return new Rating(movieId, 5);
    }

    @GetMapping(path = "/users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId){

    	UserRating userRating = new UserRating();
    	userRating.setUseRatings(Arrays.asList(
                new Rating("1", 5),
                new Rating("2", 4)
        ));

    	return userRating; 
    }
}