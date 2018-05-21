package developersudhanshu.com.greenyoutube;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sudhanshu on 13-05-2018.
 */

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomRecyclerViewAdapter.ViewHolder> {

    Context mContext;
    OnItemClickListener mItemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener){
        mItemClickListener = listener;
    }

    public CustomRecyclerViewAdapter(Context context){
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = View.inflate(mContext, R.layout.list_item_recycler_view, null);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mItemClickListener.onItemClicked(position);
            }
        });
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

    public interface OnItemClickListener{
        void onItemClicked(int position);
    }
}
