package org.fyh.idea.demo.response;

/**
 *  response工具类
 * 
 * @author:fangyunhe
 * @time:2018年3月21日 下午3:51:27
 * @version 1.0	
 */
public class ResponseUtil {
	static ResponseEnum[] values = ResponseEnum.values();
	
	/**
	 * 
	 * @Description:ResponseEnum遍历枚举
	 * @param code
	 * @return
	 * @author:fangyunhe
	 * @time:2018年9月12日 下午7:35:59
	 */
	public static String getMsgByCode(int code) {
		for (ResponseEnum responseEnum : values) {
			if(responseEnum.getCode() == code) {
				return responseEnum.getMsg();
			}
		}
		return null;
	}
}
