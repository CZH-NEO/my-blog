package controller;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.ArticleService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    @Qualifier("articeService")
    private ArticleService service;

    public void setService(ArticleService service) {
        this.service = service;
    }

//    @RequestMapping("/")
//    public ModelAndView initPage(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)throws Exception
//    {
//        ModelAndView mv=new ModelAndView();
//        List<Article> articleList=service.selectAllArticle();
//
//        mv.setViewName("/html/index.html");
//        return mv;
//    }
    @RequestMapping("/")
    public String initPage(HttpServletResponse httpServletResponse,Model model)throws Exception
    {
        httpServletResponse.setHeader("Cache-Control","no-cache");
        httpServletResponse.setHeader("Cache-Control","no-store");
        httpServletResponse.setDateHeader("Expires", 0);
        httpServletResponse.setHeader("Pragma","no-cache");

        List<Article> articleList=service.selectAllArticle();
        model.addAttribute("articleList",articleList);
        System.out.println(articleList);
//        return "/html/index.html";
        return "index";
    }
    @ExceptionHandler(Exception.class)
    public void displayMVCException(Exception ex)
    {
        ex.printStackTrace();
    }

//    @RequestMapping("/")
//    @ResponseBody
//    public String hello(){
//        return "hello";
//    }
}
