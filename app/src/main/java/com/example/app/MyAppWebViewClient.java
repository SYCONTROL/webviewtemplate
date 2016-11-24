package com.example.app;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyAppWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(url.contains("consultarBilhete") || url.contains("imprimirep://locaolhost/imprimir?idbilhete")){
            return super.shouldOverrideUrlLoading(view, url); // Leave webview and use browser
        } else {
            view.loadUrl(url); // Stay within this webview and load url
            return true;
        }
    }
}