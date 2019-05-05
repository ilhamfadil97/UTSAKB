package com.example.mysimpleapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.mysimpleapp.R;

import java.util.ArrayList;
import java.util.List;



public class Gallery_GridAdapter extends RecyclerView.Adapter<Gallery_GridAdapter.ViewHolder> {

    List<EndangeredItem> mItems;

    public Gallery_GridAdapter() {
        super();
        mItems = new ArrayList<EndangeredItem>();
        EndangeredItem nama = new EndangeredItem();
        nama.setName("Ant-man");
        nama.setThumbnail(R.drawable.antman);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Iron-man");
        nama.setThumbnail(R.drawable.ironman);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Thor");
        nama.setThumbnail(R.drawable.thor);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("Captain America");
        nama.setThumbnail(R.drawable.capt);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("The Black Widow");
        nama.setThumbnail(R.drawable.blackwidow);
        mItems.add(nama);

        nama = new EndangeredItem();
        nama.setName("The Hulk");
        nama.setThumbnail(R.drawable.hulk);
        mItems.add(nama);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.data_gallery, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        EndangeredItem nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);

        }
    }
}
