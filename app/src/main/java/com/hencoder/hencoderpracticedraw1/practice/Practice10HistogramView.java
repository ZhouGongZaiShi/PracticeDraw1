package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint mPaint = new Paint();
    private Paint mTextPaint = new Paint();

    {
//        mPaint.setColor(Color.YELLOW);
        mTextPaint.setColor(Color.WHITE);
        mTextPaint.setTextSize(20);
    }

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private int srcX = 100;
    private int srcY = 600;
    private int width = 100;
    private int margin = 20;

    private int[] values = {20, 30, 35, 200, 350, 400, 160};
    private String[] texts = {"FroyoFroyoFroyoFroyoFroyo", "GB", "ICS", "JB", "KitKat", "L", "M"};

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.WHITE);
        Path path = new Path();
        path.moveTo(100, 100);
        path.lineTo(srcX, srcY);
        path.lineTo(1200, 600);
        canvas.drawPath(path, mPaint);

        mPaint.setColor(Color.GREEN);
        mPaint.setStyle(Paint.Style.FILL);

        int startX = srcX + margin;
        for (int i = 0; i < values.length; i++) {
            float textSize = mTextPaint.getTextSize();
            String text = texts[i];
            float textWidth = mPaint.measureText(text);
            float textX;
            Log.d("", "onDraw : textWidth " + textWidth);
            if (textWidth > width) {
                textX = 0;
            } else {
                textX = (width -  textWidth) / 2;
            }
            Log.d("", "onDraw : textX " + textX);
            float textStartX = startX + textX;
            Log.d("", "onDraw : textStartX " + textStartX);
            canvas.drawText(text, textStartX, 620, mTextPaint);


            canvas.drawRect(startX, srcY - values[i], startX + width, srcY, mPaint);
            startX += width + margin;
        }


    }

    class Histogram {
        String text;
        String value;

        public Histogram(String text, String value) {
            this.text = text;
            this.value = value;
        }
    }
}
