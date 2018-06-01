package cn.test.test;

import cn.test.action.DistrictAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        Test t=new Test ();
        t.connTest ();
    }
    public void connTest() throws SQLException {

        ApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");


        DataSource dataSource =  (DataSource) context.getBean("dataSource");

        System.out.println(dataSource.getConnection());

        /*SessionFactory sf = (SessionFactory)context.getBean ("sessionFactory");
        Session s = sf.openSession();
        s.beginTransaction();
        District o = (District) s.get (District.class, 2);
        System.out.println (o);*/
        DistrictAction districtAction = (DistrictAction)context.getBean ("districtAction");
        String district = districtAction.getDistrict ();
        System.out.println (district);
       /* DistrictService districtservice = (DistrictService) context.getBean ("districtservice");
        List<District> list = districtservice.getDistrict ();
        for (District district : list) {
            System.out.println (district);
        }*/
    }
}
