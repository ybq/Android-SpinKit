package com.github.ybq.android.spinkit.style;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import com.github.ybq.android.spinkit.animation.SpriteAnimatorBuilder;
import com.github.ybq.android.spinkit.sprite.RectSprite;
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.sprite.SpriteContainer;

public class Horizontal extends SpriteContainer {

  @Override public Sprite[] onCreateChild() {
    return new Sprite[] { new Bar(), new Bar(), new Bar() };
  }

  @Override
  public void onChildCreated(Sprite... sprites) {
    super.onChildCreated(sprites);
    sprites[1].setAnimationDelay(600);
    sprites[2].setAnimationDelay(1200);
  }

  @Override public void drawChild(Canvas canvas) {
    int count = canvas.save();
    canvas.clipRect(getDrawBounds());
    super.drawChild(canvas);
    canvas.restoreToCount(count);
  }

  private class Bar extends RectSprite {

    @Override public void onPreStart() {
      setScaleX(0);
    }

    public ValueAnimator onCreateAnimation() {
      float[] fractions = new float[] { 0.0F, 0.25F, 0.5F, 0.75F, 1.0F };
      return new SpriteAnimatorBuilder(this)
          .translateXPercentage(fractions, new Float[] { -1.0F, -0.5F, 0.0F, 0.5F, 1.0F })
          .scaleX(fractions, new Float[] { 0.1F, 0.25F, 0.4F, 0.55F, 0.7F })
          .duration(1800L)
          .build();
    }
  }
}
