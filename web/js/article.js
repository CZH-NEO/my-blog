$(function(){
    $("#publish").click(function(){
        var url = "/home/SaveArticle.do";
        var title = $("#title").val();

        var text = editor.txt.html();
        if(title == "" || text == "<p><br></p>"){
            alert("请输入标题与内容");
            return;
        }


        var isPrivated =false;
        var isBlogOrScript =true;
        var isGabage =false;
        var readNum =0;
        var commentNum =0;
        var createdTime=new Date().getTime();

            $.post(url,
            {
                title:title,
                text:text,
                isPrivated:isPrivated,
                isBlogOrScript:isBlogOrScript,
                isGabage:isGabage,
                readNum:readNum,
                commentNum:commentNum,
                createdTime:createdTime
            },
            function(){
                    window.location.href = "/home/article.do";
            });
    });
});