package cn.test.serviceImpl;

import cn.test.daoImpl.DistrictDaoImpl;
import cn.test.entity.District;
import cn.test.service.DistrictService;

import java.util.List;

public class DistrictServiceImpl implements DistrictService {
    private DistrictDaoImpl districtDao;

    public List<District> getDistrict(){
        return districtDao.getDistrict ();
    }

    public void setDistrictDao(DistrictDaoImpl districtDao) {
        this.districtDao = districtDao;
    }

    public DistrictDaoImpl getDistrictDao() {
        return districtDao;
    }
}
