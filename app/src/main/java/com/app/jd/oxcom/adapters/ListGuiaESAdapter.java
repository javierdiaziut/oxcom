package com.app.jd.oxcom.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.jd.oxcom.R;

import java.util.List;

/**
 * Created by SinAsignarT1 on 05/11/2017.
 */

public class ListGuiaESAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public ListGuiaESAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull String[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.values = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_guia_es, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.textView_guia_es);
        textView.setText(values[position]);

        return rowView;
    }

    @Override
    public int getCount() {
        return values.length;
    }
}
