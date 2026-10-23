package com.vinicius.gamebacklog;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String platform;
    private String status;
    private Integer rating;
    private String review;
    private Integer playtime;

    public Game() {}

    public Game(String title, String platform, String status, Integer rating, String review, Integer playtime) {
        this.title = title;
        this.platform = platform;
        this.status = status;
        this.rating = rating;
        this.review = review;
        this.playtime = playtime;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Integer getRating() { return rating; }
    public void setRating(Integer rating) { this.rating = rating; }

    public String getReview() { return review; }
    public void setReview(String review) { this.review = review; }

    public Integer getPlaytime() { return playtime; }
    public void setPlaytime(Integer playtime) { this.playtime = playtime; }
}