package com.example.foodvilla;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class Beverages extends Fragment implements RecyclerViewAdapter.ClickAdapterListener{
    View view;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ArrayList<Model> dataModel;
    RecyclerViewAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_snacks, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setScrollBarSize(0);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        //actionModeCallback = new ActionModeCallback();
        populateDataAndSetAdapter();
        return view;
    }

    @Override
    public void onRowClicked(int position, View view) {
        Intent intent = new Intent(getActivity(),Dashboard.class);
        startActivity(intent);
    }

    private void populateDataAndSetAdapter() {


        dataModel = new ArrayList<>();
        Model model = new Model("Coffee","10","4", "2","Available", R.drawable.foodvillalogo);
        dataModel.add(model);

        model = new Model("BLR","10","12:15", "GAU", "15:20", R.drawable.foodvillalogo);
        dataModel.add(model);

        model = new Model("BLR", "10","5:50","GAU", "9:00", R.drawable.foodvillalogo);
        dataModel.add(model);

        model = new Model("BLR", "10","16:30","GAU","20:40",  R.drawable.foodvillalogo);
        dataModel.add(model);


        model = new Model("BLR","10","13:15", "GAU","4:15", R.drawable.foodvillalogo);
        dataModel.add(model);

        model = new Model("BLR","10","7:20", "GAU","10:45", R.drawable.foodvillalogo);
        dataModel.add(model);

        model = new Model("BLR","10","15:00", "GAU","6:00",R.drawable.foodvillalogo);
        dataModel.add(model);


        model = new Model("BLR","10","20:45", "GAU","12:25",  R.drawable.foodvillalogo);
        dataModel.add(model);

       /* model = new Model("Super Series", "Deuce", "Rs. 653", R.drawable.deuce_bat2);
        dataModel.add(model);
        model = new Model("New Balance", "Deuce", "Rs. 1053", R.drawable.redtennis_bat);
        dataModel.add(model);*/

       /* model = new Model("The Martian", "Science Fiction & Fantasy", "2015", false);
        dataModel.add(model);

        model = new Model("Mission: Impossible Rogue Nation", "Action", "2015", false);
        dataModel.add(model);

        model = new Model("Up", "Animation", "2009", false);
        dataModel.add(model);

        model = new Model("Star Trek", "Science Fiction", "2009", false);
        dataModel.add(model);

        model = new Model("The LEGO Movie", "Animation", "2014", false);
        dataModel.add(model);

        model = new Model("Iron Man", "Action & Adventure", "2008", false);
        dataModel.add(model);

        model = new Model("Aliens", "Science Fiction", "1986", false);
        dataModel.add(model);

        model = new Model("Chicken Run", "Animation", "2000", false);
        dataModel.add(model);

        model = new Model("Back to the Future", "Science Fiction", "1985", false);
        dataModel.add(model);

        model = new Model("Raiders of the Lost Ark", "Action & Adventure", "1981", false);
        dataModel.add(model);

        model = new Model("Goldfinger", "Action & Adventure", "1965", false);
        dataModel.add(model);

        model = new Model("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014", false);
        dataModel.add(model);
*/
        mAdapter = new RecyclerViewAdapter(getActivity(), dataModel,this);
        recyclerView.setAdapter(mAdapter);
    }

}
