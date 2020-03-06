package com.example.addcontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;



public class SecondActivity extends MainActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText phone;
    private RadioButton leadButton;
    private RadioButton custButton;
    private RadioButton suppButton;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        leadButton = findViewById(R.id.leadButton);
        custButton = findViewById(R.id.custButton);
        suppButton = findViewById(R.id.suppButton);



        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, ContactsFragment.class);
                i.putExtra("firstname", firstName.getText().toString() );
                i.putExtra("lastname", lastName.getText().toString() );
                i.putExtra("email", email.getText().toString() );
                i.putExtra("phone", phone.getText().toString() );

                startActivity(i);






//                String result1 = firstName.getText().toString();
//                String result2 = lastName.getText().toString();
//                String result3 = email.getText().toString();
//                String result4 = phone.getText().toString();


                String result5 = ("");

//                Radio button code
                if (custButton.isChecked()) {
                    result5 = "Customer";
                } else if (suppButton.isChecked()) {
                    result5 = "Supplier";
                } else if (leadButton.isChecked()) {
                    result5 = "Lead";
                }

////                Operation for displayContact Textview
//                displayContact.append(result1 + " ");
//                displayContact.append(result2 + "\n");
//                displayContact.append(result4 + "\n");
//                displayContact.append(result3 + "\n");
//                displayContact.append("------------------------------------------------------" + "\n");

//


                firstName.setText(null);
                lastName.setText(null);
                email.setText(null);
                phone.setText(null);
                leadButton.setChecked(false);
                custButton.setChecked(false);
                suppButton.setChecked(false);


            }


        };
        floatingActionButton.setOnClickListener(myOnClickListener);

    }

}



