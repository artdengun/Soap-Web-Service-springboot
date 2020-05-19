
package com.paytech.SoapWebServicespringboot.Dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;


@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "daftarSekolahResponse")
public class DaftarSekolahResponse {
    private DaftarSekolah daftarSekolah;
}
