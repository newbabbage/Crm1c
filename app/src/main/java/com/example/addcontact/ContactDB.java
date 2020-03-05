package com.example.addcontact;

import android.os.Bundle;
import android.widget.TextView;

public class ContactDB extends MainActivity {

    public TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_db);


        textView4 = findViewById(R.id.textView4);

        String firstname = super.getIntent().getExtras().getString("firstname");
        String lastname = super.getIntent().getExtras().getString("lastname");
        String email = super.getIntent().getExtras().getString("email");
        String phone = super.getIntent().getExtras().getString("phone");

        textView4.setText(firstname + "\n" + lastname + "\n" + email + "\n" + phone);

    }


}
