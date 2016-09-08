package com.example.view_viewgroup;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

public class MyLinearLayout extends LinearLayout {

	public MyLinearLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public MyLinearLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Log.i("xiaoxu", "MyLinearLayout onDraw before");
		
		super.onDraw(canvas);
		
		Log.i("xiaoxu", "MyLinearLayout onDraw after");
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		// TODO Auto-generated method stub
		Log.i("xiaoxu", "MyLinearLayout onLayout before");
		super.onLayout(changed, l, t, r, b);
		Log.i("xiaoxu", "MyLinearLayout onLayout after");
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		
		Log.i("xiaoxu", "MyLinearLayout onMeasure before");
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		Log.i("xiaoxu", "MyLinearLayout onMeasure after");
		
	}
	
	
}
