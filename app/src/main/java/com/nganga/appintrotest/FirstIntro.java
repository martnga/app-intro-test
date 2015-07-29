package com.nganga.appintrotest;

import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by nganga on 7/29/15.
 */
public class FirstIntro extends AppIntro {
    @Override
    public void init(Bundle savedInstanceState) {

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest
        addSlide(AppIntroFragment.newInstance("Hello", "Welcome To A New World", R.drawable.hello, R.color.material_deep_teal_500));
        addSlide(AppIntroFragment.newInstance("Greetings", "A Reason To Be Happy", R.drawable.one, R.color.material_deep_teal_500));
        addSlide(AppIntroFragment.newInstance("Finally", "Now You Are Set To A New World Of Happiness", R.drawable.two, R.color.material_deep_teal_500));

        // OPTIONAL METHODS
        // Override bar/separator color
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button
        showSkipButton(false);
        showDoneButton(false);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
        setVibrate(true);
        setVibrateIntensity(30);

    }

    @Override
    public void onSkipPressed() {

    }

    @Override
    public void onDonePressed() {

    }
}
