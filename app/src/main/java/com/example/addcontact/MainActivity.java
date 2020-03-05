package com.example.addcontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
//
//
//    public TextView displayContact;
//    public TextView displayType;
//    public EditText email;
//    public EditText phone;
//    public EditText firstName;
//    public EditText lastName;
//    public RadioButton leadButton;
//    public RadioButton custButton;
//    public RadioButton suppButton;
//    public FloatingActionButton floatingActionButton;
      private FloatingActionButton floatingActionButton3;

    //
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.floatingActionButton3);


        View.OnClickListener ourOnCLickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }


        };

        floatingActionButton3.setOnClickListener(ourOnCLickListener);
    }
}



//
//
//        firstName = (EditText) findViewById(R.id.firstName);
//        lastName = (EditText) findViewById(R.id.lastName);
//        email = (EditText) findViewById(R.id.email);
//        phone = (EditText) findViewById(R.id.phone);
//        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
//        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
//        leadButton = (RadioButton) findViewById(R.id.leadButton);
//        custButton = (RadioButton) findViewById(R.id.custButton);
//        suppButton = (RadioButton) findViewById(R.id.suppButton);
//        displayContact = (TextView) findViewById(R.id.displayContact);
//        displayType = (TextView) findViewById(R.id.displayType);
//        displayContact.setText("");
//        displayType.setText("");
////
//
//
//
//
//
//
//
//
//    View.OnClickListener ourOnClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
//                String result1 = firstName.getText().toString();
//                String result2 = lastName.getText().toString();
//                String result3 = email.getText().toString();
//                String result4 = phone.getText().toString();
//
//
//
//
//
//                String result5 = ("");
//
////                Radio button code
//                if(custButton.isChecked()) {
//                    result5 = "Customer";
//                }
//
//                else if (suppButton.isChecked()) {
//                    result5 = "Supplier";
//                }
//
//                else if (leadButton.isChecked()) {
//                    result5 = "Lead";
//                }
//
////                Operation for displayContact Textview
//                displayContact.append(result1 + " " );
//                displayContact.append(result2 + "\n");
//                displayContact.append(result4 + "\n");
//                displayContact.append(result3 + "\n");
//                displayContact.append("------------------------------------------------------" + "\n");
//
////              Operation for displayType Textview
//                displayType.append(result5 + "\n" + "\n" + "\n" + "\n");
//
//
//
//                firstName.setText(null);
//                lastName.setText(null);
//                email.setText(null);
//                phone.setText(null);
//                leadButton.setChecked(false);
//                custButton.setChecked(false);
//                suppButton.setChecked(false);
//
//            }
//
//
//
//
//
//    };
//        floatingActionButton.setOnClickListener(ourOnClickListener);
//        floatingActionButton2.setOnClickListener(ourOnClickListener);
//    }
//
//
//
//
//}

