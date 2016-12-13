package test;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContext;
import test.service.ITestService;

import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zechuan.guo on 2016/12/9.
 */
@Controller
public class TestController  {
    /**
    持有Service
     */
    @Resource
    private ITestService TestService;

    @RequestMapping("hello")
    public @ResponseBody
    Map sayHello(@RequestParam String text)  {
        System.out.println("Controller: "+text);
        Map map = TestService.countLength(text);
        return map;
    }

    public ITestService getTestService() {
        return TestService;
    }

    public void setTestService(ITestService testService) {
        TestService = testService;
    }
}
