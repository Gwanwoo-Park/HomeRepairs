package org.techtown.repairselect01;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class ManualTextActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        // 웹뷰 셋팅
        webView = (WebView) findViewById(R.id.webView);//xml 자바코드 연결
        webView.getSettings().setJavaScriptEnabled(true);//자바스크립트 허용

        Intent intent = getIntent();
        int index = intent.getExtras().getInt("index");
        index++;

        if (index == 1) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText01.html");//웹뷰 실행
        } else if (index == 2) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText02.html");//웹뷰 실행
        } else if (index == 3) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText03.html");//웹뷰 실행
        } else if (index == 4) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText04.html");//웹뷰 실행
        } else if (index == 5) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText05.html");//웹뷰 실행
        } else if (index == 6) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText06.html");//웹뷰 실행
        } else if (index == 7) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText07.html");//웹뷰 실행
        } else if (index == 8) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText08.html");//웹뷰 실행
        } else if (index == 9) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText09.html");//웹뷰 실행
        } else if (index == 10) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText10.html");//웹뷰 실행
        } else if (index == 11) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText11.html");//웹뷰 실행
        } else if (index == 12) {
            webView.loadUrl("http://pgw9470.dothome.co.kr/ManualText/ManualText12.html");//웹뷰 실행
        }

        webView.setWebChromeClient(new WebChromeClient());//웹뷰에 크롬 사용 허용//이 부분이 없으면 크롬에서 alert가 뜨지 않음
        webView.setWebViewClient(new WebViewClientClass());//새창열기 없이 웹뷰 내에서 다시 열기//페이지 이동 원활히 하기위해 사용

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {//뒤로가기 버튼 이벤트
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientClass extends WebViewClient {//페이지 이동

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Log.d("check URL", url);
            view.loadUrl(url);
            return true;
        }
    }
}
