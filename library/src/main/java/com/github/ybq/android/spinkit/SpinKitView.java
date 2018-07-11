package com.github.ybq.android.spinkit;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.github.ybq.android.spinkit.sprite.Sprite;

public class SpinKitView extends ProgressBar {

  private Style mStyle;
  private int mColor;

  public SpinKitView(Context context) {
    this(context, null);
  }

  public SpinKitView(Context context, AttributeSet attrs) {
    this(context, attrs, R.attr.SpinKitViewStyle);
  }

  public SpinKitView(Context context, AttributeSet attrs, int defStyleAttr) {
    this(context, attrs, defStyleAttr, R.style.SpinKitView);
  }

  @TargetApi(Build.VERSION_CODES.LOLLIPOP)
  public SpinKitView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
    TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SpinKitView, defStyleAttr, defStyleRes);
    mStyle = Style.values()[a.getInt(R.styleable.SpinKitView_SpinKit_Style, 0)];
    mColor = a.getColor(R.styleable.SpinKitView_SpinKit_Color, Color.WHITE);
    a.recycle();
    init();
  }

  private void init() {
    Sprite sprite = SpriteFactory.create(mStyle);
    sprite.setColor(mColor);
    setIndeterminateDrawable(sprite);
  }
}
