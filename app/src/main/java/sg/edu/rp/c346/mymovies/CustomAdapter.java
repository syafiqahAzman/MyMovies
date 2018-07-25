package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16046491 on 25/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movie> ratingList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Movie> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        ratingList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);



        ImageView ivRated = rowView.findViewById(R.id.imageView);
        TextView tvTitle = rowView.findViewById(R.id.movieName);
        TextView tvYear = rowView.findViewById(R.id.movieYear);
        TextView tvGenre = rowView.findViewById(R.id.movieType);
        TextView tvWatchedOn = rowView.findViewById(R.id.watchOn);
        TextView tvInTheatre = rowView.findViewById(R.id.inTheatre);
        TextView tvDesc = rowView.findViewById(R.id.desc);


        Movie currentItem = ratingList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvYear.setText(currentItem.getYear());
        tvGenre.setText(currentItem.getGenre());
        tvWatchedOn.setText(currentItem.getWatched_on());
        tvInTheatre.setText(currentItem.getIn_theatre());
        tvDesc.setText(currentItem.getDescription());
        if(currentItem.getRated().equalsIgnoreCase("g")){
            ivRated.setImageResource(R.drawable.rating_g);
        }
        else if(currentItem.getRated().equalsIgnoreCase("pg")){
            ivRated.setImageResource(R.drawable.rating_pg);
        }
        else if(currentItem.getRated().equalsIgnoreCase("pg13")){
            ivRated.setImageResource(R.drawable.rating_pg13);
        }
        else if(currentItem.getRated().equalsIgnoreCase("nc16")){
            ivRated.setImageResource(R.drawable.rating_nc16);
        }
        else if(currentItem.getRated().equalsIgnoreCase("m18")){
            ivRated.setImageResource(R.drawable.rating_m18);
        }else{
            ivRated.setImageResource(R.drawable.rating_r21);
        }
        return rowView;
    }

}

