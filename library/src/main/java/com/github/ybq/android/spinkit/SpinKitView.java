package com.github.ybq.android.spinkit;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

import com.github.ybq.android.library.R;
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.FadingCircle;
import com.github.ybq.android.spinkit.style.FoldingCube;
import com.github.ybq.android.spinkit.style.Pulse;
import com.github.ybq.android.spinkit.style.RotatingPlane;
import com.github.ybq.android.spinkit.style.ThreeBounce;
import com.github.ybq.android.spinkit.style.WanderingCubes;

/**
 * Created by ybq.
 */
public class SpinKitView extends ProgressBar {

    private Style mStyle;
    private int mColor;
    private Sprite mSprite;

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
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.SpinKitView, defStyleAttr,
                defStyleRes);
        mStyle =
                Style.values()[a.getInt(R.styleable.SpinKitView_SpinKit_Style, 0)];
        mColor = a.getColor(R.styleable.SpinKitView_SpinKit_Color, Color.WHITE);
        a.recycle();
        init();
        setIndeterminate(true);
    }

    private void init() {
        switch (mStyle) {
            case ROTATING_PLANE:
                setIndeterminateDrawable(new RotatingPlane());
                break;
            case DOUBLE_BOUNCE:
                setIndeterminateDrawable(new DoubleBounce());
                break;
            case WAVE:
                setIndeterminateDrawable(new RotatingPlane());
                break;
            case WANDERING_CUBES:
                setIndeterminateDrawable(new WanderingCubes());
                break;
            case PULSE:
                setIndeterminateDrawable(new Pulse());
                break;
            case CHASING_DOTS:
                setIndeterminateDrawable(new ChasingDots());
                break;
            case THREE_BOUNCE:
                setIndeterminateDrawable(new ThreeBounce());
                break;
            case CIRCLE:
                setIndeterminateDrawable(new Circle());
                break;
            case CUBE_GRID:
                setIndeterminateDrawable(new CubeGrid());
                break;
            case FADING_CIRCLE:
                setIndeterminateDrawable(new FadingCircle());
                break;
            case FOLDING_CUBE:
                setIndeterminateDrawable(new FoldingCube());
                break;
            default:
                break;
        }
    }

    @Override
    public void setIndeterminateDrawable(Drawable d) {
        super.setIndeterminateDrawable(d);
        if (!(d instanceof Sprite)) {
            throw new IllegalArgumentException();
        }
        setIndeterminateDrawable((Sprite) d);
    }

    public void setIndeterminateDrawable(Sprite d) {
        super.setIndeterminateDrawable(d);
        mSprite = d;
        mSprite.setColor(mColor);
    }

    @Override
    public Sprite getIndeterminateDrawable() {
        return mSprite;
    }

    @Override
    public void setIndeterminateDrawableTiled(Drawable d) {
        super.setIndeterminateDrawableTiled(d);
    }
}
