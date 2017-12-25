package com.example.ashi.cross_code;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by shivam on 25/12/17.
 */

public class Questions extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.questions,null);
        TextView textView = (TextView)view.findViewById(R.id.txtQues);
        TextView textView1 =(TextView)view.findViewById(R.id.txtMsg);
        String question = getArguments().getString("ques");
        textView.setText(question);
        return view;
    }

    public static Questions getInstance(String name)
    {
        Bundle b = new Bundle();
        b.putString("ques",name);
        Questions questions = new Questions();
        questions.setArguments(b);
        return questions;
    }
}
