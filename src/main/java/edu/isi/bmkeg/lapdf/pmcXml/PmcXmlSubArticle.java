//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{}front"/>
 *           &lt;element ref="{}front-stub"/>
 *         &lt;/choice>
 *         &lt;element ref="{}body" minOccurs="0"/>
 *         &lt;element ref="{}back" minOccurs="0"/>
 *         &lt;element ref="{}floats-group" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}sub-article" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{}response" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="article-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang default="en""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "frontStub",
    "front",
    "body",
    "back",
    "floatsGroup",
    "responses",
    "subArticles"
})
@XmlRootElement(name = "sub-article")
public class PmcXmlSubArticle {

    @XmlElement(name = "front-stub")
    protected PmcXmlFrontStub frontStub;
    protected PmcXmlFront front;
    protected PmcXmlBody body;
    protected PmcXmlBack back;
    @XmlElement(name = "floats-group")
    protected PmcXmlFloatsGroup floatsGroup;
    @XmlElement(name = "response")
    protected List<PmcXmlResponse> responses;
    @XmlElement(name = "sub-article")
    protected List<PmcXmlSubArticle> subArticles;
    @XmlAttribute(name = "article-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String articleType;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;

    /**
     * Gets the value of the frontStub property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlFrontStub }
     *     
     */
    public PmcXmlFrontStub getFrontStub() {
        return frontStub;
    }

    /**
     * Sets the value of the frontStub property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlFrontStub }
     *     
     */
    public void setFrontStub(PmcXmlFrontStub value) {
        this.frontStub = value;
    }

    /**
     * Gets the value of the front property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlFront }
     *     
     */
    public PmcXmlFront getFront() {
        return front;
    }

    /**
     * Sets the value of the front property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlFront }
     *     
     */
    public void setFront(PmcXmlFront value) {
        this.front = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlBody }
     *     
     */
    public PmcXmlBody getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlBody }
     *     
     */
    public void setBody(PmcXmlBody value) {
        this.body = value;
    }

    /**
     * Gets the value of the back property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlBack }
     *     
     */
    public PmcXmlBack getBack() {
        return back;
    }

    /**
     * Sets the value of the back property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlBack }
     *     
     */
    public void setBack(PmcXmlBack value) {
        this.back = value;
    }

    /**
     * Gets the value of the floatsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PmcXmlFloatsGroup }
     *     
     */
    public PmcXmlFloatsGroup getFloatsGroup() {
        return floatsGroup;
    }

    /**
     * Sets the value of the floatsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmcXmlFloatsGroup }
     *     
     */
    public void setFloatsGroup(PmcXmlFloatsGroup value) {
        this.floatsGroup = value;
    }

    /**
     * Gets the value of the responses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlResponse }
     * 
     * 
     */
    public List<PmcXmlResponse> getResponses() {
        if (responses == null) {
            responses = new ArrayList<PmcXmlResponse>();
        }
        return this.responses;
    }

    /**
     * Gets the value of the subArticles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subArticles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubArticles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlSubArticle }
     * 
     * 
     */
    public List<PmcXmlSubArticle> getSubArticles() {
        if (subArticles == null) {
            subArticles = new ArrayList<PmcXmlSubArticle>();
        }
        return this.subArticles;
    }

    /**
     * Gets the value of the articleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleType() {
        return articleType;
    }

    /**
     * Sets the value of the articleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleType(String value) {
        this.articleType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        if (lang == null) {
            return "en";
        } else {
            return lang;
        }
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}