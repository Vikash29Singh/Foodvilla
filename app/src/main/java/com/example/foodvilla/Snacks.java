package com.example.foodvilla;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class Snacks extends Fragment implements RecyclerViewAdapter.ClickAdapterListener{
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
        Model model = new Model("Samosa","10","4.0", "2","Available", R.drawable.samosa);
        dataModel.add(model);

        model = new Model("Onion Pakoda","10","4.5", "2", "Available", R.drawable.oniopakoda);
        dataModel.add(model);

        model = new Model("Momo", "40","4.5","2", "Available", R.drawable.momo);
        dataModel.add(model);

        model = new Model("Burger", "60","4.5","4","Not Available",  R.drawable.burger);
        dataModel.add(model);


        model = new Model("Chicken ROll","60","5", "5","Available", R.drawable.chickenroll);
        dataModel.add(model);

        /*model = new Model("BLR","10","7:20", "GAU","10:45", R.drawable.foodvillalogo);
        dataModel.add(model);

        model = new Model("BLR","10","15:00", "GAU","6:00",R.drawable.foodvillalogo);
        dataModel.add(model);


        model = new Model("BLR","10","20:45", "GAU","12:25",  R.drawable.foodvillalogo);
        dataModel.add(model);*/

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

    /*private void send_data(View v) {
        int selectedItemPosition = recyclerView.getChildAdapterPosition(v);
        RecyclerView.ViewHolder viewHolder = recyclerView.findViewHolderForAdapterPosition(selectedItemPosition);

        LinearLayout linearLayoutParent = (LinearLayout) v;

        CardView cardView = (CardView) linearLayoutParent.getChildAt(0);

        LinearLayout linearLayout = (LinearLayout) cardView.getChildAt(1);

        LinearLayout linearLayout1 = (LinearLayout) linearLayout.getChildAt(0);

        LinearLayout linearLayout2 = (LinearLayout) linearLayout1.getChildAt(0);
        LinearLayout linearLayout3 = (LinearLayout) linearLayout2.getChildAt(0);

        LinearLayout linearLayout4 = (LinearLayout) linearLayout2.getChildAt(1);
        //LinearLayout linearLayout5 = (LinearLayout) linearLayout.getChildAt(1);



        origin = (TextView) linearLayout3.getChildAt(0);
        destination = (TextView) linearLayout3.getChildAt(1);
        depart_time = (TextView) linearLayout4.getChildAt(0);
        arrival_time = (TextView) linearLayout4.getChildAt(1);
        price = (TextView) linearLayout.getChildAt(1);


        originn = origin.getText().toString();
        destinationn = destination.getText().toString();
        depart_timen = depart_time.getText().toString();
        arrival_timen = arrival_time.getText().toString();
        pricen = price.getText().toString();


    }*/

   /* @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }*/
}
