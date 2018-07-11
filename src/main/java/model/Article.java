package model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Article {
    private Integer articleid;

    private String title;

    private Boolean isprivated;

    private Boolean isblogorscript;

    private Boolean isgabage;

    private Integer readnum;

    private Integer commentnum;

    private Date createdtime;

    private String text;

    public Article(Integer articleid, String title, Boolean isprivated, Boolean isblogorscript, Boolean isgabage, Integer readnum, Integer commentnum, Timestamp createdtime, String text) {
        this.articleid = articleid;
        this.title = title;
        this.isprivated = isprivated;
        this.isblogorscript = isblogorscript;
        this.isgabage = isgabage;
        this.readnum = readnum;
        this.commentnum = commentnum;
        this.createdtime = createdtime;
        this.text = text;
    }

    public Article(String title, Boolean isprivated, Boolean isblogorscript, Boolean isgabage, Integer readnum, Integer commentnum, Date createdtime, String text) {
        this.title = title;
        this.isprivated = isprivated;
        this.isblogorscript = isblogorscript;
        this.isgabage = isgabage;
        this.readnum = readnum;
        this.commentnum = commentnum;
        this.createdtime = createdtime;
        this.text = text;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Boolean getIsprivated() {
        return isprivated;
    }

    public void setIsprivated(Boolean isprivated) {
        this.isprivated = isprivated;
    }

    public Boolean getIsblogorscript() {
        return isblogorscript;
    }

    public void setIsblogorscript(Boolean isblogorscript) {
        this.isblogorscript = isblogorscript;
    }

    public Boolean getIsgabage() {
        return isgabage;
    }

    public void setIsgabage(Boolean isgabage) {
        this.isgabage = isgabage;
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleid=" + articleid +
                ", title='" + title + '\'' +
                ", isprivated=" + isprivated +
                ", isblogorscript=" + isblogorscript +
                ", isgabage=" + isgabage +
                ", readnum=" + readnum +
                ", commentnum=" + commentnum +
                ", createdtime=" + createdtime +
                ", text='" + text.substring(20) + '\'' +
                '}'+"\n";
    }
    public String getDateString()
    {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm").format(this.createdtime);
    }
}