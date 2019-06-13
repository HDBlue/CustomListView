package com.example.customlistview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.customlistview.adapter.ContactAdapter;
import com.example.customlistview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lv_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_contact = findViewById(R.id.lv_contact);
        ArrayList<Contact> arrContact = new ArrayList<>();

        Contact contact1 = new Contact(Color.blue(1),"Hoang DUong", "12345654321" );
        Contact contact2 = new Contact(Color.green(1),"B", "12345654321" );
        Contact contact3 = new Contact(Color.red(1),"C", "12345654321" );
        Contact contact4 = new Contact(Color.red(2),"D D", "12345654321" );
        Contact contact5 = new Contact(Color.blue(4),"E E", "12345654321" );
        Contact contact6 = new Contact(Color.blue(6),"F F", "12345654321" );
        Contact contact7 = new Contact(Color.blue(8),"G G", "12345654321" );

        arrContact.add(contact1);
        arrContact.add(contact2);
        arrContact.add(contact3);
        arrContact.add(contact4);
        arrContact.add(contact5);
        arrContact.add(contact6);
        arrContact.add(contact7);

        ContactAdapter contactAdapter = new ContactAdapter(this, R.layout.row_item_contact,arrContact);
        lv_contact.setAdapter(contactAdapter);

    }
}
