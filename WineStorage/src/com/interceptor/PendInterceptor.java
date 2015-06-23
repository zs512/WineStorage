package com.interceptor;


import com.dao.ComRightDAO;
import com.dao.ComUserRightDAO;
import com.domain.ComRight;
import com.domain.ComUser;
import com.domain.ComUserRight;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by ruanqx on 2015/6/23.
 */
public class PendInterceptor implements Interceptor {

    private String errorToGo;

    public String getErrorToGo() {
        return errorToGo;
    }

    public void setErrorToGo(String errorToGo) {
        this.errorToGo = errorToGo;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionContext actionContext = invocation.getInvocationContext();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Map session = actionContext.getSession();
        String userId = (String)session.get("userId");
        ComUserRightDAO comUserRightDAO = (ComUserRightDAO)applicationContext.getBean("ComUserRightDAO");
        ComRightDAO comRightDAO = (ComRightDAO)applicationContext.getBean("ComRightDAO");
        ComUserRight comUserRight = new ComUserRight();

        ComUser comUser = new ComUser();
        comUser.setId(userId);
        comUserRight.setComUser(comUser);
        List<ComUserRight> comUserRightList = comUserRightDAO.findByExample(comUserRight);
        Iterator<ComUserRight> iterator = comUserRightList.iterator();
        while(iterator.hasNext()){
            ComUserRight userRight = iterator.next();
            ComRight comRight = comRightDAO.findById(userRight.getRightId());
            System.out.println(comRight.getRightName());
            if("shenpi".equals(comRight.getRightName())){
                return invocation.invoke();
            }

        }
        return this.errorToGo;
    }
}
