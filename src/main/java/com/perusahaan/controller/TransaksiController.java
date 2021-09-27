package com.perusahaan.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.perusahaan.dto.ResInfo;
import com.perusahaan.dto.TransaksiDto;
import com.perusahaan.service.TransaksiService;

@Path("transaksi/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TransaksiController {

	@Inject
	TransaksiService transaksiService; 
	
	@POST
    @Path("/insert")
    public Response InsertPereusahan(TransaksiDto dto){
        ResInfo response = new ResInfo();
        
        try{
        	transaksiService.insert(dto);
            response.setMessage("success");
            response.setStatus("200");
        }catch (Exception e){
            response.setMessage(e.getMessage());
            response.setStatus("500");
        }
        return Response.ok(response).build();
    }
}
