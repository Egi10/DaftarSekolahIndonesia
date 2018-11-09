package id.buaja.egifcb.daftarsekolahindonesia.view.detailsekolah;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.buaja.egifcb.daftarsekolahindonesia.R;
import id.buaja.egifcb.daftarsekolahindonesia.adapter.SekolahDetailAdapter;
import id.buaja.egifcb.daftarsekolahindonesia.network.model.DataItem;

public class DetailSekolahActivity extends AppCompatActivity implements DetailSekolahView {
    private SwipeRefreshLayout swipeRefreshLayout;
    private RecyclerView recyclerView;
    private ArrayList<DataItem> listSekolah;
    private SekolahDetailAdapter sekolahDetailAdapter;
    private DetailSekolahPresenter detailSekolahPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sekolah);

        recyclerView = findViewById(R.id.recycler_view);
        swipeRefreshLayout = findViewById(R.id.swipe_refresh);
        detailSekolahPresenter = new DetailSekolahPresenter(this);
        listSekolah = new ArrayList<>();

        swipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                loadData();
            }
        });

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loadData();
            }
        });
    }

    private void loadData() {
        String kodeWilaya = "080000";
        String bentuk = "SMA";
        detailSekolahPresenter.getDetailSekolah(kodeWilaya, bentuk);
        sekolahDetailAdapter = new SekolahDetailAdapter();
    }

    @Override
    public void onNext(List<DataItem> list) {
        listSekolah.clear();
        listSekolah.addAll(list);
        sekolahDetailAdapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void onComplete() {
        Toast.makeText(getBaseContext(), "Sukses"+listSekolah.size(), Toast.LENGTH_SHORT).show();
        sekolahDetailAdapter.setDataSekolah(listSekolah);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(sekolahDetailAdapter);
    }

    @Override
    public void showLoading() {
        swipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideLoading() {
        swipeRefreshLayout.setRefreshing(false);
    }
}
