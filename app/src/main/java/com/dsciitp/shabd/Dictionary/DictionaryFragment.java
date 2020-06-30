package com.dsciitp.shabd.Dictionary;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dsciitp.shabd.R;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DictionaryFragment extends Fragment {

    public DictionaryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dictionary, container, false);
        final RecyclerView rview = view.findViewById(R.id.topic_dict_recycler_view);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 3);
        rview.setLayoutManager(layoutManager);
        ArrayList<String> mylist = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.alphabets)));
        DictionaryAdapter madapter = new DictionaryAdapter(mylist, getActivity(), (DictionaryAdapter.OnCategorySelectedListener) getActivity());
        rview.setAdapter(madapter);
        return view;
    }
}
