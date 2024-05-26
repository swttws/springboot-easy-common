package com.application.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author suweitao
 */
public class ResponseUtil {

    public static JSONObject success(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code","200");
        jsonObject.put("msg","");
        jsonObject.put("data","");
        return jsonObject;
    }

    public static JSONObject success(Object data){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code","200");
        jsonObject.put("msg","");
        jsonObject.put("data",data);
        return jsonObject;
    }

    public static JSONObject error(String msg,Integer code){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        jsonObject.put("data","");
        return jsonObject;
    }

}
