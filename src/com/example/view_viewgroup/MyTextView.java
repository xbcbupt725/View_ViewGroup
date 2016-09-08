package com.example.view_viewgroup;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

public class MyTextView extends TextView{

	public MyTextView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		Log.i("xiaoxu", "MyTextView onDraw before");
		super.onDraw(canvas);
		Log.i("xiaoxu", "MyTextView onDraw after");
	}

	@Override
	protected void onLayout(boolean changed, int left, int top, int right,
			int bottom) {
		// TODO Auto-generated method stub
		Log.i("xiaoxu", "MyTextView onLayout before");
		super.onLayout(changed, left, top, right, bottom);
		Log.i("xiaoxu", "MyTextView onLayout after");
		
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		
		Log.i("xiaoxu", "MyTextView onMeasure before");
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		Log.i("xiaoxu", "MyTextView onMeasure after");
		
		
	}

	public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
}
