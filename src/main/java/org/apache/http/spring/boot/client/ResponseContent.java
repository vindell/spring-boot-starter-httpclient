package org.apache.http.spring.boot.client;

import java.io.InputStream;
import java.util.Map;

/**
 * 封装HttpClient返回数据
 * @author 		： <a href="https://github.com/hiwepy">hiwepy</a>
 */
public class ResponseContent {

	private String encoding;

	private byte[] contentBytes;

	private int statusCode;

	private String contentText;

	private String contentType;

	private String contentTypeString;
	
	private InputStream content;
	
	private Map<String,String> allHeaders;

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public byte[] getContentBytes() {
		return contentBytes;
	}

	public void setContentBytes(byte[] contentBytes) {
		this.contentBytes = contentBytes;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getContentText() {
		return contentText;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentTypeString() {
		return contentTypeString;
	}

	public void setContentTypeString(String contentTypeString) {
		this.contentTypeString = contentTypeString;
	}

	public InputStream getContent() {
	
		return content;
	}

	public void setContent(InputStream content) {
	
		this.content = content;
	}

	public Map<String, String> getAllHeaders() {
		return allHeaders;
	}

	public void setAllHeaders(Map<String, String> allHeaders) {
		this.allHeaders = allHeaders;
	}

	
	
}
