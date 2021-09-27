package com.perusahaan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="DATA_TRANSAKSI")
public class Transaksi extends PanacheEntityBase{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name="tgl_input")
	private Date tgl_input;
	
	@Column(name="nama_perusahaan")
	private String nama_perusahaan;
	
	@Column(name="nama_barang")
	private String nama_barang;
	
	@Column(name="total")
	private Integer total;
	
	@Column(name="harga")
	private Integer harga;
	
	@Column(name="grand_total")
	private Integer grand_total;
	
	@Column(name="sisa_barang")
	private Integer sisa_barang;
	
	public String getNama_perusahaan() {
		return nama_perusahaan;
	}
	public void setNama_perusahaan(String nama_perusahaan) {
		this.nama_perusahaan = nama_perusahaan;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getTgl_input() {
		return tgl_input;
	}
	public void setTgl_input(Date tgl_input) {
		this.tgl_input = tgl_input;
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
	public void setSisi_barang(Integer sisa_barang) {
		this.sisa_barang = sisa_barang;
	}

}
