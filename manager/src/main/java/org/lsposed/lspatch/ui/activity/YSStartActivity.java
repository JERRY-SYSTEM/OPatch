package org.lsposed.lspatch.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;

import org.lsposed.lspatch.R;

public class YSStartActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.ys_start_container);

        View ysStartView = findViewById(R.id.ys_start_container_view);
        ysStartView.getBackground().setAlpha(0);
        new Handler(Looper.getMainLooper()).postDelayed(()-> setAlpha(ysStartView),500);


    }
    public void setAlpha(View ysStartView){
        runOnUiThread(()->{
            if (ysStartView.getBackground().getAlpha() < 252){
                ysStartView.getBackground().setAlpha(ysStartView.getBackground().getAlpha() + 3);
                new Handler(Looper.getMainLooper()).postDelayed(()->setAlpha(ysStartView), 10);
            }else {
                new Handler(Looper.getMainLooper()).postDelayed(()-> setAlpha2(ysStartView),1500);
            }
        });
    }
    public void setAlpha2(View ysStartView){
        runOnUiThread(()->{
            if (ysStartView.getBackground().getAlpha() > 3){
                ysStartView.getBackground().setAlpha(ysStartView.getBackground().getAlpha() - 3);
                new Handler(Looper.getMainLooper()).postDelayed(()->setAlpha2(ysStartView), 10);
            }else {
                Intent intent = new Intent(YSStartActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
