package edu.whitworth.hw8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by tbradford16 on 4/12/14.
 */
public class ImageAdapter extends BaseAdapter {

    private Integer[] mThumbIds = {
            R.drawable.one, R.drawable.four,
            R.drawable.two, R.drawable.five,
            R.drawable.three, R.drawable.six,
            R.drawable.four, R.drawable.seven,
            R.drawable.five, R.drawable.eight,
            R.drawable.six, R.drawable.one,
            R.drawable.seven, R.drawable.two,
            R.drawable.eight, R.drawable.three,
            R.drawable.one, R.drawable.four,
            R.drawable.two, R.drawable.five,
            R.drawable.three, R.drawable.six
    };

    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

   //     LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
   //     LinearLayout rootView = (LinearLayout) inflater.inflate(R.layout.fragment_main, parent, false);

        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }



}
