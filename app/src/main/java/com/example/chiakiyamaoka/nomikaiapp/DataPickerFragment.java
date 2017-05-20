package com.example.chiakiyamaoka.nomikaiapp;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

/**
 * Created by chiakiyamaoka on 2017/05/15.
 */
public class DataPickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    private DialogInterface.OnClickListener mListener;
    public interface OnClickListener{
        public void onOkClicked(Bundle args);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        final Calendar c;
        int year=2017;
        int month;
        int day;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            c = Calendar.getInstance();
            month = c.get(Calendar.MONTH);
            day = c.get(Calendar.DAY_OF_MONTH);
        }else{
            month = 12;
            day = 5;
        }

        return new DatePickerDialog(getActivity(),this,year,month,day);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
    }
}
