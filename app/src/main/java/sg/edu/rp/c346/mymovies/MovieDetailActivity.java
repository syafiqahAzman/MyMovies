package sg.edu.rp.c346.mymovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MovieDetailActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie>alMovie;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        lvMovie = findViewById(R.id.listView);
         alMovie = new ArrayList<>();

         Movie item1 = new Movie("The Avengers", "2012", "pg13", "Action | Sci-Fi", "15/11/2014", "Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
         alMovie.add(item1);

    }
}
