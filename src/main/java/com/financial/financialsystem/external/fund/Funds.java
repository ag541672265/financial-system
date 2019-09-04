
package com.financial.financialsystem.external.fund;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>funds complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfid���Ե�ֵ��
     * 
     */
    public int getFid() {
        return fid;
    }

    /**
     * ����fid���Ե�ֵ��
     * 
     */
    public void setFid(int value) {
        this.fid = value;
    }

    /**
     * ��ȡfname���Ե�ֵ��
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
     * ����fname���Ե�ֵ��
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
     * ��ȡfoundDate���Ե�ֵ��
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
     * ����foundDate���Ե�ֵ��
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
     * ��ȡmaxlimit���Ե�ֵ��
     * 
     */
    public int getMaxlimit() {
        return maxlimit;
    }

    /**
     * ����maxlimit���Ե�ֵ��
     * 
     */
    public void setMaxlimit(int value) {
        this.maxlimit = value;
    }

    /**
     * ��ȡminlimit���Ե�ֵ��
     * 
     */
    public int getMinlimit() {
        return minlimit;
    }

    /**
     * ����minlimit���Ե�ֵ��
     * 
     */
    public void setMinlimit(int value) {
        this.minlimit = value;
    }

    /**
     * ��ȡrisk���Ե�ֵ��
     * 
     */
    public int getRisk() {
        return risk;
    }

    /**
     * ����risk���Ե�ֵ��
     * 
     */
    public void setRisk(int value) {
        this.risk = value;
    }

    /**
     * ��ȡstarts���Ե�ֵ��
     * 
     */
    public int getStarts() {
        return starts;
    }

    /**
     * ����starts���Ե�ֵ��
     * 
     */
    public void setStarts(int value) {
        this.starts = value;
    }

}
