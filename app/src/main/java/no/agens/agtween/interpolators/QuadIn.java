package no.agens.agtween.interpolators;

import android.animation.TimeInterpolator;

public class QuadIn
  implements TimeInterpolator
{
  public float getInterpolation(float paramFloat)
  {
    return paramFloat * paramFloat;
  }
}


/* Location:              /home/andrew/works/KotSharedPreferences/a/classes_dex2jar.jar!/no/agens/agtween/interpolators/QuadIn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */