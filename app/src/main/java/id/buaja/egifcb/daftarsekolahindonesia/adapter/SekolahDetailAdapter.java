package id.buaja.egifcb.daftarsekolahindonesia.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import id.buaja.egifcb.daftarsekolahindonesia.R;
import id.buaja.egifcb.daftarsekolahindonesia.network.model.DataItem;

public class SekolahDetailAdapter extends RecyclerView.Adapter<SekolahDetailAdapter.ViewHolder> {
    private ArrayList<DataItem> listMovie;

    private ArrayList<DataItem> getDataSekolah() {
        return listMovie;
    }

    public void setDataSekolah(ArrayList<DataItem> listMovie) {
        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_detail_sekolah, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataItem dataItem = getDataSekolah().get(position);

        holder.tvSekolah.setText(dataItem.getSekolah());
        holder.tvKabupaten.setText(dataItem.getKabupatenKota());
        holder.tvKecamatan.setText(dataItem.getKecamatan());
    }

    @Override
    public int getItemCount() {
        return getDataSekolah().size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvSekolah;
        private TextView tvKabupaten;
        private TextView tvKecamatan;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvSekolah = itemView.findViewById(R.id.tv_sekolah);
            tvKabupaten = itemView.findViewById(R.id.tv_kabupaten);
            tvKecamatan = itemView.findViewById(R.id.tv_kecamatan);
        }
    }
}
