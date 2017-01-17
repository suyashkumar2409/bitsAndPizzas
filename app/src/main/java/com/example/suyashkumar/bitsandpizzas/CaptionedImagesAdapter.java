package com.example.suyashkumar.bitsandpizzas;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SUYASH KUMAR on 1/17/2017.
 */

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

    private String[] captions;
    private int[] imageIds;

    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv = (CardView)LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cv = holder.cardView;
        ImageView info_img = (ImageView)cv.findViewById(R.id.info_img);
        TextView info_txt = (TextView)cv.findViewById(R.id.info_text);

        Drawable corr_img = cv.getResources().getDrawable(imageIds[position]);

        info_img.setImageDrawable(corr_img);
        info_img.setContentDescription(captions[position]);

        info_txt.setText(captions[position]);
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public CaptionedImagesAdapter(String[] captions, int[] imageIds)
    {
        this.captions = captions;
        this.imageIds = imageIds;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;

        public ViewHolder(CardView cardView)
        {
            super(cardView);
            this.cardView = cardView;
        }
    }

}
