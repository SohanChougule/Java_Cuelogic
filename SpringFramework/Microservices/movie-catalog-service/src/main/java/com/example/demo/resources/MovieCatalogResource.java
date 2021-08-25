package com.example.demo.resources;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.models.CatalogItem;
import com.example.demo.models.Movie;
import com.example.demo.models.Rating;
import com.example.demo.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	private RestTemplate restTemplate; 
	  
	@Autowired
	private WebClient.Builder webBuilder; 
	
	
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

		
//		return Collections.singletonList(
//				new CatalogItem("Transformer", "Test", 4)
//			);
//		
		
//	  RestTemplate restTemplate = new RestTemplate();
	  
	  // get all rated movies 
	  UserRating ratings = restTemplate.getForObject("http://localhost:9083/ratingsdata/users/"+userId, UserRating.class);
	  
	  return ratings.getUserRating().stream().map(rating -> { 
		// for each movie id, call movie info service and get details
		  Movie movie = restTemplate.getForObject("http://localhost:9082/movies/"+rating.getMovieId(), Movie.class);
			
//		  Movie movie = webBuilder.build().get()
//				  .uri("http://localhost:9082/movies/"+rating.getMovieId())
//				  .retrieve().bodyToMono(Movie.class).block();

		// put them all together
		  return new CatalogItem(movie.getName(), "Test",rating.getRating());	  
	  
	  }).collect(Collectors.toList());
		 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
		
	  
	}
}
