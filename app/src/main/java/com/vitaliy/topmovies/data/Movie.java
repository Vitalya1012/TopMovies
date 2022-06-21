package com.vitaliy.topmovies.data;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "movies")
public class Movie {
    @PrimaryKey (autoGenerate = true)
    private int uniqueId;
    private int id;
    private String imdbId;
    private int voteCount;
    private String title;
    private String originalTitle;
    private String overView;
    private String posterPath;
    private String bigPosterPath;
    private String backdropPath;
    private Double voteAverage;
    private String releaseDate;

    public Movie(int uniqueId, int id, String imdbId, int voteCount, String title, String originalTitle, String overView, String posterPath, String bigPosterPath, String backdropPath, Double voteAverage, String releaseDate) {
        this.uniqueId = uniqueId;
        this.id = id;
        this.imdbId = imdbId;
        this.voteCount = voteCount;
        this.title = title;
        this.originalTitle = originalTitle;
        this.overView = overView;
        this.posterPath = posterPath;
        this.bigPosterPath = bigPosterPath;
        this.backdropPath = backdropPath;
        this.voteAverage = voteAverage;
        this.releaseDate = releaseDate;
    }
    @Ignore
    public Movie(int id, String imdbId, int voteCount, String title, String originalTitle, String overView, String posterPath, String bigPosterPath, String backdropPath, Double voteAverage, String releaseDate) {
        this.id = id;
        this.imdbId = imdbId;
        this.voteCount = voteCount;
        this.title = title;
        this.originalTitle = originalTitle;
        this.overView = overView;
        this.posterPath = posterPath;
        this.bigPosterPath = bigPosterPath;
        this.backdropPath = backdropPath;
        this.voteAverage = voteAverage;
        this.releaseDate = releaseDate;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getBigPosterPath() {
        return bigPosterPath;
    }

    public void setBigPosterPath(String bigPosterPath) {
        this.bigPosterPath = bigPosterPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverView() {
        return overView;
    }

    public void setOverView(String overView) {
        this.overView = overView;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
