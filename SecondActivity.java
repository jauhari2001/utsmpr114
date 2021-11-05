package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SecondActivity extends AppCompatActivity {

    EditText inputTinggi,inputAlas;
    Button hitungLuas;
    TextView tampilHasil;//tombolDialog

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        tombolDialog=(TextView)findViewById(R.id.tombolDialog);
//
//        tombolDialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openDialog();
//            }
//        });



        inputTinggi=(EditText) findViewById(R.id.inputTinggi);
        inputAlas=(EditText) findViewById(R.id.inputAlas);
        hitungLuas=(Button) findViewById(R.id.tombolhitung);
        tampilHasil=(TextView) findViewById(R.id.tampilhasil);

        hitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungLuasSegitiga();
                snackbarTest();
            }
        });

    }

    private void snackbarTest() {
        Snackbar snackbar = Snackbar.make(
                findViewById(R.id.tombolhitung),
                "Luas Segitiga t'lah Tampil",
                Snackbar.LENGTH_SHORT
        );
        snackbar.show();
    }

//    public void openDialog(){
//        val snacbar = Snackbar.make(findViewById(R.id.tombolhitung),
//                "Hasil t'lah ditampilkan", Snackbar.LENGTH_SHORT)
//        snacbar.setAction("Oke",View.OnClickListener{
//            Toast.makeText(this@SecondActivity,"Ini adalah toas dari snackbar", Toast.LENGTH_SHORT)
//        })
//        snacbar.show();
//    }

    public void hitungLuasSegitiga(){
        try{
            Double alas=Double.parseDouble(inputAlas.getText().toString());
            Double tinggi=Double.parseDouble(inputTinggi.getText().toString());
            Double luas=0.5*alas*tinggi;
            tampilHasil.setText(luas.toString());
        }
        catch(NumberFormatException e){
            tampilHasil.setText("Masukkan angka");
        }
    }

    public void Pindahs(View view) {
        Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
        startActivity(intent);
    }
}