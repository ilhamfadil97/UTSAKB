package com.example.mysimpleapp.Adapter;


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mysimpleapp.R;


public class musicAdapter extends RecyclerView.Adapter<musicAdapter.ViewHolder> {
    private static final String TAG = "MusicAdapter";

    private String[] musicDataSet,musicDataSet2;
    private int[] musicDataSet3;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewM,textViewM2;
        private final ImageView icon;

        public ViewHolder(View v) {
            super(v);
            // Define click listener for the ViewHolder's View.
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Element " + getPosition() + " clicked.");
                }
            });
            textViewM = (TextView) v.findViewById(R.id.judul_lagu);
            textViewM2 = (TextView) v.findViewById(R.id.deskripsi_lagu);
            icon = (ImageView) v.findViewById(R.id.thumbnail_music);
        }

        public TextView getTextView() {
            return textViewM;
        }
        public TextView getTextView2() {
            return textViewM2;
        }
        public ImageView getImageView() {
            return icon;
        }
    }
    // END_INCLUDE(recyclerViewSampleViewHolder)

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used by RecyclerView.
     */
    public musicAdapter(String[] dataSet, String[] dataSet2, int[] dataSet3) {
        this.musicDataSet = dataSet;
        this.musicDataSet2 = dataSet2;
        this.musicDataSet3 = dataSet3;
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.data_music, viewGroup, false);

        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)

    // BEGIN_INCLUDE(recyclerViewOnBindViewHolder)
    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.getTextView().setText(musicDataSet[position]);
        viewHolder.getTextView2().setText(musicDataSet2[position]);
        viewHolder.getImageView().setImageResource(musicDataSet3[position]);
    }
    // END_INCLUDE(recyclerViewOnBindViewHolder)

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return musicDataSet.length;
    }
}