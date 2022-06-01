package com.learning.ProcedureCalling.Service.ServiceImpl;

import com.learning.ProcedureCalling.Dto.BrandSetupDto;
import com.learning.ProcedureCalling.Entity.BrandSetupEntity;
import com.learning.ProcedureCalling.Exception.ResourceNotFoundException;
import com.learning.ProcedureCalling.Repository.BrandSetupRepo;
import com.learning.ProcedureCalling.ResponsiveModel.CommonResponseModel;
import com.learning.ProcedureCalling.Service.BrandSetupService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BrandSetupServiceImpl implements BrandSetupService {

    @Autowired
    private BrandSetupRepo lsbrandRepo;
    @Autowired
    private ModelMapper mapper;


    @Override
    public CommonResponseModel CreateBrandInfo(BrandSetupDto lsbrandDto) {

        CommonResponseModel commonResponseModel = new CommonResponseModel();
        BrandSetupEntity lsbrand = lsbrandRepo.save(mapper.map(lsbrandDto, BrandSetupEntity.class));


        if (Long.parseLong(lsbrand.getBrdcod()) > 0){
            commonResponseModel.setResponseCode(1);
            commonResponseModel.setResponseMessage("Brand Information Save Successfully");
            commonResponseModel.setId(Long.parseLong(lsbrand.getBrdcod()));
        }

        return commonResponseModel;
    }

    @Override
    public List<BrandSetupDto> getBrandInfo() {
        List<BrandSetupEntity> lsbrands= lsbrandRepo.findAll();
        return lsbrands.stream().map
                (lsbrand -> mapToDTO(lsbrand)).collect(Collectors.toList());
    }

    @Override
    public CommonResponseModel updateBrandInfo(String id, BrandSetupDto lsbrandDto) {
        CommonResponseModel commonResponseModel = new CommonResponseModel();
        Optional<BrandSetupEntity> lsbrand = lsbrandRepo.findById(id);
        if (!lsbrand.isPresent()) {
            commonResponseModel.setResponseMessage("No Data Found "+id);
            return commonResponseModel;
        }
        BrandSetupEntity lsbrand1 = mapToEntity(lsbrandDto);
        lsbrand1.setBrdcod(lsbrand.get().getBrdcod());
        BrandSetupEntity update = lsbrandRepo.save(lsbrand1);
        commonResponseModel.setId(Long.parseLong(id));
        commonResponseModel.setResponseCode(1);
        commonResponseModel.setResponseMessage("Brand Info update Successfully");
        return commonResponseModel;
    }

    @Override
    public BrandSetupDto getBrandInfoById(String id) {
        BrandSetupEntity lsbrand = lsbrandRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("BrandSetupEntity", "id", id));
        return mapToDTO(lsbrand);
    }

    private BrandSetupDto mapToDTO(BrandSetupEntity lsbrand){

        BrandSetupDto lsbrandDto = mapper.map(lsbrand, BrandSetupDto.class);
        return lsbrandDto;
    }


    private BrandSetupEntity mapToEntity(BrandSetupDto lsbrandDto){

        BrandSetupEntity lsbrand = mapper.map(lsbrandDto, BrandSetupEntity.class);
        return lsbrand;
    }
}
