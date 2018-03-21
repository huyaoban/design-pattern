package com.huyaoban.pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	/**
	 * 从XML配置文件中提取工厂
	 * 
	 * @return
	 */
	public static Object getLoggerFactory() {
		try {
			// 创建文档对象
			DocumentBuilderFactory facotry = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = facotry.newDocumentBuilder();
			Document doc;

			doc = builder.parse(XMLUtil.class.getResourceAsStream("/config.xml"));

			NodeList nl = doc.getElementsByTagName("factoryType");
			Node classNode = nl.item(0).getFirstChild();
			String factoryType = classNode.getNodeValue().trim();
			Class clazz = Class.forName(factoryType);
			return clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
