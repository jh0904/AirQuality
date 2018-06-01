package cn.test.daoImpl;

import cn.test.dao.DistrictDao;
import cn.test.entity.District;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;
@SuppressWarnings("unchecked")
public class DistrictDaoImpl  extends HibernateDaoSupport implements DistrictDao {
    @Override
    public List<District> getDistrict() {
        return (List<District>) this.getHibernateTemplate ().find ("from District");
    }
}
