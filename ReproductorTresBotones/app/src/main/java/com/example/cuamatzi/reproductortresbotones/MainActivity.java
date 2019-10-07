package com.example.cuamatzi.reproductortresbotones;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    int pausa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo de  inicio
    public void Play(View view){
        if ( mp == null ) {
            mp = MediaPlayer.create(this, R.raw.musica);
            mp.start();
            Toast.makeText(this, "PLAY", Toast.LENGTH_LONG).show();
        }else{
            mp.seekTo(pausa);
            mp.start();
            Toast.makeText(this, "CONTINUACIÓN", Toast.LENGTH_LONG).show();
        }
    }
    //Metodo de pausa
    public void pause (View view){
        if (mp != null) {
            mp.pause();
            Toast.makeText(this, "PAUSE", Toast.LENGTH_LONG).show();
        }
    }

    //Metodo de detencion

    public void stop (View view){
        mp.stop();
        mp = null;
        Toast.makeText(this,"STOP",Toast.LENGTH_LONG).show();
    }
}
