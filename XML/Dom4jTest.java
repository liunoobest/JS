package xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;
import xml.bean.Books;

import java.util.List;

/**
 * @author Rover
 * @Description
 * @create 2020/11/1
 */
public class Dom4jTest {

    @Test
    public void Test() throws DocumentException {
        //创建一个SaxReader输入流，去读取xml配置文件，生成Document对象
        SAXReader saxReader = new SAXReader();


        Document read = saxReader.read("src/xml/books.xml");

        System.out.println(read);


    }

    /**
     * 读取books.xml文件的信息
     */
    @Test
    public void Test1() throws DocumentException {
        //读取books.xml文件
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("src/xml/books.xml");
        //通过Document对象获取根元素
        Element rootElement = read.getRootElement();
/*        System.out.println(rootElement);*/
        //通过根元素获取book标签对象
        /*element()方法和elements()方法都是通过标签名查找子元素*/
        List<Element> book = rootElement.elements("book");
        //遍历，让每个book标签信息被Books类装载
        for(Element books1:book){
            //asXML()把标签对象。转换为标签字符串
  /*          System.out.println(books1.asXML()*/

            //得到书名标签内容
            Element name = books1.element("name");
            String bookname = name.getText();
            //得到作者标签内容
            String author = books1.elementText("author");
            //得到价格标签内容
            String price = books1.elementText("price");
            double v = Double.parseDouble(price);


            //获取书号属性
            String sn = books1.attributeValue("sn");

            System.out.println(new Books(sn,bookname,author,v));
        }

    }
}
