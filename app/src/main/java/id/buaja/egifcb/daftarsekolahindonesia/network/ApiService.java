package id.buaja.egifcb.daftarsekolahindonesia.network;

import id.buaja.egifcb.daftarsekolahindonesia.network.model.Response;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("api/index.php/Csekolah/detailSekolahGET")
    Observable<Response> getDetailSekolah(
            @Query("mst_kode_wilayah") String mstKodeWilayah,
            @Query("bentuk") String bentuk);
}
