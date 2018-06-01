package cn.test.action;

import cn.test.entity.District;
import cn.test.serviceImpl.DistrictServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.List;
@SuppressWarnings({"serial"})
public class DistrictAction extends ActionSupport{
    private DistrictServiceImpl districtservice;
    private HttpSession session;
    public String getDistrict(){
        System.out.println ("-----------action");
        List<District> list = districtservice.getDistrict ();
        session = ServletActionContext.getRequest().getSession();//获取session对象
        session.setAttribute("list",list);
        return SUCCESS;
    }
    public void setDistrictservice(DistrictServiceImpl districtservice) {
        this.districtservice = districtservice;
    }

    public DistrictServiceImpl getDistrictservice() {
        return districtservice;
    }

    public HttpSession getSession() {
        return session;
    }

    public void setSession(HttpSession session) {
        this.session = session;
    }
}
