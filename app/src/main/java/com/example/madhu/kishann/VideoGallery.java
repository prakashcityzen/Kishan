package com.example.madhu.kishann;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class VideoGallery extends AppCompatActivity {

    //RECYCLER VIEW FIELD
    RecyclerView recyclerView;

    //VECTOR FOR VIDEO URLS
    Vector<YoutubeVideo> youtubeVideos = new Vector<YoutubeVideo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager (this));

        //Load video List

        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/LwvXa8hoi0c\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/SEKVumwmizk\" frameborder=\"0\" allowfullscreen></iframe>"));


        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/nt8Wc2AxmlE\"frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Cc7157Vn5hs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8hnuNqfIzXQ\" frameborder=\"0\" allowfullscreen></iframe>"));

        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6zSXWao5mWs\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/B8NrUm8-nPQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/z45s-JwsmCo\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo(" <iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YF4UX7jbEI8\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/EZne9HU_BPs\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);


    }
}
