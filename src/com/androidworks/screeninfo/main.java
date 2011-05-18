package com.androidworks.screeninfo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class main extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        
        findViewById(R.id.frame).setOnClickListener(new OnClickListener() {
            
            @Override
            public void onClick(View v) {
                View frame = findViewById(R.id.frame);
                int height = frame.getMeasuredHeight();
                int width = frame.getWidth();
                
                TextView twidth = (TextView) findViewById(R.id.width);
                twidth.setText(width+"px");
                
                VerticalLabelView theight = (VerticalLabelView) findViewById(R.id.height);
                theight.setText(height+"px");
                
            }
        });
    }

    @Override
    protected void onResume() {
        super.onPostResume();
        
        View frame = findViewById(R.id.frame);
        int height = frame.getMeasuredHeight();
        int width = frame.getWidth();
        
        TextView twidth = (TextView) findViewById(R.id.width);
        twidth.setText(width+"px");
        
        VerticalLabelView theight = (VerticalLabelView) findViewById(R.id.height);
        theight.setText(height+"px");
        
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        View frame = findViewById(R.id.frame);
        int height = frame.getMeasuredHeight();
        int width = frame.getWidth();
        
        TextView twidth = (TextView) findViewById(R.id.width);
        twidth.setText(width+"px");
        
        VerticalLabelView theight = (VerticalLabelView) findViewById(R.id.height);
        theight.setText(height+"px");
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        View frame = findViewById(R.id.frame);
        int height = frame.getMeasuredHeight();
        int width = frame.getWidth();


        float scale = getResources().getDisplayMetrics().density;

        TextView twidth = (TextView) findViewById(R.id.width);
        twidth.setText(width+"px = " + (int)(width/scale) + "dip");
        
        VerticalLabelView theight = (VerticalLabelView) findViewById(R.id.height);
        theight.setText(height+"px = " + (int)(height/scale) + "dip");
        
    }
    
    
    
    
    
}