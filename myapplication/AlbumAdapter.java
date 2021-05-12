package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AlbumAdapter  extends ArrayAdapter<Album> {
    private Context context;
    private ArrayList<Album> albums;

    AlbumAdapter(Context context, ArrayList<Album> albums){
        super(context, R.layout.item_layout, albums);
        this.context = context;
        this.albums = albums;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listItem = layoutInflater.inflate(R.layout.item_layout, parent, false);

        TextView artist = listItem.findViewById(R.id.artist);
        TextView title = listItem.findViewById(R.id.title);
        ImageView imageView = listItem.findViewById(R.id.cover);
        Button button = listItem.findViewById(R.id.button);

        artist.setText(albums.get(position).getName());
        title.setText(albums.get(position).getTitle());
        imageView.setImageResource(albums.get(position).getPicture());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button.getText().equals("Graj")){
                    albums.get(position).start();
                    button.setText("Stop");
                } else {
                    albums.get(position).pause();
                    button.setText("Stop");
                }
            }
        });
        return  listItem;
    }
}
