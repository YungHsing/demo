package com.example.demo.cfgbean;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.*;

/**
 * mybatis 客製化 select for update 套件
 * @author pohsien
 *
 */
public class SelectForUpdatePlugin extends PluginAdapter {
	 private Map<FullyQualifiedTable, List<XmlElement>> elementsToAdd =
	            new HashMap<FullyQualifiedTable, List<XmlElement>>();

	    @Override
	    public boolean validate(List<String> warnings) {
	        return true;
	    }

	    /**
	     * 扩展接口中的  selectByExampleWithBLOBs 方法
	     */
	    @Override
	    public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method,
                                                                     Interface interfaze, IntrospectedTable introspectedTable) {
	        if (introspectedTable.getTargetRuntime() == IntrospectedTable.TargetRuntime.MYBATIS3) {
	            copyAndAddMethod(method, interfaze);
	        }
	        return true;
	    }

	    /**
	     * 扩展接口中的  selectByExample 方法
	     */
	    @Override
	    public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(
                Method method, Interface interfaze, IntrospectedTable introspectedTable) {
	        if (introspectedTable.getTargetRuntime() == IntrospectedTable.TargetRuntime.MYBATIS3) {
	            copyAndAddMethod(method, interfaze);
	        }
	        return true;
	    }

	    /**
	     * 扩展接口中的  selectByPrimaryKey 方法
	     */
	    @Override
	    public boolean clientSelectByPrimaryKeyMethodGenerated(
                Method method, Interface interfaze, IntrospectedTable introspectedTable) {
	        if (introspectedTable.getTargetRuntime() == IntrospectedTable.TargetRuntime.MYBATIS3) {
	            copyAndAddMethod(method, interfaze);
	        }
	        return true;
	    }

	    /**
	     * 扩展 xml 中的  selectByExampleWithBLOBs 方法
	     */
	    @Override
	    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(
                XmlElement element, IntrospectedTable introspectedTable) {
	        if (introspectedTable.getTargetRuntime() == IntrospectedTable.TargetRuntime.MYBATIS3) {
	            copyAndSaveElement(element, introspectedTable.getFullyQualifiedTable());
	        }
	        return true;
	    }

	    /**
	     * 扩展 xml 中的  selectByExample 方法
	     */
	    @Override
	    public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(
                XmlElement element, IntrospectedTable introspectedTable) {
	        if (introspectedTable.getTargetRuntime() == IntrospectedTable.TargetRuntime.MYBATIS3) {
	            copyAndSaveElement(element, introspectedTable.getFullyQualifiedTable());
	        }
	        return true;
	    }

	    /**
	     * 扩展 xml 中的  selectByExample 方法
	     */
	    @Override
	    public boolean sqlMapSelectByPrimaryKeyElementGenerated(
                XmlElement element, IntrospectedTable introspectedTable) {
	        if (introspectedTable.getTargetRuntime() == IntrospectedTable.TargetRuntime.MYBATIS3) {
	            copyAndSaveElement(element, introspectedTable.getFullyQualifiedTable());
	        }
	        return true;
	    }


	    /**
	     * 将 XML 追加的内容放入 XML 根节点中
	     * 本方法会在 sqlMapSelectByPrimaryKeyElementGenerated 等方法之后运行
	     */
	    @Override
	    public boolean sqlMapDocumentGenerated(Document document,
                                               IntrospectedTable introspectedTable) {
	        List<XmlElement> elements = elementsToAdd.get(introspectedTable.getFullyQualifiedTable());
	        if (elements != null) {
	            for (XmlElement element : elements) {
	                document.getRootElement().addElement(element);
	            }
	        }
	        return true;
	    }

	    private void copyAndAddMethod(Method method, Interface interfaze) {
	        Method newMethod = new Method(method);
	        newMethod.setName(method.getName() + "ForUpdate");
	        interfaze.addMethod(newMethod);
	    }

	    /**
	     * @param element
	     * @param fqt
	     */
	    private void copyAndSaveElement(XmlElement element, FullyQualifiedTable fqt) {
	        XmlElement newElement = new XmlElement(element);

	        // 修改 id
	        for (Iterator<Attribute> iterator = newElement.getAttributes().iterator(); iterator.hasNext();) {
	            Attribute attribute = iterator.next();
	            if ("id".equals(attribute.getName())) {
	                iterator.remove();
	                Attribute newAttribute = new Attribute("id", attribute.getValue() + "ForUpdate");
	                newElement.addAttribute(newAttribute);
	                break;
	            }
	        }

	        // 追加 for update
	        TextElement textElement = new TextElement("for update");
	        newElement.addElement(textElement);

	        List<XmlElement> elements = elementsToAdd.get(fqt);
	        if (elements == null) {
	            elements = new ArrayList<XmlElement>();
	            elementsToAdd.put(fqt, elements);
	        }
	        elements.add(newElement);
	    }
	  
}
