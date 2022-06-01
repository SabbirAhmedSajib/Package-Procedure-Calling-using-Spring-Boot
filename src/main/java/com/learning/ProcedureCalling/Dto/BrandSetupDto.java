package com.learning.ProcedureCalling.Dto;

import lombok.Data;

import java.sql.Date;

@Data
public class BrandSetupDto {
    private String brdcod;
    private String brdtit;
    private String brdcountry;
    private String remarks;
    private String status;
    private String oprstamp;
    private Date oprtimstamp;
    private String updstamp;
    private Date updtimstamp;
}
