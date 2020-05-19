/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytech.SoapWebServicespringboot.Dao;

import com.paytech.SoapWebServicespringboot.Entity.Sekolah;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author denigunawan
 */
public interface SekolahDao extends PagingAndSortingRepository<Sekolah, Integer> {
    
}
