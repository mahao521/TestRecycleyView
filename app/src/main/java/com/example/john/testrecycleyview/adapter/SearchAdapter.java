package com.example.john.testrecycleyview.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.john.testrecycleyview.R;
import com.example.john.testrecycleyview.entity.SouSuoEntity;

import java.util.ArrayList;

/**
 * Created by John on 2016/1/14.
 */
public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> implements View.OnClickListener {

    private Context mContext;
    private ArrayList<SouSuoEntity.DataEntity.ReturnDataEntity> mList;

    //定义接口回调的方法；
    private OnrecyclerViewItemClickListener mItemListener;

    public void setListener(OnrecyclerViewItemClickListener mItemListener){

        this.mItemListener = mItemListener;
    }

    public SearchAdapter(Context mContext, ArrayList<SouSuoEntity.DataEntity.ReturnDataEntity> mList){
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(mContext).inflate(R.layout.fragment_search_item,parent,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        SouSuoEntity.DataEntity.ReturnDataEntity data = mList.get(position);
        holder.mTextView.setBackgroundColor(Color.parseColor(data.getBgColor()));
        holder.mTextView.setText(data.getTag());
        holder.mTextView.setTag(data);
    }


    @Override
    public int getItemCount() {
        int len = 0;
        if(mList != null){
            len = mList.size();
        }
        return len;
    }

    @Override
    public void onClick(View v) {
        mItemListener.onItemClick(v, (SouSuoEntity.DataEntity.ReturnDataEntity) v.getTag());
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mTextView;

        public ViewHolder(View view){
            super(view);
            mTextView = (TextView) view.findViewById(R.id.recycler_item);
        }
    }

    public interface OnrecyclerViewItemClickListener{

        void onItemClick(View view,SouSuoEntity.DataEntity.ReturnDataEntity model);
    }
}
