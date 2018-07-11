package controller;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import service.ArticleService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
@org.springframework.stereotype.Controller
public class SaveArticleController {
    @Autowired
    @Qualifier("articeService")
    private ArticleService service;

    public void setService(ArticleService service) {
        this.service = service;
    }

    @RequestMapping("/SaveArticle.do")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        try{

            String titile=httpServletRequest.getParameter("title");
            String text=httpServletRequest.getParameter("text");
            System.out.println(httpServletRequest.getParameter("readNum")==null);
            Integer readNum=new Integer(httpServletRequest.getParameter("readNum"));
            Integer commentNum=new Integer(httpServletRequest.getParameter("commentNum"));
            Boolean isPrivated=(httpServletRequest.getParameter("isPrivated")=="true");
            Boolean isBlogOrScript=(httpServletRequest.getParameter("isBlogOrScript"))=="true";
            Boolean isGabage=(httpServletRequest.getParameter("isGabage"))=="true";
            long longTime=new Long((httpServletRequest.getParameter("createdTime")));
//            Date createdTime=new Date(longTime);
            Date createdTime=new Date();


            Article article=new Article(titile,isPrivated,isBlogOrScript,isGabage,readNum,commentNum,createdTime,text);
            System.out.println(article);
            service.addArticle(article);
            mv.setViewName("article");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return mv;


    }
}
