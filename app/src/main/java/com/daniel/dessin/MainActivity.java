package com.daniel.dessin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principale);
        this.emmetteur_event();
    }
    private void  emmetteur_event(){
        Button start = (Button)findViewById(R.id.button);
        TextView warning = (TextView)findViewById(R.id.warning);
        TextView affichage = (TextView)findViewById(R.id.affichage);
        EditText input = (EditText)findViewById(R.id.input);
        Button change = (Button)findViewById(R.id.dessin);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String texte = input.getText().toString();
               if(texte.length()==0){
                   warning.setText("veuillez taper quelque choses");

               }else{
                   affichage.setText(texte);
               }
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent action1 = new Intent(MainActivity.this, evenements.class);
                startActivity(action1);
            }
        });
    }
}