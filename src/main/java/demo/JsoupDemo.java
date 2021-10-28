package demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.Timestamp;

public class JsoupDemo {
    public static void csdnlog(){
        try{
            String Url = "https://www.cnblogs.com/aggsite/SideRight";
            Document document = Jsoup.connect(Url)
                    .timeout(10000)
                    .ignoreContentType(true)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36")
                    .get();

            Elements element = document.select(".w_r").eq(1).select("li");
            Elements elements = document.getAllElements();
            //Timestamp time = DateUtils.getTimestamp();
            String nativeSql = "DELETE FROM app_collect WHERE type=? ";
            //dynamicQuery.nativeExecuteUpdate(nativeSql,new Object[]{CollectConstant.CNBLOGS.getType()});
            elements.forEach(em->{
                //Collect collect = new Collect();
                String href = em.select("a").attr("href");
                String title = em.select("a").text().replace("search","");
                System.out.println(href);
                System.out.println(title);

            });
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JsoupDemo.csdnlog();
    }
}
