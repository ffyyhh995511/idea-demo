package org.fyh.idea.demo.response;


import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @author fangyunhe
 *
 * 2017年9月13日 下午2:34:21
 */
@Data
public class Response<T> implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer code;      
	
    private String msg;
    
    private T data;

    public Response(T data, Integer code, String msg){
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
    
    /**
     * 
     * @Description:返回成功结果
     * @return
     * @author:fangyunhe
     * @time:2018年9月12日 下午7:42:31
     */
    public static <T> Response<T> successResponse() {
        return new Response<T>(null, ResponseEnum.STATUS200.getCode(), ResponseEnum.STATUS200.getMsg());
    }
    
    public static <T> Response<T> successResponse(T data) {
        return new Response<T>(data, ResponseEnum.STATUS200.getCode(), ResponseEnum.STATUS200.getMsg());
    }
    
    public static <T> Response<T> successResponse(String msg) {
        return new Response<T>(null, ResponseEnum.STATUS200.getCode(), msg);
    }
    
    public static <T> Response<T> successResponse(T data,String msg) {
        return new Response<T>(data, ResponseEnum.STATUS200.getCode(), msg);
    }
    public static <T> Response<T> successResponse(T data, int code) {
    	return new Response<T>(data, code, ResponseUtil.getMsgByCode(code));
    }
    
    /**
     * 
     * @Description:返回失败结果
     * @return
     * @author:fangyunhe
     * @time:2018年9月12日 下午7:41:28
     */
    public static <T> Response<T> failedResponse() {
        return new Response<T>(null, ResponseEnum.STATUS400.getCode(), ResponseEnum.STATUS400.getMsg());
    }
    
    public static <T> Response<T> failedResponse(T data) {
        return new Response<T>(data, ResponseEnum.STATUS400.getCode(), ResponseEnum.STATUS400.getMsg());
    }
    
    public static <T> Response<T> failedResponse(String msg) {
        return new Response<T>(null, ResponseEnum.STATUS400.getCode(), msg);
    }
    
    public static <T> Response<T> failedResponse(int code) {
        return new Response<T>(null, code, ResponseUtil.getMsgByCode(code));
    }
    
    public static <T> Response<T> failedResponse(int code, String msg) {
        return new Response<T>(null, code, msg);
    }
    public static <T> Response<T> failedResponse(T data, int code) {
    	return new Response<T>(data, code, ResponseUtil.getMsgByCode(code));
    }
    
    /**
     * 
     * @Description:内部错误
     * @return
     * @author:fangyunhe
     * @time:2018年9月12日 下午7:41:15
     */
    public static <T> Response<T> interiorErrorResponse() {
        return new Response<T>(null, ResponseEnum.STATUS500.getCode(), ResponseEnum.STATUS500.getMsg());
    }

	public static Response<Exception> interiorErrorResponse(int errorCode, String msg) {
		return new Response<Exception>(null, errorCode, msg);
	}
}
