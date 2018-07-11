package com.github.ybq.android.loading;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.Horizontal;
import com.github.ybq.android.spinkit.style.Wave;

/**
 * Created by ybq.
 */
public class Page2Fragment extends Fragment implements Colors {

  private Wave mWaveDrawable;
  private Circle mCircleDrawable;
  private ChasingDots mChasingDotsDrawable;
  private Horizontal mHorizontal;

  public static Page2Fragment newInstance() {
    return new Page2Fragment();
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_page2, null);
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    //ProgressBar
    ProgressBar progressBar = view.findViewById(R.id.progress);
    DoubleBounce doubleBounce = new DoubleBounce();
    doubleBounce.setBounds(0, 0, 100, 100);
    doubleBounce.setColor(colors[7]);
    progressBar.setIndeterminateDrawable(doubleBounce);

    //Button
    Button button = view.findViewById(R.id.button);
    mWaveDrawable = new Wave();
    mWaveDrawable.setBounds(0, 0, 100, 100);
    //noinspection deprecation
    mWaveDrawable.setColor(getResources().getColor(R.color.colorAccent));
    button.setCompoundDrawables(mWaveDrawable, null, null, null);

    //TextView
    TextView textView = view.findViewById(R.id.text);
    mCircleDrawable = new Circle();
    mCircleDrawable.setBounds(0, 0, 100, 100);
    mCircleDrawable.setColor(Color.WHITE);
    textView.setCompoundDrawables(null, null, mCircleDrawable, null);
    textView.setBackgroundColor(colors[2]);

    //ImageView
    ImageView imageView = view.findViewById(R.id.image);
    mChasingDotsDrawable = new ChasingDots();
    mChasingDotsDrawable.setColor(Color.WHITE);
    imageView.setImageDrawable(mChasingDotsDrawable);
    imageView.setBackgroundColor(colors[0]);

    //ImageView
    FrameLayout layout = view.findViewById(R.id.layout);
    mHorizontal = new Horizontal();
    mHorizontal.setColor(getResources().getColor(R.color.colorAccent));
    layout.setForeground(mHorizontal);
    layout.setBackgroundColor(Color.WHITE);
  }

  @Override
  public void onResume() {
    super.onResume();
    mWaveDrawable.start();
    mCircleDrawable.start();
    mChasingDotsDrawable.start();
    mHorizontal.start();
  }

  @Override
  public void onStop() {
    super.onStop();
    mWaveDrawable.stop();
    mCircleDrawable.stop();
    mChasingDotsDrawable.stop();
    mHorizontal.stop();
  }
}
