package ru.geekbrains.fragmentnavigation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThridFragment extends Fragment {

    private String shape;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_thrid, container, false);

        TextView textShape = fragmentView.findViewById(R.id.textShape3);
        textShape.setText(shape);

        return fragmentView;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
