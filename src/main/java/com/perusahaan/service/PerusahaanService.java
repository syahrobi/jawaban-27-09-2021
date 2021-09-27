package com.perusahaan.service;
import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import com.perusahaan.dto.PerusahaanDto;
import com.perusahaan.model.Perusahaan;

@ApplicationScoped
public class PerusahaanService {
	
	@Transactional
    public void insert(PerusahaanDto dto){
        Perusahaan perusahaan = new Perusahaan();
        
        perusahaan.setKode_perusahaan(dto.getKode_perusahaan());
        perusahaan.setNama_perusahaan(dto.getNama_perusahaan());
        perusahaan.persist();
    }
}
