package com.perusahaan.dto;

import java.util.Date;

public class TransaksiDto {
	
	private Date tgl_input;
	private String kode_perusahaan;
	private String nama_barang;
	private Integer total;
	private Integer harga;
	private Integer grand_total;
	private Integer sisa_barang;
	
	public Date getTgl_input() {
		return tgl_input;
	}
	public void setTgl_input(Date tgl_input) {
		this.tgl_input = tgl_input;
	}

	public String getKode_perusahaan() {
		return kode_perusahaan;
	}
	public void setKode_perusahaan(String kode_perusahaan) {
		this.kode_perusahaan = kode_perusahaan;
	}
	public String getNama_barang() {
		return nama_barang;
	}
	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getHarga() {
		return harga;
	}
	public void setHarga(Integer harga) {
		this.harga = harga;
	}
	public Integer getGrand_total() {
		return grand_total;
	}
	public void setGrand_total(Integer grand_total) {
		this.grand_total = grand_total;
	}
	public Integer getSisa_barang() {
		return sisa_barang;
	}
	public void setSisa_barang(Integer sisa_barang) {
		this.sisa_barang = sisa_barang;
	}
}
