
package com.financial.financialsystem.external.fund;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>funds complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="funds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foundDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maxlimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minlimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="risk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="starts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funds", propOrder = {
    "fid",
    "fname",
    "foundDate",
    "maxlimit",
    "minlimit",
    "risk",
    "starts"
})
public class Funds {

    protected int fid;
    protected String fname;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar foundDate;
    protected int maxlimit;
    protected int minlimit;
    protected int risk;
    protected int starts;

    /**
     * 获取fid属性的值。
     * 
     */
    public int getFid() {
        return fid;
    }

    /**
     * 设置fid属性的值。
     * 
     */
    public void setFid(int value) {
        this.fid = value;
    }

    /**
     * 获取fname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFname() {
        return fname;
    }

    /**
     * 设置fname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFname(String value) {
        this.fname = value;
    }

    /**
     * 获取foundDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFoundDate() {
        return foundDate;
    }

    /**
     * 设置foundDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFoundDate(XMLGregorianCalendar value) {
        this.foundDate = value;
    }

    /**
     * 获取maxlimit属性的值。
     * 
     */
    public int getMaxlimit() {
        return maxlimit;
    }

    /**
     * 设置maxlimit属性的值。
     * 
     */
    public void setMaxlimit(int value) {
        this.maxlimit = value;
    }

    /**
     * 获取minlimit属性的值。
     * 
     */
    public int getMinlimit() {
        return minlimit;
    }

    /**
     * 设置minlimit属性的值。
     * 
     */
    public void setMinlimit(int value) {
        this.minlimit = value;
    }

    /**
     * 获取risk属性的值。
     * 
     */
    public int getRisk() {
        return risk;
    }

    /**
     * 设置risk属性的值。
     * 
     */
    public void setRisk(int value) {
        this.risk = value;
    }

    /**
     * 获取starts属性的值。
     * 
     */
    public int getStarts() {
        return starts;
    }

    /**
     * 设置starts属性的值。
     * 
     */
    public void setStarts(int value) {
        this.starts = value;
    }

}
