package com.perusahaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="DATA_PERUSAHAAN")
public class Perusahaan extends PanacheEntityBase{
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private Long id;
		
		@Column(name="kode_perusahaan")
		private String kode_perusahaan;
		
		@Column(name="nama_perusahaan")
		private String nama_perusahaan;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public String getKode_perusahaan() {
			return kode_perusahaan;
		}
		public void setKode_perusahaan(String kode_perusahaan) {
			this.kode_perusahaan = kode_perusahaan;
		}
		public String getNama_perusahaan() {
			return nama_perusahaan;
		}
		public void setNama_perusahaan(String nama_perusahaan) {
			this.nama_perusahaan = nama_perusahaan;
		}
}
