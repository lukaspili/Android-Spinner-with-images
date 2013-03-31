package com.siu.android.spinnerimages;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * @author Lukasz Piliszczuk <lukasz.pili AT gmail.com>
 */
public class SpinnerAdapter extends ArrayAdapter<String> {

    private List<String> images;

    public SpinnerAdapter(Context context, List<String> images) {
        super(context, android.R.id.text1, images);
        this.images = images;
    }

    @Override
    public String getItem(int position) {
        return images.get(position);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        ImageView view = (ImageView) convertView;

        if (view == null) {
            view = new ImageView(getContext());
        }

        String image = getItem(position);

        if (image.equals("image1")) {
            view.setImageResource(R.drawable.android_img1);
        } else {
            view.setImageResource(R.drawable.android_img2);
        }

        return view;
    }
}
