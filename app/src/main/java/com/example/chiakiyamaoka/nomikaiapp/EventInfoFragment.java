package com.example.chiakiyamaoka.nomikaiapp;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class EventInfoFragment extends Fragment {

    EditText mDateForm;

    public EventInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event_info, container, false);

        mDateForm = (EditText) view.findViewById(R.id.date_form);
        mDateForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dateFragment = new DataPickerFragment();
                dateFragment.show(getFragmentManager(), "日付の入力");
            }
        });

        return view;
    }





}
