package com.cn.cly.thead;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @ClassName: QuestTest
 * @Version: 1.0
 */
public class QuestTest {
    
    
    Map<String,String> longUrlMap = new HashMap<>();
   
    Map<String,String> shortUrlMap = new HashMap<>();
    
    String shorUrlPrefix="http://www/";
    
    public  String shourUrlCreate(String url){
        String key=MD5Util.MD5(url);
        synchronized (key){
            if(!longUrlMap.containsKey(key)){
                boolean loop=true;
                while(loop){
                    String shortUrlCode=getRandom(4);
                    String showUrl=shorUrlPrefix+shortUrlCode;
                    if(!shortUrlMap.containsKey(showUrl)){
                        longUrlMap.putIfAbsent(key,showUrl);
                        shortUrlMap.putIfAbsent(showUrl, url);
                        loop=false;
                        
                    }
                    
                }
                
            }
        }
        
        return longUrlMap.getOrDefault(key,null);
    }
    private static final String AlphaNumberStr = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public String getRandom(int length ) {
        
        return getRandom(length,AlphaNumberStr);
    }
    
    public String getRandom(int length, String source) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++ ) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        QuestTest questTest = new QuestTest();
        questTest.shourUrlCreate("http://12345");
  
    }
}
