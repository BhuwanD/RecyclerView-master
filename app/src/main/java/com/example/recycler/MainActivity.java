package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);

                List<Contacts> contactslist = new ArrayList<>();
        contactslist.add(new Contacts("Saugat Malla","908011122",R.drawable.saugat, "saugat@gmail.com", "Balaju"));
        contactslist.add(new Contacts("Rajesh Hamal","908-92212",R.drawable.rajesh, "rajesh@gmail.com", "Banasthali"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang , "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Dahayang Rai","908092110",R.drawable.dahayang, "daya@gmail.com", "Baneshwor"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));
        contactslist.add(new Contacts("Bhuwan KC","908092211",R.drawable.bhuwan, "bhuwan@gmail.com", "Boudha"));


        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactslist);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
