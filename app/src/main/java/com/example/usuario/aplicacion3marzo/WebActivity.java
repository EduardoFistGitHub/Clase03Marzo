package com.example.usuario.aplicacion3marzo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import java.net.URL;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);////que vista le estamos asignando a un elemento grafico.

        Intent i = getIntent();/////que reciba el intent que lo mando a llamar.
        Uri uri = i.getData();
        URL url = null;
        try{
            url = new URL(uri.getScheme(),////valida que sea htpp
                    uri.getHost(),
                    uri.getPath());

            /////Esto carga el URL en el webview que creamos.////////////

            WebView wb = (WebView) findViewById(R.id.webview);///////Casteo de WebView_TEnemos el objeto.
            wb.loadUrl(url.toString());

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
