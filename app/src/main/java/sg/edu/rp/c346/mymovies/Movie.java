package sg.edu.rp.c346.mymovies;

/**
 * Created by 16046491 on 25/7/2018.
 */

public class Movie {

    private String title;
    private String Year;
    private String rated;
    private String genre;
    private String watched_on;
    private String in_theatre;
    private String description;

    public Movie(String title, String year, String rated, String genre, String watched_on, String in_theatre, String description) {
        this.title = title;
        Year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(String watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", Year='" + Year + '\'' +
                ", rated='" + rated + '\'' +
                ", genre='" + genre + '\'' +
                ", watched_on='" + watched_on + '\'' +
                ", in_theatre='" + in_theatre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
