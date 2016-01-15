package com.example.john.testrecycleyview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 16-1-15.
 */
public class ItemJianJu extends RecyclerView.ItemDecoration {

    private int spanCount;
    private int spacing;
    private boolean isEndSpacing;

    public ItemJianJu(int spanCount ,int spacing,boolean isEndSpacing ){
        this.spanCount = spanCount;
        this.spacing = spacing;
        this.isEndSpacing = isEndSpacing;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        int position = parent.getChildAdapterPosition(view);
        int column = position%spanCount;

        if(isEndSpacing == true){
            outRect.left = spacing - column*spacing/spanCount;
            outRect.right = position%spanCount;

            if(position < spanCount){
                outRect.top = spacing;
            }
            outRect.bottom = spacing;
        }else{

            outRect.left = column*spacing/spanCount;
            outRect.right = spacing-(column+1)*spacing/spanCount;

            if(position >= spanCount){
                outRect.top= spacing;
            }
        }

    }
}
