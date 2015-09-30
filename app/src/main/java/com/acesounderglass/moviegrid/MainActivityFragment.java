package com.acesounderglass.moviegrid;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    GridLayout grid;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        GridLayout grid =  (GridLayout) view.findViewById(R.id.gridLayout);
        TextView t = new TextView(getActivity().getApplicationContext());
        t.setText("new cell");
//        View cellView = view.findViewById(R.id.cell1);
        grid.addView(t);

        view.refreshDrawableState();

        return view;
    }
}
