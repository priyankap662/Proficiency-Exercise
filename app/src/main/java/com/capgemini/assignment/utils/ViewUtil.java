package com.capgemini.assignment.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.capgemini.assignment.common.Common;

public class ViewUtil {

    public static void enqueueSetImageBitmap(ImageView imageView, Bitmap image) {
        if (imageView.isAttachedToWindow()) {
            imageView.post(() -> imageView.setImageBitmap(image));

        } else {
            Common.getUIHandler().post(() -> imageView.setImageBitmap(image));
        }
    }
}
