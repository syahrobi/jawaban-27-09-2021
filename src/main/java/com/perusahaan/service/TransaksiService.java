package com.perusahaan.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.perusahaan.dto.TransaksiDto;
import com.perusahaan.model.Transaksi;

@ApplicationScoped
public class TransaksiService {
	
	@Inject
    EntityManager em;
	
	public String getNamaPrusahaan(TransaksiDto dto) throws Exception{
        String sql = 
        		 "select a.NAMA_PERUSAHAAN from DATA_PERUSAHAAN a  "+ 
        		 "where KODE_PERUSAHAAN = :kode ";
        
        Query q = em.createNativeQuery(sql);
        q.setParameter("kode", dto.getKode_perusahaan());
        
        return q.getResultList().toString();
    }
	
	@Transactional
    public void insert(TransaksiDto dto) throws Exception{
        Transaksi transaksi = new Transaksi();
        
        String namaPerusahaan = getNamaPrusahaan(dto);
        
        transaksi.setTgl_input(dto.getTgl_input());
        transaksi.setNama_barang(dto.getNama_barang());
        transaksi.setTotal(dto.getTotal());
        transaksi.setHarga(dto.getHarga());
        transaksi.setGrand_total(dto.getGrand_total());
        transaksi.setSisi_barang(dto.getSisa_barang());
        transaksi.setNama_barang(dto.getNama_barang());
        transaksi.setNama_perusahaan(namaPerusahaan);
        transaksi.persist();
    }
	
}
