package br.com.etecia.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  btnLogar = findViewById(R.id.btnLogar);
        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView edtLogin = findViewById(R.id.edtLogin);
                TextView edtSenha = findViewById(R.id.edtSenha);
                String username = edtLogin.getText().toString();
                String password = edtSenha.getText().toString();

                if(username.equals("etecia") && password.equals("etecia")){
                    Intent intentHome = new Intent(MainActivity.this, Home.class);
                    startActivity(intentHome);

                }else{
                    alert("Usuario ou Senha Invalidos");


                }

            }
        });



    }
    private void alert(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();

    }

}
