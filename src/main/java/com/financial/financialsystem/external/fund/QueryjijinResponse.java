
package com.financial.financialsystem.external.fund;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryjijinResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="queryjijinResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://service.webservice_fund.fund.webservice.com/}funds" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryjijinResponse", propOrder = {
    "_return"
})
public class QueryjijinResponse {

    @XmlElement(name = "return")
    protected Funds _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Funds }
     *     
     */
    public Funds getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Funds }
     *     
     */
    public void setReturn(Funds value) {
        this._return = value;
    }

}
