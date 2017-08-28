package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PathMeasure;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {


    Paint paintyellow = new Paint();
    Paint paintpurple = new Paint();
    Paint paintgray = new Paint();
    Paint paintgreen = new Paint();
    Paint paintblue = new Paint();
    Paint paintred = new Paint();

    {
        paintyellow.setColor(Color.parseColor("#fec106"));
        paintpurple.setColor(Color.parseColor("#9c26af"));
        paintgray.setColor(Color.parseColor("#9da09e"));
        paintgreen.setColor(Color.parseColor("#009687"));
        paintblue.setColor(Color.parseColor("#1f96f2"));
        paintred.setColor(Color.parseColor("#ff0000"));
    }
    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        canvas.drawArc(300,300,600,600,-5,-55,true,paintyellow);
        canvas.drawArc(300,300,600,600,0,10,true,paintpurple);
        canvas.drawArc(300,300,600,600,15,10,true,paintgray);
        canvas.drawArc(300,300,600,600,30,60,true,paintgreen);
        canvas.drawArc(300,300,600,600,95,85,true,paintblue);

        canvas.drawArc(290,290,590,590,-60,-120,true,paintred);


    }
}
