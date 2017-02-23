package com.example.user.myfirstapp;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 23/2/2560.
 */
   //Activity
public class Myadpter extends BaseAdapter{
    //Explicit
    private Context context;
    private int [] ints;
    private String [] titleStrings,deailStrings;

    public Myadpter (Context context, int[] ints,String[] titleStrings,String[] deailStrings){
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.deailStrings = deailStrings;
    }
    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview,parent,false);
        //Initial View
        ImageView imageView =(ImageView) view.findViewById(R.id.imvlcon);
        TextView titleTextView = (TextView) view.findViewById(R.id.txtTitleLiv);
        TextView detalTextView = (TextView) view.findViewById(R.id.txtDetaiLiv);
        //Show view
        imageView.setImageResource(ints[position]);
        titleTextView.setText(titleStrings[position]);
        detalTextView.setText(deailStrings[position]);


        return view;
    }
} //Main Class
