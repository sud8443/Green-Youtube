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

/**
 * Created by Sudhanshu on 13-05-2018.
 */

public class LibraryFragment extends Fragment {

    RecyclerView recyclerView;
    CustomRecyclerViewAdapter adapter;

    public LibraryFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_library, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.rv_frag_library);
        adapter = new CustomRecyclerViewAdapter(getContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        return v;
    }
}
