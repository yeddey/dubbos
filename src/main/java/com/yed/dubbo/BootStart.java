package com.yed.dubbo;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {
	
		static Logger log = Logger.getLogger(BootStart.class);
	
		@SuppressWarnings("resource")
		public static void main(String[] args) throws IOException {
			
			log.trace("马上启动服务");
			
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
			
			log.trace("启动ok。。。。。。。。。");
			System.in.read();
			
			
		}
}
