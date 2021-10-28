package com.user.message;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import com.sun.net.httpserver.Authenticator.Result;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

//핸드폰 인증관련 CoolSMS
public class messageApp {
	public static void main(String[] args) {
		String api_key = "NCS9CI1UWC8LFNBC"; //개인용키
	    String api_secret = "RDZZW13SAMYGVSTY7CHRQINZKJ04BH5L"; //개인용 시크릿 키
	    Message coolsms = new Message(api_key, api_secret);

	    String ran = numberGen();
	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01035939862"); //수신번호
	    params.put("from", "01035939862"); //발신번호
	    params.put("type", "SMS");
	    params.put("text", "인증번호는" +  ran +"입니다."); //문자내용
	    params.put("app_version", "test app 1.2"); // application name and version
	    
	    try {
	      JSONObject obj = (JSONObject) coolsms.send(params);
	      System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	      System.out.println(e.getMessage());
	      System.out.println(e.getCode());
	    }
	    
	   
	}
public static String numberGen() {
	 	
		Random rand = new Random();
        // 난수가 저장될 변수
        String numStr = ""; 
        // len : 난수 자릿수
        int len = 4;
        // dupCd : 난수의 중복 허용 여부 ( 1 허용 / 2 비 허용 )
        int dupCd = 1;
        
        for(int i = 0; i < len; i++) {
            
            //0~9 까지 난수 생성
            String ran = Integer.toString(rand.nextInt(10));
            
            if(dupCd==1) {
                //중복 허용시 numStr에 append
                numStr += ran;
            }else if(dupCd==2) {
                //중복을 허용하지 않을시 중복된 값이 있는지 검사한다
                if(!numStr.contains(ran)) {
                    //중복된 값이 없으면 numStr에 append
                    numStr += ran;
                }else {
                    //생성된 난수가 중복되면 루틴을 다시 실행한다
                    i-=1;
                }
            }
        }
        return numStr;	
	}
}


