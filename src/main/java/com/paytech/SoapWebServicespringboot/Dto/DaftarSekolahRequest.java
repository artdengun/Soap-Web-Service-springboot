/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytech.SoapWebServicespringboot.Dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author denigunawan
 */

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(
        name = "daftarSekolahRequest",
        namespace = "https://paytech.com/webservices/sekolah"
)
public class DaftarSekolahRequest {
    private Pencarian pencarian;
}
