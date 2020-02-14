package com.endre.cinema;

public class MovieDto {

    private String title;
    private Integer ageLimit;

    public MovieDto() {
    }

    public MovieDto(String title, Integer ageLimit) {
        this.title = title;
        this.ageLimit = ageLimit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(Integer ageLimit) {
        this.ageLimit = ageLimit;
    }
}
