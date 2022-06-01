package com.learning.ProcedureCalling.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LSBRAND")
public class BrandSetupEntity  {
    @Id
    @Size(min = 3,message ="Brand Code not Less then 3!")
    @Size(max = 6,message ="Brand Code not Less then 6!")
    private String brdcod;

    @NotEmpty(message = "Brand Title is mandatory")
    private String brdtit;

    @NotBlank
    private String brdcountry;
    private String remarks;
    @Size(min = 1,message ="This field must have single character !")
    @Size(max = 1,message ="This field must have single character !")
    private String status;

    private String oprstamp;

    private Date oprtimstamp;
    private String updstamp;
    private Date updtimstamp;
}
