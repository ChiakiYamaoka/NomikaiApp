package com.example.chiakiyamaoka.nomikaiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chiakiyamaoka on 2017/05/13.
 */

public class EventFolderFragment extends Fragment {

    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;


    private final String[] myDataset = {
            "a",
            "b",
            "c",
            "d"
    };

    @Override
    public void setHasOptionsMenu(boolean hasMenu) {
        super.setHasOptionsMenu(hasMenu);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        menu.findItem(R.id.add_event).setVisible(true);
        menu.findItem(R.id.delete_event).setVisible(false);
        menu.findItem(R.id.save_event).setVisible(false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_event:
                Intent intent = new Intent(getActivity(), EventSetActivity.class);
                startActivity(intent);
                break;
            case R.id.delete_event:
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public EventFolderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_event_folder, container, false);

        // fragmentを上書きする前に、前回の表示情報を消去
        container.removeAllViews();

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getContext());

        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyRecyclerAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        setHasOptionsMenu(true);

        return view;
    }
}
