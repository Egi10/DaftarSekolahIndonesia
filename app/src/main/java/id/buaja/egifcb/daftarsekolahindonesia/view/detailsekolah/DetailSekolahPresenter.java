package id.buaja.egifcb.daftarsekolahindonesia.view.detailsekolah;

import id.buaja.egifcb.daftarsekolahindonesia.network.ApiClient;
import id.buaja.egifcb.daftarsekolahindonesia.network.ApiService;
import id.buaja.egifcb.daftarsekolahindonesia.network.model.Response;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

class DetailSekolahPresenter {
    private DetailSekolahView view;

    DetailSekolahPresenter(DetailSekolahView view) {
        this.view = view;
    }

    void getDetailSekolah(String kodeWilaya, String bentuk) {
        view.showLoading();

        CompositeDisposable disposable = new CompositeDisposable();
        ApiService apiService = ApiClient.getClient().create(ApiService.class);
        disposable.add(apiService.getDetailSekolah(kodeWilaya, bentuk)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<Response>() {
                    @Override
                    public void onNext(Response response) {
                        view.onNext(response.getData());
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.onError(e.getMessage());
                        view.hideLoading();
                    }

                    @Override
                    public void onComplete() {
                        view.onComplete();
                        view.hideLoading();
                    }
                }));
    }
}
