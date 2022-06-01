package com.learning.ProcedureCalling.Controller;

import com.learning.ProcedureCalling.Dto.BrandSetupDto;
import com.learning.ProcedureCalling.ResponsiveModel.CommonResponseModel;
import com.learning.ProcedureCalling.Service.BrandSetupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/LSM")
public class BrandSetupController {

    @Autowired
    private BrandSetupService lsbrandService;


    @PostMapping("/AddBrandInfo")
    public CommonResponseModel AddBrand(@Valid @RequestBody BrandSetupDto lsbrandDto) {

        return lsbrandService.CreateBrandInfo(lsbrandDto);
    }

    @GetMapping("/GetBrandInfos")
    public List<BrandSetupDto> GetALLBrands(){
        return lsbrandService.getBrandInfo();
    }

    @GetMapping("/BrandInfo/{id}")
    public BrandSetupDto getDrawerAllocate(@PathVariable String id) {
        return lsbrandService.getBrandInfoById(id);
    }


    @PutMapping("/BrandInfo/{id}")
    public CommonResponseModel update(@Valid @PathVariable String id, @RequestBody BrandSetupDto lsbrandDto) {
        return lsbrandService.updateBrandInfo(id,lsbrandDto);
    }
}
