package com.example.netprogarmexample_start.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

import com.example.netprogarmexample_start.result.CommonResult;
import com.example.netprogarmexample_start.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Component
public class Interceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        // 在请求处理之前进行一些操作
        System.out.println("Pre-handle: " + request.getRequestURI());

        //1.获取请求头中的令牌(token)
        String jwt = request.getHeader("token");
        System.out.println(jwt);

        //2.判断令牌是否存在,如果不存在,返回错误结果(不登陆)
        if(!StringUtils.hasLength(jwt)){
            log.info("请求头token为空,未登录");
            CommonResult error = CommonResult.fail();
            //手动转换 对象--json ---->阿里巴巴fastJSON
            String notLogin = JSONObject.toJSONString(error);
            response.getWriter().write(notLogin);
            return false;
//            return true;
        }

        //3.解析token,如果解析失败,返回错误结果(不登陆)
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) { //jwt解析失败
            e.printStackTrace();
            log.info("解析令牌失败,登录错误");
            CommonResult error = CommonResult.fail();
            //手动转换 对象--json ---->阿里巴巴fastJSON
            String notLogin = JSONObject.toJSONString(error);
            response.getWriter().write(notLogin);
            return false;
//            return true;
        }

        //4.放行
        log.info("令牌合法,放行");
        return true; // 返回 true 表示继续执行后续的拦截器或处理器
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // 在请求处理之后但视图渲染之前进行一些操作
        System.out.println("Post-handle: " + request.getRequestURI());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // 在整个请求处理完成之后进行一些操作
        System.out.println("After-completion: " + request.getRequestURI());
    }
}