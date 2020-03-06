package com.example.addcontact;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ContactsFragment extends Fragment {

    private TextView textView5;




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contacts, container,false);

        FloatingActionButton floatingActionButton2 = v.findViewById(R.id.floatingActionButton2);
        floatingActionButton2.setOnClickListener(ourOnClick);


        return v;

    }



    View.OnClickListener ourOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getActivity(), SecondActivity.class);
            startActivity(i);
        }
    };


}
