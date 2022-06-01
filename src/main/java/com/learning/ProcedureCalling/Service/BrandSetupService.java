package com.learning.ProcedureCalling.Service;

import com.learning.ProcedureCalling.Dto.BrandSetupDto;
import com.learning.ProcedureCalling.ResponsiveModel.CommonResponseModel;

import java.util.List;

public interface BrandSetupService {

    CommonResponseModel CreateBrandInfo(BrandSetupDto lsbrandDto );

    List<BrandSetupDto> getBrandInfo();

    CommonResponseModel updateBrandInfo(String id, BrandSetupDto lsbrandDto );

    BrandSetupDto getBrandInfoById(String id);
}
