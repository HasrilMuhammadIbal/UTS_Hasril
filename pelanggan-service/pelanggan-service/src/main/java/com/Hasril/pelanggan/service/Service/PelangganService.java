/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Hasril.pelanggan.service.Service;

import com.Hasril.pelanggan.service.vo.Pelanggan;
import com.Hasril.pelanggan.service.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author hp
 */
@Service
public class PelangganService {

     @Autowired
    private PelangganRepository pelangganRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Pelanggan savePelanggan(Pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }
    
    public ResponseTemplateVO getPelanggan(Long pelangganId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Pelanggan pelanggan = pelangganRepository.findByPelangganId(pelangganId);
        Penjualam penjualan = restTemplate.getForObject("http://localhost:8066/penjualan/" 
              + pelanggan.getPenjualanId(), Penjualan.class);
        vo.setPelanggan(pelanggan);
        vo.setPenjualan(penjualan);
        return vo;
    }
    
}
