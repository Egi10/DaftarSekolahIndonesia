package id.buaja.egifcb.daftarsekolahindonesia.network.model;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("sekolah")
	private String sekolah;

	@SerializedName("kabupaten_kota")
	private String kabupatenKota;

	@SerializedName("bentuk")
	private String bentuk;

	@SerializedName("lintang")
	private String lintang;

	@SerializedName("kode_prop")
	private String kodeProp;

	@SerializedName("alamat_jalan")
	private String alamatJalan;

	@SerializedName("npsn")
	private String npsn;

	@SerializedName("bujur")
	private String bujur;

	@SerializedName("propinsi")
	private String propinsi;

	@SerializedName("kecamatan")
	private String kecamatan;

	@SerializedName("id")
	private String id;

	@SerializedName("kode_kec")
	private String kodeKec;

	@SerializedName("kode_kab_kota")
	private String kodeKabKota;

	@SerializedName("status")
	private String status;

	public void setSekolah(String sekolah){
		this.sekolah = sekolah;
	}

	public String getSekolah(){
		return sekolah;
	}

	public void setKabupatenKota(String kabupatenKota){
		this.kabupatenKota = kabupatenKota;
	}

	public String getKabupatenKota(){
		return kabupatenKota;
	}

	public void setBentuk(String bentuk){
		this.bentuk = bentuk;
	}

	public String getBentuk(){
		return bentuk;
	}

	public void setLintang(String lintang){
		this.lintang = lintang;
	}

	public String getLintang(){
		return lintang;
	}

	public void setKodeProp(String kodeProp){
		this.kodeProp = kodeProp;
	}

	public String getKodeProp(){
		return kodeProp;
	}

	public void setAlamatJalan(String alamatJalan){
		this.alamatJalan = alamatJalan;
	}

	public String getAlamatJalan(){
		return alamatJalan;
	}

	public void setNpsn(String npsn){
		this.npsn = npsn;
	}

	public String getNpsn(){
		return npsn;
	}

	public void setBujur(String bujur){
		this.bujur = bujur;
	}

	public String getBujur(){
		return bujur;
	}

	public void setPropinsi(String propinsi){
		this.propinsi = propinsi;
	}

	public String getPropinsi(){
		return propinsi;
	}

	public void setKecamatan(String kecamatan){
		this.kecamatan = kecamatan;
	}

	public String getKecamatan(){
		return kecamatan;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setKodeKec(String kodeKec){
		this.kodeKec = kodeKec;
	}

	public String getKodeKec(){
		return kodeKec;
	}

	public void setKodeKabKota(String kodeKabKota){
		this.kodeKabKota = kodeKabKota;
	}

	public String getKodeKabKota(){
		return kodeKabKota;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}