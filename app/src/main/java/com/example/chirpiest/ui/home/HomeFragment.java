package com.example.chirpiest.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chirpiest.Burung;
import com.example.chirpiest.BurungData;
import com.example.chirpiest.DetailActivity;
import com.example.chirpiest.ListAdapter;
import com.example.chirpiest.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    View view;
    private RecyclerView rvBurung;
    private ArrayList<Burung> list = new ArrayList<>();

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);


        rvBurung = view.findViewById(R.id.rv_burung);
        rvBurung.setHasFixedSize(true);

        list.addAll(BurungData.getListData());
        showList();

        return view;
    }



    private void showList() {
        rvBurung.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListAdapter listAdapter = new ListAdapter(list);
        rvBurung.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(data -> {
            Intent moveIntent = new Intent(getActivity(), DetailActivity.class);
            moveIntent.putExtra(DetailActivity.ITEM_EXTRA, data);
            startActivity(moveIntent);
        });
    }
}