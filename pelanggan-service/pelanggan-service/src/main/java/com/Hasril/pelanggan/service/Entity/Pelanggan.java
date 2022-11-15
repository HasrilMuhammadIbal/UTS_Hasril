/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Hasril.pelanggan.service.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author hp
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pelanggan {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long kodebarang;
    private Long harga;
    private Long jumlah;
    private Long total;
    private Long diskon;
    
    public long getTotal(){
        total = harga * jumlah;
        return total;
    }
    
    public long getDiskon(){
        diskon = (harga/30);
        return diskon;
    }
    
    public long getTotalBayar(){
       long totalbayar = harga+diskon;
        return totalbayar;
    }
}
