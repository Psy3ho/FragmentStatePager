package com.example.fragmentstatepager.ui.main;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.util.Function;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.fragmentstatepager.R;

public class ObjFragment extends Fragment {

    private String status;
    static final String ARG_OBJECT = "object";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_obj, container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();

        //set text on fragment
        View textView = view.findViewById(R.id.editText2);
        ((TextView)textView).setText(Integer.toString(args.getInt(ARG_OBJECT)));
    }


    /*
    * show status
    * */

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        status = " - onCreate";
        Bundle args = getArguments();
        Log.i("Fragment", (args.getInt(ARG_OBJECT)) + status);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        status =  " - OnAttach";
        Bundle args = getArguments();
        Log.i("Fragment", (args.getInt(ARG_OBJECT)) + status);
    }

    @Override
    public void onStart() {
        super.onStart();
        status = " - OnStart";
        Bundle args = getArguments();
        Log.i("Fragment", (args.getInt(ARG_OBJECT)) + status);
    }

    @Override
    public void onResume() {
        super.onResume();
        status = " - onResume";
        Bundle args = getArguments();
        Log.i("Fragment", (args.getInt(ARG_OBJECT)) + status);
    }

    @Override
    public void onPause() {
        super.onPause();
        status = " - onPause";
        Bundle args = getArguments();
        Log.i("Fragment", (args.getInt(ARG_OBJECT)) + status);
    }

    @Override
    public void onStop() {
        super.onStop();
        status = " - onStop";
        Bundle args = getArguments();
        Log.i("Fragment", (args.getInt(ARG_OBJECT)) + status);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        status = " - onDestroy";
        Bundle args = getArguments();
        Log.i("Fragment", (args.getInt(ARG_OBJECT)) + status);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        status = " - onDetach";
        Bundle args = getArguments();
        Log.i("Fragment", (args.getInt(ARG_OBJECT)) + status);
    }

}