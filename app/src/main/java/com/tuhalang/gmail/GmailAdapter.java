package com.tuhalang.gmail;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class GmailAdapter extends BaseAdapter {
    List<GmailModel> contacts;

    public GmailAdapter(List<GmailModel> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        final Random random = new Random();

        // get random value for hour
        int hour = random.nextInt(24) + 1;
        int minute = random.nextInt(60) + 1;



        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.textFullname = convertView.findViewById(R.id.text_fullname);
            viewHolder.imageAvatar = convertView.findViewById(R.id.image_avatar);
            viewHolder.textRound = convertView.findViewById(R.id.text_round);
            viewHolder.imageFavorite = convertView.findViewById(R.id.image_favorite);
            viewHolder.hour = convertView.findViewById(R.id.hour);
            viewHolder.description = convertView.findViewById(R.id.description);

            if(minute < 10) {
                viewHolder.hour.setText(hour + ":0" + minute);
            } else {
                viewHolder.hour.setText(hour + ":" + minute);
            }

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final GmailModel contact = contacts.get(position);
        viewHolder.textRound.setText(contact.getFullname().substring(0, 1));
        viewHolder.imageAvatar.setImageResource(contact.getAvatarResource());
        viewHolder.textFullname.setText(contact.getFullname());
        viewHolder.description.setText(contact.getDescription());

        viewHolder.textRound.getBackground().setColorFilter(Color.parseColor("#26A69A"), PorterDuff.Mode.MULTIPLY);

        if(contact.isSelected()) {
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_favorite);
        } else {
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_normal);
        }

        viewHolder.imageFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isSelected = contacts.get(position).isSelected;
                contacts.get(position).setSelected(!isSelected);
                notifyDataSetChanged();
            }
        });

        return convertView;
    }

    class ViewHolder {
        ImageView imageAvatar;
        TextView textRound;
        TextView description;
        TextView textFullname;
        TextView hour;
        ImageView imageFavorite;
    }
}
