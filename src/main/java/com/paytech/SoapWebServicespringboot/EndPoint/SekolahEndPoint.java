/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytech.SoapWebServicespringboot.EndPoint;

import com.paytech.SoapWebServicespringboot.Dao.SekolahDao;
import com.paytech.SoapWebServicespringboot.Dto.DaftarSekolah;
import com.paytech.SoapWebServicespringboot.Dto.DaftarSekolahRequest;
import com.paytech.SoapWebServicespringboot.Dto.DaftarSekolahResponse;
import com.paytech.SoapWebServicespringboot.Entity.Sekolah;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author denigunawan
 */
@Endpoint
public class SekolahEndPoint {
    @Autowired
    private SekolahDao sekolahDao;
    
    public List<Sekolah> cari(String nama){
        Iterable<Sekolah> dataSekolah = sekolahDao.findAll();
        
        List<Sekolah> hasil = new ArrayList<>();
        for(Sekolah s : dataSekolah){
            hasil.add(s);
        }
        return hasil;
    }
    @PayloadRoot(localPart = "daftarSekolahRequest", namespace = "http://paytech.com/webservices/sekolah")
    @ResponsePayload
    public DaftarSekolahResponse cariSekolah(@RequestPayload DaftarSekolahRequest Request){
            String cariNama= Request.getPencarian().getNama();
            System.out.println("Mencari Sekolah Dengan nama " + cariNama);
            
            DaftarSekolahResponse resp = new DaftarSekolahResponse();
            DaftarSekolah soapBody = new DaftarSekolah();
            soapBody.setSekolah(cari(cariNama));
            resp.setDaftarSekolah(soapBody);
            return resp;
    
    }
    
}
