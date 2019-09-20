package com.yangendian.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {
		
	/**
	 * 
	 * @Title: gethz 
	 * @Description: 返回扩展名
	 * @param fileName
	 * @return
	 * @return: String
	 */
	public static String gethz(String fileName){
		
		String string = fileName.substring(fileName.lastIndexOf("."));
			return string;
		}
	
	
	/**
	 * 
	 * @Title: closeAll 
	 * @Description: 批量关闭流，参数能传入无限个
	 * @param closeables
	 * @return: void
	 */
	public static void closeAll(AutoCloseable ...closeables){
			if(closeables!=null) {
				
				for (AutoCloseable autoCloseable : closeables) {
					try {
						autoCloseable.close();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	
	
	
	
	
	@SuppressWarnings("resource")
	public static void readTextFile(InputStream src) throws IOException{
		
		
		
		FileOutputStream outputStream = new FileOutputStream(new File("111.txt"));
		
		byte[] by = new byte[1024];
		
		int n = 0;
		
		while((n=src.read(by))!=-1) {
			outputStream.write(by, 0, n);
		}
		
		closeAll(src,outputStream);
		
		
		}
	
	
	
	
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: 传入一个文本文件对象，默认为UTF-8编码，返回该文件内容
	 * @param txtFile
	 * @throws IOException
	 * @return: void
	 */
	@SuppressWarnings("resource")
	public static void readTextFile(File txtFile) throws IOException{
		
		FileInputStream inputStream = new FileInputStream(txtFile);
		readTextFile(inputStream);
		
	}
	
	/**
	 * 
	 * @Title: main 
	 * @Description: 传入文本文件对象，返回该文件内容
	 * @param args
	 * @throws IOException
	 * @return: void
	 */
	public static void main(String[] args) throws IOException {
		readTextFile(new File("asd.txt"));
	}
	
	
}
