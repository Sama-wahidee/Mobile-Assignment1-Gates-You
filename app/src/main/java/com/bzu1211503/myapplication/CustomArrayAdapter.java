package com.bzu1211503.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] options;
    private final int[] icons;

    public CustomArrayAdapter(Context context, String[] options, int[] icons) {
        super(context, R.layout.list, options);
        this.context = context;
        this.options = options;
        this.icons = icons;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("ViewHolder") View rowView = inflater.inflate(R.layout.list, parent, false);

        TextView textView = rowView.findViewById(R.id.textView);
        ImageView imageView = rowView.findViewById(R.id.iconImageView);

        textView.setText(options[position]);
        imageView.setImageResource(icons[position]);

        return rowView;
    }
}
