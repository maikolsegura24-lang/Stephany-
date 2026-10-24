
package com.stephany.aventura;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView juego = new WebView(this);
        WebSettings ajustes = juego.getSettings();
        ajustes.setJavaScriptEnabled(true);
        ajustes.setDomStorageEnabled(true);

        juego.setWebViewClient(new android.webkit.WebViewClient());
        juego.loadUrl("file:///android_asset/index.html");

        setContentView(juego);
    }
}
