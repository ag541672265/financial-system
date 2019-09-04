
package com.financial.financialsystem.external.fund;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.financial.financialsystem.external.fund package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SelljijinResponse_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "selljijinResponse");
    private final static QName _QueryalljijinResponse_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "queryalljijinResponse");
    private final static QName _Queryjijin_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "queryjijin");
    private final static QName _Querymejijin_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "querymejijin");
    private final static QName _QuerymejijinResponse_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "querymejijinResponse");
    private final static QName _QueryjijinResponse_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "queryjijinResponse");
    private final static QName _BuyjijinResponse_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "buyjijinResponse");
    private final static QName _Selljijin_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "selljijin");
    private final static QName _Buyjijin_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "buyjijin");
    private final static QName _Queryalljijin_QNAME = new QName("http://service.webservice_fund.fund.webservice.com/", "queryalljijin");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.financial.financialsystem.external.fund
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuyjijinResponse }
     * 
     */
    public BuyjijinResponse createBuyjijinResponse() {
        return new BuyjijinResponse();
    }

    /**
     * Create an instance of {@link Queryalljijin }
     * 
     */
    public Queryalljijin createQueryalljijin() {
        return new Queryalljijin();
    }

    /**
     * Create an instance of {@link Selljijin }
     * 
     */
    public Selljijin createSelljijin() {
        return new Selljijin();
    }

    /**
     * Create an instance of {@link Buyjijin }
     * 
     */
    public Buyjijin createBuyjijin() {
        return new Buyjijin();
    }

    /**
     * Create an instance of {@link Queryjijin }
     * 
     */
    public Queryjijin createQueryjijin() {
        return new Queryjijin();
    }

    /**
     * Create an instance of {@link Querymejijin }
     * 
     */
    public Querymejijin createQuerymejijin() {
        return new Querymejijin();
    }

    /**
     * Create an instance of {@link QuerymejijinResponse }
     * 
     */
    public QuerymejijinResponse createQuerymejijinResponse() {
        return new QuerymejijinResponse();
    }

    /**
     * Create an instance of {@link SelljijinResponse }
     * 
     */
    public SelljijinResponse createSelljijinResponse() {
        return new SelljijinResponse();
    }

    /**
     * Create an instance of {@link QueryalljijinResponse }
     * 
     */
    public QueryalljijinResponse createQueryalljijinResponse() {
        return new QueryalljijinResponse();
    }

    /**
     * Create an instance of {@link QueryjijinResponse }
     * 
     */
    public QueryjijinResponse createQueryjijinResponse() {
        return new QueryjijinResponse();
    }

    /**
     * Create an instance of {@link Userfund }
     * 
     */
    public Userfund createUserfund() {
        return new Userfund();
    }

    /**
     * Create an instance of {@link Funds }
     * 
     */
    public Funds createFunds() {
        return new Funds();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelljijinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "selljijinResponse")
    public JAXBElement<SelljijinResponse> createSelljijinResponse(SelljijinResponse value) {
        return new JAXBElement<SelljijinResponse>(_SelljijinResponse_QNAME, SelljijinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryalljijinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "queryalljijinResponse")
    public JAXBElement<QueryalljijinResponse> createQueryalljijinResponse(QueryalljijinResponse value) {
        return new JAXBElement<QueryalljijinResponse>(_QueryalljijinResponse_QNAME, QueryalljijinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Queryjijin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "queryjijin")
    public JAXBElement<Queryjijin> createQueryjijin(Queryjijin value) {
        return new JAXBElement<Queryjijin>(_Queryjijin_QNAME, Queryjijin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Querymejijin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "querymejijin")
    public JAXBElement<Querymejijin> createQuerymejijin(Querymejijin value) {
        return new JAXBElement<Querymejijin>(_Querymejijin_QNAME, Querymejijin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuerymejijinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "querymejijinResponse")
    public JAXBElement<QuerymejijinResponse> createQuerymejijinResponse(QuerymejijinResponse value) {
        return new JAXBElement<QuerymejijinResponse>(_QuerymejijinResponse_QNAME, QuerymejijinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryjijinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "queryjijinResponse")
    public JAXBElement<QueryjijinResponse> createQueryjijinResponse(QueryjijinResponse value) {
        return new JAXBElement<QueryjijinResponse>(_QueryjijinResponse_QNAME, QueryjijinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyjijinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "buyjijinResponse")
    public JAXBElement<BuyjijinResponse> createBuyjijinResponse(BuyjijinResponse value) {
        return new JAXBElement<BuyjijinResponse>(_BuyjijinResponse_QNAME, BuyjijinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Selljijin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "selljijin")
    public JAXBElement<Selljijin> createSelljijin(Selljijin value) {
        return new JAXBElement<Selljijin>(_Selljijin_QNAME, Selljijin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buyjijin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "buyjijin")
    public JAXBElement<Buyjijin> createBuyjijin(Buyjijin value) {
        return new JAXBElement<Buyjijin>(_Buyjijin_QNAME, Buyjijin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Queryalljijin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice_fund.fund.webservice.com/", name = "queryalljijin")
    public JAXBElement<Queryalljijin> createQueryalljijin(Queryalljijin value) {
        return new JAXBElement<Queryalljijin>(_Queryalljijin_QNAME, Queryalljijin.class, null, value);
    }

}
