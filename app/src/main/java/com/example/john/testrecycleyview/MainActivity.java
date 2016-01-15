package com.example.john.testrecycleyview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.john.testrecycleyview.adapter.SearchAdapter;
import com.example.john.testrecycleyview.entity.SouSuoEntity;
import com.example.john.testrecycleyview.service.SouSuoService;

import java.util.ArrayList;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity implements Callback<SouSuoEntity>,SearchAdapter.OnrecyclerViewItemClickListener {

    private RecyclerView mRecyclerView;
    private ArrayList<SouSuoEntity.DataEntity.ReturnDataEntity> mList;

    private SearchAdapter mAdapter;
    private static final String DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) this.findViewById(R.id.recycler);
        mList = new ArrayList<>();

        mAdapter = new SearchAdapter(this,mList);

        mAdapter.setListener(this);
        mRecyclerView.setAdapter(mAdapter);
        GridLayoutManager gridLayout = new GridLayoutManager(this,4);
        mRecyclerView.setLayoutManager(gridLayout);
        mRecyclerView.addItemDecoration(new ItemJianJu(4,10,false));

        SouSuoService service = new Retrofit.Builder().baseUrl("http://app.u17.com")
                .addConverterFactory(GsonConverterFactory.create()).build()
                .create(SouSuoService.class);

        Call<SouSuoEntity> call = service.getHotKeyList();
        call.enqueue(this);
        Log.i("MainActivity","..............");

    }


    @Override
    public void onResponse(Response<SouSuoEntity> response, Retrofit retrofit) {

        Log.i("MainActivity","1111111111111111");
        if(response.code() == 200){

            List<SouSuoEntity.DataEntity.ReturnDataEntity> newList = response.body().getData().getReturnData();
            mList.addAll(newList);
            Log.i("MainActivity","...,,,,,,,,,,"+newList);
            mAdapter.notifyDataSetChanged();
        }else{
            Log.i("MainActivity",response.code()+"");
        }
    }

    @Override
    public void onFailure(Throwable t) {
         t.printStackTrace();
    }

    @Override
    public void onItemClick(View view, SouSuoEntity.DataEntity.ReturnDataEntity model) {

        Intent intent = new Intent(this,SearchActivity.class);
        intent.putExtra(DATA,model);
        startActivity(intent);

    }

    public void souSuoClick(View view) {

        Intent intent = new Intent(this,SearchActivity.class);
        startActivity(intent);

    }
}
