package com.example.alunos.combancodedados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     DataBaseHelper myDb;
     EditText text_nome, text_sobrenome, text_profissao;
     Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DataBaseHelper(this);
        text_nome = (EditText) findViewById(R.id.editText);
        text_sobrenome = (EditText) findViewById(R.id.editText2);
        text_profissao = (EditText) findViewById(R.id.editText3);

        btnEnviar = (Button) findViewById(R.id.button);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ClickMe();
            }
        });
    }
    public void ClickMe(){
        String nome = text_nome.getText().toString();
        String sobrenome = text_sobrenome.getText().toString();
        String profissao = text_profissao.getText().toString();

        Boolean result = myDb.insertData(nome, sobrenome, profissao);

        if(result == true){
            Toast.makeText(this, "Dados inseridos com sucesso.", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Erro ao inserir dados.", Toast.LENGTH_SHORT).show();
        }
    }
}
