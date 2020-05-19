
package com.paytech.SoapWebServicespringboot.Dto;

import com.paytech.SoapWebServicespringboot.Entity.Sekolah;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;


@Data
public class DaftarSekolah {
    private List<Sekolah> sekolah = new ArrayList<>();
}
