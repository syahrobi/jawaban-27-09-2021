package com.perusahaan.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.perusahaan.dto.PerusahaanDto;
import com.perusahaan.dto.ResInfo;
import com.perusahaan.service.PerusahaanService;

@Path("perusahaan/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PerusahaanController {
	
	@Inject
	PerusahaanService perushaanService;

	@POST
    @Path("/insert")
    public Response InsertPereusahan(PerusahaanDto dto){
        ResInfo response = new ResInfo();
        
        try{
            perushaanService.insert(dto);
            response.setMessage("success");
            response.setStatus("200");
        }catch (Exception e){
            response.setMessage(e.getMessage());
            response.setStatus("500");
        }
        return Response.ok(response).build();
    }
}
