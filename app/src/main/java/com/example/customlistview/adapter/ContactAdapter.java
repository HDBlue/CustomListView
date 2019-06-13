package com.example.customlistview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.customlistview.R;
import com.example.customlistview.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends ArrayAdapter {
    private Context context;
    private int resource;
    private List<Contact> arrContact;

    public ContactAdapter( Context context, int resource, ArrayList<Contact> arrContact) {
        super(context, resource, arrContact);
        this.context = context;
        this.resource = resource;
        this.arrContact = arrContact;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        ViewHoler viewHoler ;
        if (convertView == null){

            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_contact,parent, false);
            viewHoler = new ViewHoler();

            viewHoler.tv_color = convertView.findViewById(R.id.lv_color);
            viewHoler.tv_Name = convertView.findViewById(R.id.lv_name);
            viewHoler.tv_Number = convertView.findViewById(R.id.lv_number);

            convertView.setTag(viewHoler);
        }else {
            viewHoler = (ViewHoler) convertView.getTag();
        }

        Contact contact = arrContact.get(position);
        viewHoler.tv_color.setBackgroundColor(contact.getmColro());
        viewHoler.tv_Name.setText(contact.getmName());
        viewHoler.tv_Number.setText(contact.getmNumber());
        return convertView;
    }

    public class ViewHoler{
        TextView tv_Name, tv_Number,tv_color;

    }
}
