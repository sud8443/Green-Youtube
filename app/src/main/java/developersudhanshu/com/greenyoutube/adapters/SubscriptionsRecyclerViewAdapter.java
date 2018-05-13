package developersudhanshu.com.greenyoutube.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import developersudhanshu.com.greenyoutube.R;

/**
 * Created by Sudhanshu on 13-05-2018.
 */

public class SubscriptionsRecyclerViewAdapter extends RecyclerView.Adapter<SubscriptionsRecyclerViewAdapter.ViewHolder> {

    Context mContext;

    public SubscriptionsRecyclerViewAdapter(Context context){
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = View.inflate(mContext, R.layout.list_item_subscriptions, null);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if(position%2 == 0){
            holder.thumbnail.setImageBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(mContext.getResources(), R.drawable.android),800,600,false));
            holder.title.setText("Android Developers");
        }else {
            holder.thumbnail.setImageBitmap(BitmapFactory.decodeResource(mContext.getResources(), R.drawable.google_io18));
            holder.title.setText("Google Developers");
        }

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView thumbnail;
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_sub_title);
            thumbnail = itemView.findViewById(R.id.img_view_sub_thumbnail);
        }
    }
}