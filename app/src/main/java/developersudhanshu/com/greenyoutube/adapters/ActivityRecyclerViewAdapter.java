package developersudhanshu.com.greenyoutube.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import developersudhanshu.com.greenyoutube.R;

/**
 * Created by HP on 13-05-2018.
 */

public class ActivityRecyclerViewAdapter extends RecyclerView.Adapter<ActivityRecyclerViewAdapter.ViewHolder> {

    Context mContext;

    public ActivityRecyclerViewAdapter(Context context){
        mContext = context;
    }

    @Override
    public ActivityRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = View.inflate(mContext, R.layout.list_item_activity, null);
        ActivityRecyclerViewAdapter.ViewHolder viewHolder = new ActivityRecyclerViewAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ActivityRecyclerViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}

