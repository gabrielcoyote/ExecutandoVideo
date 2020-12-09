package com.example.executandovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //Esconde ActionBar
      // getSupportActionBar().hide();

        //Esconde statusBar e barra de navegação

        View decorView = getWindow().getDecorView();
        int uiopçoes = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiopçoes);

        //Executar o video
        videoView.setMediaController(new MediaController(this));

        // faz a busca do video "android.resource://" e um endereço de recurso padrao
        // getPackageName() recupera o nome do pacote onde esta o video

        videoView.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.video);
        videoView.start();
    }
}