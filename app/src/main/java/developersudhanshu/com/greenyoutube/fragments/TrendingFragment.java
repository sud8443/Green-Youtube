package developersudhanshu.com.greenyoutube.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import developersudhanshu.com.greenyoutube.CustomRecyclerViewAdapter;
import developersudhanshu.com.greenyoutube.R;
import developersudhanshu.com.greenyoutube.adapters.TrendingRecyclerViewAdapter;

/**
 * Created by Sudhanshu on 13-05-2018.
 */

public class TrendingFragment extends Fragment {

    RecyclerView recyclerView;
    TrendingRecyclerViewAdapter adapter;

    public TrendingFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_trending, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.rv_frag_trending);
        adapter = new TrendingRecyclerViewAdapter(getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        return v;
    }
}
