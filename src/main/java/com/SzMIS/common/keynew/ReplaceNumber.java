package com.SzMIS.common.keynew;
import java.util.LinkedList;
/**
 * 初始化编号
 * 根据传递的数字转变成字母
 * */
public class ReplaceNumber
{
   public static String newkey(int key){
	   if(key==0){
		   return "A000";
	   }
	   String keyvar=key+"";
	   int keyvar_len=keyvar.length();
	   if(keyvar_len==1){
		   return "A00"+key;
	   }else if(keyvar_len==2){
		   return "A0"+key;
	   }else if(keyvar_len==3){
		   return "A"+key;
	   }else{
		 //  System.out.println(key+"值");
		   String keyvar_sub=keyvar.substring(0,keyvar_len-3);
		   String keyvar_sub2=keyvar.substring(keyvar_len-3,keyvar_len);
		//   System.out.println(keyvar_sub);
	//	   System.out.println(keyvar_sub2);
		  char[] keysubc= keyvar_sub.toCharArray();
		  keyvar_sub="";
		  for(char c:keysubc){
			  keyvar_sub+=(char)(Integer.parseInt(c+"")+65);
			 //System.out.println((char)(Integer.parseInt(c+"")+64));
		  }
		  keyvar_sub+=keyvar_sub2;
		  return keyvar_sub;
	   } 
	   
	   
	   
   }
   public static void main(String[]d){
	  System.out.println("1位:"+ReplaceNumber.newkey(2));  
	  System.out.println("2位:"+ReplaceNumber.newkey(20));  
	  System.out.println("3位:"+ReplaceNumber.newkey(100));  
	  System.out.println("4位:"+ReplaceNumber.newkey(2000));  
   }
}
