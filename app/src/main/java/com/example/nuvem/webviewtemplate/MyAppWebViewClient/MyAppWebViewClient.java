package com.example.nuvem.webviewtemplate.MyAppWebViewClient;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by nuvem on 12/12/2016.
 */
public class MyAppWebViewClient extends WebViewClient{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url.contains("http://demo.syscap.in/app/")) {
            view.loadUrl(url);
            return false;
        } else {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            view.getContext().startActivity(intent);
            return true;
        }
    }

}

