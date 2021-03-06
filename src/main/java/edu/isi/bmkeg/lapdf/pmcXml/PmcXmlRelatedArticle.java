//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.23 at 10:09:05 AM PDT 
//


package edu.isi.bmkeg.lapdf.pmcXml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}bold"/>
 *         &lt;element ref="{}italic"/>
 *         &lt;element ref="{}monospace"/>
 *         &lt;element ref="{}overline"/>
 *         &lt;element ref="{}roman"/>
 *         &lt;element ref="{}sans-serif"/>
 *         &lt;element ref="{}sc"/>
 *         &lt;element ref="{}strike"/>
 *         &lt;element ref="{}underline"/>
 *         &lt;element ref="{}journal-id"/>
 *         &lt;element ref="{}named-content"/>
 *         &lt;element ref="{}styled-content"/>
 *         &lt;element ref="{}annotation"/>
 *         &lt;element ref="{}article-title"/>
 *         &lt;element ref="{}chapter-title"/>
 *         &lt;element ref="{}collab"/>
 *         &lt;element ref="{}comment"/>
 *         &lt;element ref="{}conf-date"/>
 *         &lt;element ref="{}conf-loc"/>
 *         &lt;element ref="{}conf-name"/>
 *         &lt;element ref="{}conf-sponsor"/>
 *         &lt;element ref="{}date"/>
 *         &lt;element ref="{}date-in-citation"/>
 *         &lt;element ref="{}day"/>
 *         &lt;element ref="{}edition"/>
 *         &lt;element ref="{}email"/>
 *         &lt;element ref="{}elocation-id"/>
 *         &lt;element ref="{}etal"/>
 *         &lt;element ref="{}ext-link"/>
 *         &lt;element ref="{}fpage"/>
 *         &lt;element ref="{}gov"/>
 *         &lt;element ref="{}institution"/>
 *         &lt;element ref="{}isbn"/>
 *         &lt;element ref="{}issn"/>
 *         &lt;element ref="{}issue"/>
 *         &lt;element ref="{}issue-id"/>
 *         &lt;element ref="{}issue-part"/>
 *         &lt;element ref="{}issue-title"/>
 *         &lt;element ref="{}lpage"/>
 *         &lt;element ref="{}month"/>
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}object-id"/>
 *         &lt;element ref="{}page-range"/>
 *         &lt;element ref="{}part-title"/>
 *         &lt;element ref="{}patent"/>
 *         &lt;element ref="{}person-group"/>
 *         &lt;element ref="{}pub-id"/>
 *         &lt;element ref="{}publisher-loc"/>
 *         &lt;element ref="{}publisher-name"/>
 *         &lt;element ref="{}role"/>
 *         &lt;element ref="{}season"/>
 *         &lt;element ref="{}series"/>
 *         &lt;element ref="{}size"/>
 *         &lt;element ref="{}source"/>
 *         &lt;element ref="{}std"/>
 *         &lt;element ref="{}string-name"/>
 *         &lt;element ref="{}supplement"/>
 *         &lt;element ref="{}trans-source"/>
 *         &lt;element ref="{}trans-title"/>
 *         &lt;element ref="{}uri"/>
 *         &lt;element ref="{}volume"/>
 *         &lt;element ref="{}volume-id"/>
 *         &lt;element ref="{}volume-series"/>
 *         &lt;element ref="{}year"/>
 *         &lt;element ref="{}sub"/>
 *         &lt;element ref="{}sup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="related-article-type" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ext-link-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="vol" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="issue" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="elocation-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="journal-id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="journal-id-type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}type"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}href"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}role"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}title"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}show"/>
 *       &lt;attribute ref="{http://www.w3.org/1999/xlink}actuate"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "related-article")
public class PmcXmlRelatedArticle {

