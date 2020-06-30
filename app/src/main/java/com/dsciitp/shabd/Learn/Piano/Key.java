package com.dsciitp.shabd.Learn.Piano;

import android.graphics.RectF;

class Key {

    int sound;
    RectF rect;
    boolean down;

    Key(RectF rect, int sound) {
        this.sound = sound;
        this.rect = rect;
    }

}
