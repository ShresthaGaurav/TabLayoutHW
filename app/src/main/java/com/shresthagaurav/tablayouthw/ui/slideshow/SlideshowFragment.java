package com.shresthagaurav.tablayouthw.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.shresthagaurav.tablayouthw.R;

public class SlideshowFragment extends Fragment {

    private EditText etFirst,etSecond;
    private Button btnCalculate;
    private TextView txresult;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_slideshow, container, false);
        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnCalculate = view.findViewById(R.id.btnCaluclate);
        txresult=view.findViewById(R.id.resultadd);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int first,second,result;
                first =Integer.parseInt(etFirst.getText().toString());
                second =Integer.parseInt(etSecond.getText().toString());


                result = first + second;
                txresult.setText(String.valueOf(result));

            }
        });
        return view;
    }}