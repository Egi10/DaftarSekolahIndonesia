package id.buaja.egifcb.daftarsekolahindonesia.view.detailsekolah;

import java.util.List;

import id.buaja.egifcb.daftarsekolahindonesia.base.BaseView;
import id.buaja.egifcb.daftarsekolahindonesia.network.model.DataItem;

public interface DetailSekolahView extends BaseView {
    void onNext(List<DataItem> list);
    void onError(String message);
    void onComplete();
}
