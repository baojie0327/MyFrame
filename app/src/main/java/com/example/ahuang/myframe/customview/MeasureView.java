package com.example.ahuang.myframe.customview; /**
 * MeasureView  2017-09-20
 * Copyright (c) 2017 KL Co.Ltd. All right reserved.
 */

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * View的测量
 *
 * @author Jackson
 * @version 1.0.0
 *          since 2017 09 20
 */
public class MeasureView extends View {

    public MeasureView(Context context) {
        super(context);
    }

    public MeasureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MeasureView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //  super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(measureWidth(widthMeasureSpec),measureHeight(heightMeasureSpec));
    }

    /**
     * 获取宽度的测量
     *
     * @param measureSpec
     * @return
     */
    private int measureWidth(int measureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(measureSpec); //测量模式
        int specSize = MeasureSpec.getSize(measureSpec); //测量值

        if (specMode == MeasureSpec.EXACTLY) {  // 具体数值 或者 match_parent
            result = specSize;
        } else {                          //wrap_content
            result = 400;
            if (specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }
        return result;

    }


    /**
     * 获取高度的测量
     *
     * @param measureSpec
     * @return
     */
    private int measureHeight(int measureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(measureSpec); //测量模式
        int specSize = MeasureSpec.getSize(measureSpec); //测量值

        if (specMode == MeasureSpec.EXACTLY) {  // 具体数值 或者 match_parent
            result = specSize;
        } else {                          //wrap_content
            result = 500;
            if (specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }
        return result;

    }


}

