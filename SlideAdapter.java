package com.example.mysimpleapp;

import android.content.Context;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created on 3/05/2019
 * Nama : Ilham fadil azmi
 * Nim : 10116906
 *Kelas : IF-14K
 *
 */
public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;




    public int[] lst_images = {
            R.drawable.lion,
            R.drawable.wolf,
            R.drawable.bull

    };

    public String[] lst_title = {
            "Bonjour !!",
            "Aplikasi ini berisi tentang Biodata saya",
            "Thank you !!"
    };


    public String[] lst_description = {
            " ",
            " ",
            " "


    };





    public int[] lst_backgroundcolor = {
            Color.rgb(0, 133, 119),
            Color.rgb(0,133,119),
            Color.rgb(0,133,119)
    };


    public SlideAdapter(Context context){
        this.context = context;



    }



    @Override
    public int getCount() {
        return lst_title.length;

    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==(LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
       View view = inflater.inflate(R.layout.slide,container,false);
       LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
       ImageView imgslide = (ImageView) view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((LinearLayout)object);
    }

}
