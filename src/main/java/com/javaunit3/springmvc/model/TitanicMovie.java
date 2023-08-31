package com.javaunit3.springmvc.model;

import com.javaunit3.springmvc.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class TitanicMovie implements Movie {
    public String getTitle() {
        return "Titanic";
    }
    public String getMaturityRating() {
        return "PG-13";
    }
    public String getGenre() {
        return "Romance";
    }
}