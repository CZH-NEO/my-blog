package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import service.ArticleService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller
public class ArticleController  {
//    private ArticleService service;
//
//    public void setService(ArticleService service) {
//        this.service = service;
//    }
    @RequestMapping("/article.do")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Cache-Control","no-cache");
        httpServletResponse.setHeader("Cache-Control","no-store");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setHeader("Pragma","no-cache");
        ModelAndView mv=new ModelAndView();
        mv.setViewName("article");
        return mv;
    }
}
