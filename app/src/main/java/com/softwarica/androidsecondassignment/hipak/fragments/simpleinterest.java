package com.softwarica.androidsecondassignment.hipak.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.softwarica.androidsecondassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class simpleinterest extends Fragment implements View.OnClickListener{

    private Button btnSI;
    private EditText etPrincipal, etTime,etRate;
    private TextView tvSI;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_simpleinterest,container,false);
        etPrincipal=view.findViewById(R.id.etPrincipal);
        etRate=view.findViewById(R.id.etRate);
        etTime=view.findViewById(R.id.etTime);
        btnSI=view.findViewById(R.id.btnSI);
        tvSI=view.findViewById(R.id.tvSI);

        btnSI.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float p,t,r, si;
        p=Float.parseFloat(etPrincipal.getText().toString());
        t=Float.parseFloat(etTime.getText().toString());
        r=Float.parseFloat(etRate.getText().toString());

        si=(p*t*r)/100;

        tvSI.setText("The Simple Interest with Principal of Rs " + p + " Rate :" + r + "%" + "and Time : " + t +" years " + " is  : " + si +".");
    }
}
