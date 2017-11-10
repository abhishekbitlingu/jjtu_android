package com.example.neeladri.jjtu.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.neeladri.jjtu.R;

import java.util.ArrayList;

public class ImagePagerAdapter extends PagerAdapter {
    Context mContext;
    LayoutInflater mLayoutInflater;
    ArrayList mResources;

    public ImagePagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mResources.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (LinearLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       /* View itemView = mLayoutInflater.inflate(R.layout.image_pager_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.about_us_imageView);
        // Todo : Set the image to the view.
        TextView titleText = itemView.findViewById(R.id.about_us_image_title);
        // Todo : Set the Image Title.
        container.addView(itemView);

        return itemView;
*/
        return null;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}