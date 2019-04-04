package com.example.brom.webviewapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    // Create a private member variable that can hold our WebView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* This code is run when the App is created. Include code that creates your WebView */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // WebView wv = (WebView) findViewById(R.id.my_webview);
        WebView wv = new WebView(this);
        wv.setWebViewClient(new WebViewClient());
        setContentView(wv);

        wv.loadUrl("http://wwwlab.iit.his.se/b18emigu/Mobilapplikationsdesign/Prototyp/index.html");

        // 1. Create a WebView element in the layout file content_main.xml
        // -- Commit and push to your github fork
        // 2. Give the WebView element created in step 1 ID "my_webview"
        // Enter your code that creates your WebView here...
        /*
                <WebView
                android:id="@+id/my_webview"
                android:layout_width="match_parent"
                android:layout_height="match_parent" />
         */
        // -- Commit and push to your github fork
        // 3. Locate the WebView element created in step 1 using the ID created in step 2
        // 4. Create a new WebViewClient to attach to our WebView. This allows us to
        //    browse the web inside our app.
        // -- Commit and push to your github fork
        // 5. Enter the url to load in our WebView
        // -- Commit and push to your github fork
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
