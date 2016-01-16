package com.example.john.testrecycleyview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.john.testrecycleyview.adapter.SearchResultAdapter;
import com.example.john.testrecycleyview.entity.SouSuoEntity;
import com.example.john.testrecycleyview.entity.SouSuoResultEntity;
import com.example.john.testrecycleyview.service.SouSuoService;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class SearchActivity extends AppCompatActivity implements Callback<SouSuoResultEntity> {

    private static final String DATA = "data";
    private RecyclerView mRecyclearView;
    private SearchResultAdapter mAdapter;
    private List<SouSuoResultEntity.DataEntity.ReturnDataEntity.ComicListEntity> mList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        mRecyclearView = (RecyclerView) findViewById(R.id.search_recyview);
        mList = new ArrayList<>();
       mAdapter = new SearchResultAdapter(this,mList);
        mRecyclearView.setAdapter(mAdapter);
        Intent intent = getIntent();

        //SouSuoEntity.DataEntity.ReturnDataEntity data = (SouSuoEntity.DataEntity.ReturnDataEntity) intent.getSerializableExtra(DATA);

        SouSuoService service = new Retrofit.Builder().baseUrl("http://app.u17.com")
                .addConverterFactory(GsonConverterFactory.create()).build()
                .create(SouSuoService.class);
        Call<SouSuoResultEntity> call = service.getRecommandList("rslist","长歌行",1);
        call.enqueue(this);

    }
    @Override
    public void onResponse(Response<SouSuoResultEntity> response, Retrofit retrofit) {

        Log.i("mahao","..."+response.code());
        if(response.code() == 200){

            Log.i("mahao",response.body().getData().getReturnData().getComicList().toString());
            List<SouSuoResultEntity.DataEntity.ReturnDataEntity.ComicListEntity> newList  = response.body().getData().getReturnData().getComicList();
            mList.addAll(newList);
            Log.i("mahao","....."+mList.size());
            mAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onFailure(Throwable t) {

       t.printStackTrace();
    }
}










