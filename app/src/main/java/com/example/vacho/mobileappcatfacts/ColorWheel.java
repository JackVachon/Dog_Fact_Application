package com.example.vacho.mobileappcatfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {

    private String[] colors = {
            "#397367",
            "#5DA399",
            "#63CCCA",
            "#C4AF9A",
            "#CB04A5",
            "#E0CA3C",
            "#005e06",
            "#ffab4c",
            "#bae1ff",
            "#8470ff",
            "#98fb98",
            "#5f9ea0"
    };

    int getColor() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        return Color.parseColor(colors[randomNumber]);
    }
}