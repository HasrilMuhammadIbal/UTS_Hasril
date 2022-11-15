/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Hasril.pelanggan.service.Repository;

import com.Hasril.pelanggan.service.vo.Pelanggan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository
public interface PelangganRepository extends JpaRepository<Pelanggan, Long> {
    public Pelanggan findByPelangganId(Long pelangganId);
}
