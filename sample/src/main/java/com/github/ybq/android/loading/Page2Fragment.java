package com.github.ybq.android.loading;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.Wave;

/**
 * Created by ybq.
 */
public class Page2Fragment extends Fragment implements Colors {


    public static Page2Fragment newInstance() {
        return new Page2Fragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        @SuppressLint("InflateParams")
        View view = inflater.inflate(R.layout.fragment_page2, null);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //ProgressBar
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress);
        DoubleBounce doubleBounce = new DoubleBounce();
        doubleBounce.setBounds(0, 0,
                100,
                100);
        doubleBounce.setColor(colors[7]);
        progressBar.setIndeterminateDrawable(doubleBounce);

        //Button
        Button button = (Button) view.findViewById(R.id.button);
        Wave wave = new Wave();
        wave.setBounds(0, 0,
                100,
                100);
        //noinspection deprecation
        wave.setColor(getResources().getColor(R.color.colorAccent));
        button.setCompoundDrawables(wave, null, null, null);
        wave.start();

        //TextView
        TextView textView = (TextView) view.findViewById(R.id.text);
        Circle circle = new Circle();
        circle.setBounds(0, 0,
                100,
                100);
        circle.setColor(Color.WHITE);
        textView.setCompoundDrawables(null, null, circle, null);
        textView.setBackgroundColor(colors[2]);
        circle.start();

        //ImageView
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        ChasingDots chasingDots = new ChasingDots();
        chasingDots.setColor(Color.WHITE);
        imageView.setImageDrawable(chasingDots);
        imageView.setBackgroundColor(colors[0]);
        chasingDots.start();
    }
}
