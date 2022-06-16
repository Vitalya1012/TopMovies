package com.vitaliy.topmovies.data;

import androidx.room.Entity;
import androidx.room.Ignore;

@Entity(tableName = "favourite_movies")
public class FavouriteMovie extends Movie{
    public FavouriteMovie(int uniqueId, int id, int voteCount, String title, String originalTitle, String overView, String posterPath, String bigPosterPath, String backdropPath, Double voteAverage, String releaseDate) {
        super(uniqueId, id, voteCount, title, originalTitle, overView, posterPath, bigPosterPath, backdropPath, voteAverage, releaseDate);
    }

    @Ignore
    public FavouriteMovie (Movie movie){
        super(movie.getUniqueId(), movie.getId(), movie.getVoteCount(),movie.getTitle(), movie.getOriginalTitle(), movie.getOverView(), movie.getBigPosterPath(), movie.getBigPosterPath(), movie.getBackdropPath(), movie.getVoteAverage(), movie.getReleaseDate());
    }
}
