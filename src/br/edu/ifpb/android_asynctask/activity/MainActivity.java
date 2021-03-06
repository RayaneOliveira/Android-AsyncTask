package br.edu.ifpb.android_asynctask.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.ifpb.android_asynctask.R;
import br.edu.ifpb.android_asynctask.asynctask.LoginAsyncTask;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enviar = (Button)findViewById(R.id.enviarButton);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Android-AsyncTask", "Clique no bot�o de Login");

                EditText nomeEditText = (EditText) findViewById(R.id.nomeEditText);
                String nome = nomeEditText.getText().toString();
                
                EditText senhaEditText = (EditText) findViewById(R.id.senhaEditText);
                String senha = senhaEditText.getText().toString();

                LoginAsyncTask loginAsyncTask = new LoginAsyncTask(v.getContext());
                String[] valores = {nome, senha};

                loginAsyncTask.execute(valores);
            }
        });
    }
}