    @XmlElementRefs({
        @XmlElementRef(name = "article-title", type = PmcXmlArticleTitle.class, required = false),
        @XmlElementRef(name = "year", type = PmcXmlYear.class, required = false),
        @XmlElementRef(name = "volume-id", type = PmcXmlVolumeId.class, required = false),
        @XmlElementRef(name = "sub", type = PmcXmlSub.class, required = false),
        @XmlElementRef(name = "issn", type = PmcXmlIssn.class, required = false),
        @XmlElementRef(name = "ext-link", type = PmcXmlExtLink.class, required = false),
        @XmlElementRef(name = "issue-title", type = PmcXmlIssueTitle.class, required = false),
        @XmlElementRef(name = "comment", type = PmcXmlComment.class, required = false),
        @XmlElementRef(name = "string-name", type = PmcXmlStringName.class, required = false),
        @XmlElementRef(name = "trans-title", type = PmcXmlTransTitle.class, required = false),
        @XmlElementRef(name = "sans-serif", type = PmcXmlSansSerif.class, required = false),
        @XmlElementRef(name = "italic", type = PmcXmlItalic.class, required = false),
        @XmlElementRef(name = "chapter-title", type = PmcXmlChapterTitle.class, required = false),
        @XmlElementRef(name = "styled-content", type = PmcXmlStyledContent.class, required = false),
        @XmlElementRef(name = "date-in-citation", type = PmcXmlDateInCitation.class, required = false),
        @XmlElementRef(name = "role", type = PmcXmlRole.class, required = false),
        @XmlElementRef(name = "isbn", type = PmcXmlIsbn.class, required = false),
        @XmlElementRef(name = "conf-loc", type = PmcXmlConfLoc.class, required = false),
        @XmlElementRef(name = "volume", type = PmcXmlVolume.class, required = false),
        @XmlElementRef(name = "issue-id", type = PmcXmlIssueId.class, required = false),
        @XmlElementRef(name = "size", type = PmcXmlSize.class, required = false),
        @XmlElementRef(name = "page-range", type = PmcXmlPageRange.class, required = false),
        @XmlElementRef(name = "publisher-name", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", type = PmcXmlName.class, required = false),
        @XmlElementRef(name = "conf-date", type = PmcXmlConfDate.class, required = false),
        @XmlElementRef(name = "annotation", type = PmcXmlAnnotation.class, required = false),
        @XmlElementRef(name = "std", type = PmcXmlStd.class, required = false),
        @XmlElementRef(name = "named-content", type = PmcXmlNamedContent.class, required = false),
        @XmlElementRef(name = "institution", type = PmcXmlInstitution.class, required = false),
        @XmlElementRef(name = "season", type = PmcXmlSeason.class, required = false),
        @XmlElementRef(name = "person-group", type = PmcXmlPersonGroup.class, required = false),
        @XmlElementRef(name = "overline", type = PmcXmlOverline.class, required = false),
        @XmlElementRef(name = "uri", type = PmcXmlUri.class, required = false),
        @XmlElementRef(name = "day", type = PmcXmlDay.class, required = false),
        @XmlElementRef(name = "strike", type = PmcXmlStrike.class, required = false),
        @XmlElementRef(name = "etal", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "series", type = PmcXmlSeries.class, required = false),
        @XmlElementRef(name = "sup", type = PmcXmlSup.class, required = false),
        @XmlElementRef(name = "date", type = PmcXmlDate.class, required = false),
        @XmlElementRef(name = "sc", type = PmcXmlSc.class, required = false),
        @XmlElementRef(name = "monospace", type = PmcXmlMonospace.class, required = false),
        @XmlElementRef(name = "underline", type = PmcXmlUnderline.class, required = false),
        @XmlElementRef(name = "issue-part", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "email", type = PmcXmlEmail.class, required = false),
        @XmlElementRef(name = "roman", type = PmcXmlRoman.class, required = false),
        @XmlElementRef(name = "elocation-id", type = PmcXmlElocationId.class, required = false),
        @XmlElementRef(name = "conf-name", type = PmcXmlConfName.class, required = false),
        @XmlElementRef(name = "collab", type = PmcXmlCollab.class, required = false),
        @XmlElementRef(name = "lpage", type = PmcXmlLpage.class, required = false),
        @XmlElementRef(name = "patent", type = PmcXmlPatent.class, required = false),
        @XmlElementRef(name = "part-title", type = PmcXmlPartTitle.class, required = false),
        @XmlElementRef(name = "supplement", type = PmcXmlSupplement.class, required = false),
        @XmlElementRef(name = "trans-source", type = PmcXmlTransSource.class, required = false),
        @XmlElementRef(name = "journal-id", type = PmcXmlJournalId.class, required = false),
        @XmlElementRef(name = "pub-id", type = PmcXmlPubId.class, required = false),
        @XmlElementRef(name = "publisher-loc", type = PmcXmlPublisherLoc.class, required = false),
        @XmlElementRef(name = "volume-series", type = PmcXmlVolumeSeries.class, required = false),
        @XmlElementRef(name = "conf-sponsor", type = PmcXmlConfSponsor.class, required = false),
        @XmlElementRef(name = "edition", type = PmcXmlEdition.class, required = false),
        @XmlElementRef(name = "source", type = PmcXmlSource.class, required = false),
        @XmlElementRef(name = "fpage", type = PmcXmlFpage.class, required = false),
        @XmlElementRef(name = "bold", type = PmcXmlBold.class, required = false),
        @XmlElementRef(name = "month", type = PmcXmlMonth.class, required = false),
        @XmlElementRef(name = "gov", type = PmcXmlGov.class, required = false),
        @XmlElementRef(name = "object-id", type = PmcXmlObjectId.class, required = false),
        @XmlElementRef(name = "issue", type = PmcXmlIssue.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "related-article-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String relatedArticleType;
    @XmlAttribute(name = "ext-link-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String extLinkType;
    @XmlAttribute(name = "specific-use")
    @XmlSchemaType(name = "anySimpleType")
    protected String specificUse;
    @XmlAttribute(name = "vol")
    @XmlSchemaType(name = "anySimpleType")
    protected String vol;
    @XmlAttribute(name = "page")
    @XmlSchemaType(name = "anySimpleType")
    protected String page;
    @XmlAttribute(name = "issue")
    @XmlSchemaType(name = "anySimpleType")
    protected String issue;
    @XmlAttribute(name = "elocation-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String elocationId;
    @XmlAttribute(name = "journal-id")
    @XmlSchemaType(name = "anySimpleType")
    protected String journalId;
    @XmlAttribute(name = "journal-id-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String journalIdType;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PmcXmlArticleTitle }
     * {@link PmcXmlVolumeId }
     * {@link PmcXmlYear }
     * {@link PmcXmlIssn }
     * {@link PmcXmlSub }
     * {@link PmcXmlExtLink }
     * {@link PmcXmlIssueTitle }
     * {@link PmcXmlComment }
     * {@link PmcXmlStringName }
     * {@link PmcXmlTransTitle }
     * {@link PmcXmlSansSerif }
     * {@link PmcXmlItalic }
     * {@link PmcXmlChapterTitle }
     * {@link PmcXmlStyledContent }
     * {@link PmcXmlDateInCitation }
     * {@link PmcXmlIsbn }
     * {@link PmcXmlRole }
     * {@link PmcXmlConfLoc }
     * {@link PmcXmlVolume }
     * {@link PmcXmlIssueId }
     * {@link PmcXmlSize }
     * {@link PmcXmlPageRange }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link PmcXmlName }
     * {@link PmcXmlAnnotation }
     * {@link PmcXmlConfDate }
     * {@link PmcXmlStd }
     * {@link PmcXmlInstitution }
     * {@link PmcXmlNamedContent }
     * {@link PmcXmlSeason }
     * {@link PmcXmlPersonGroup }
     * {@link PmcXmlOverline }
     * {@link PmcXmlDay }
     * {@link PmcXmlUri }
     * {@link PmcXmlStrike }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link PmcXmlSeries }
     * {@link PmcXmlSup }
     * {@link PmcXmlDate }
     * {@link PmcXmlSc }
     * {@link PmcXmlMonospace }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link PmcXmlUnderline }
     * {@link PmcXmlEmail }
     * {@link PmcXmlRoman }
     * {@link PmcXmlElocationId }
     * {@link PmcXmlConfName }
     * {@link PmcXmlLpage }
     * {@link PmcXmlCollab }
     * {@link PmcXmlPatent }
     * {@link PmcXmlPartTitle }
     * {@link PmcXmlSupplement }
     * {@link String }
     * {@link PmcXmlPublisherLoc }
     * {@link PmcXmlPubId }
     * {@link PmcXmlJournalId }
     * {@link PmcXmlTransSource }
     * {@link PmcXmlVolumeSeries }
     * {@link PmcXmlConfSponsor }
     * {@link PmcXmlEdition }
     * {@link PmcXmlSource }
     * {@link PmcXmlFpage }
     * {@link PmcXmlMonth }
     * {@link PmcXmlBold }
     * {@link PmcXmlGov }
     * {@link PmcXmlObjectId }
     * {@link PmcXmlIssue }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Gets the value of the relatedArticleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedArticleType() {
        return relatedArticleType;
    }

    /**
     * Sets the value of the relatedArticleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedArticleType(String value) {
        this.relatedArticleType = value;
    }

    /**
     * Gets the value of the extLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtLinkType() {
        return extLinkType;
    }

    /**
     * Sets the value of the extLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtLinkType(String value) {
        this.extLinkType = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
    }

    /**
     * Gets the value of the vol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVol() {
        return vol;
    }

    /**
     * Sets the value of the vol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVol(String value) {
        this.vol = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the issue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssue() {
        return issue;
    }

    /**
     * Sets the value of the issue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssue(String value) {
        this.issue = value;
    }

    /**
     * Gets the value of the elocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElocationId() {
        return elocationId;
    }

    /**
     * Sets the value of the elocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElocationId(String value) {
        this.elocationId = value;
    }

    /**
     * Gets the value of the journalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalId() {
        return journalId;
    }

    /**
     * Sets the value of the journalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalId(String value) {
        this.journalId = value;
    }

    /**
     * Gets the value of the journalIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalIdType() {
        return journalIdType;
    }

    /**
     * Sets the value of the journalIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalIdType(String value) {
        this.journalIdType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
