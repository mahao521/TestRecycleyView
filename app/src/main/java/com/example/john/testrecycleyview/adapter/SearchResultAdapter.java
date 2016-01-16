package com.example.john.testrecycleyview.adapter;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.john.testrecycleyview.R;
import com.example.john.testrecycleyview.entity.SouSuoResultEntity;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Administrator on 16-1-15.
 */
public class SearchResultAdapter  extends RecyclerView.Adapter<SearchResultAdapter.ViewHolder>{


    private Context mContext;
    private List<SouSuoResultEntity.DataEntity.ReturnDataEntity.ComicListEntity> mList;

    public SearchResultAdapter(Context mContext, List<SouSuoResultEntity.DataEntity.ReturnDataEntity.ComicListEntity> mList){
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.activity_search_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        SouSuoResultEntity.DataEntity.ReturnDataEntity.ComicListEntity data = mList.get(position);

        holder.cover.setImageURI(Uri.parse(data.getCover()));
        WindowManager window = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        Display display = window.getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        int width = point.x;
        int height= point.y;
        float ratio = height/width;
        holder.cover.setAspectRatio(ratio);

        holder.title.setText(data.getName());
        holder.nickName.setText(data.getNickname());
        holder.clickTotal.setText(data.getClick_total());
        holder.type.setText(data.getTags().get(0));
        holder.description.setText(data.getDescription());

    }

    @Override
    public int getItemCount() {

        int len = 0;
        if(mList != null){
            len = mList.size();
        }
        return len;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private SimpleDraweeView cover;
        private TextView  title;
        private TextView  nickName;
        private TextView  clickTotal;
        private TextView  type;
        private TextView  description;

        public ViewHolder(View itemView) {
            super(itemView);
            cover = (SimpleDraweeView) itemView.findViewById(R.id.search_image_cover);
            title = (TextView)itemView.findViewById(R.id.search_txt_title);
            nickName = (TextView)itemView.findViewById(R.id.search_txt_nickname);
            clickTotal = (TextView)itemView.findViewById(R.id.search_click_total);
            type = (TextView)itemView.findViewById(R.id.search_type);
            description = (TextView) itemView.findViewById(R.id.search_txt_description);
        }
    }
}
