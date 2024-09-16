package com.example.application2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MusicActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {

    private MediaPlayer player;
    private Button button_start, button_pause, button_stop;
    private TextView textview_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_music);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        player = MediaPlayer.create(MusicActivity.this, R.raw.piano01);
        player.setOnCompletionListener(MusicActivity.this);

        button_start = findViewById(R.id.button_start);
        button_pause = findViewById(R.id.button_pause);
        button_stop = findViewById(R.id.button_stop);
        textview_status = findViewById(R.id.textview_status);

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player != null) {
                    if (player.isPlaying() == false) {
                        player.start();
                        textview_status.setText("播放狀態 :　音樂撥放中．．．");
                    }
                }
            }
        });

        button_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player != null) {
                    if (player.isPlaying() == true) {
                        player.pause();
                        textview_status.setText("播放狀態 :　音樂暫停撥放．．．");
                    }
                }
            }
        });

        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player != null) {
                    player.stop();
                    textview_status.setText("播放狀態 :　音樂停止播放 !!!");
                    try {
                        player.prepareAsync();
                    } catch (IllegalStateException ex) {
                        textview_status.setText(ex.getMessage());
                    }
                }
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (player != null) {
            if (player.isPlaying()) {
                player.stop();
            }

            player.release();
            player = null;
        }
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        textview_status.setText("播放狀態 :　整首音樂撥放完畢。");
        player.seekTo(0);

        try {
            player.prepareAsync();
        } catch (IllegalStateException ex) {
//            textview_status.setText(ex.getMessage());
            ex.printStackTrace();
        }
    }
}