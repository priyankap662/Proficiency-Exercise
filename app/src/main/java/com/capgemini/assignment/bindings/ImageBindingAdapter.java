package com.capgemini.assignment.bindings;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;

import com.capgemini.assignment.common.Common;
import com.capgemini.assignment.utils.ImageUtils;
import com.capgemini.assignment.utils.ViewUtil;


/**
 * Contains {@link BindingAdapter}s for Images.
 */
public class ImageBindingAdapter {

    @BindingAdapter("url")
    public static void setUrl(ImageView imageView, String url) {
        if (!TextUtils.isEmpty(url)) {
            Common.getCachedThreadPool().execute(() -> {
                Bitmap image = ImageUtils.get(url);

                if (image != null) {
                    ViewUtil.enqueueSetImageBitmap(imageView, image);
                }
            });
        }
    }
}
