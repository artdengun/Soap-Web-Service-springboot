package com.paytech.SoapWebServicespringboot.Entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity @Table (name = "sekolah")
public class Sekolah {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull @NotEmpty 
    private String sekolah;
    @NotNull @NotEmpty 
    private String nama;
    @NotNull @NotEmpty
    private String kode;
    @NotNull @NotEmpty
    private String wilayah;
    @NotNull @NotEmpty
    private String kodepos;
    
}
