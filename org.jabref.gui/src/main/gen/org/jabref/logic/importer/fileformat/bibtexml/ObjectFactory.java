//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.06 at 09:03:32 PM CET 
//


package org.jabref.logic.importer.fileformat.bibtexml;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.jabref.logic.importer.fileformat.bibtexml package. 
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

    private final static QName _InbookCrossref_QNAME = new QName("http://bibtexml.sf.net/", "crossref");
    private final static QName _InbookKey_QNAME = new QName("http://bibtexml.sf.net/", "key");
    private final static QName _InbookLccn_QNAME = new QName("http://bibtexml.sf.net/", "lccn");
    private final static QName _InbookNumber_QNAME = new QName("http://bibtexml.sf.net/", "number");
    private final static QName _InbookMrnumber_QNAME = new QName("http://bibtexml.sf.net/", "mrnumber");
    private final static QName _InbookPages_QNAME = new QName("http://bibtexml.sf.net/", "pages");
    private final static QName _InbookAffiliation_QNAME = new QName("http://bibtexml.sf.net/", "affiliation");
    private final static QName _InbookPrice_QNAME = new QName("http://bibtexml.sf.net/", "price");
    private final static QName _InbookEdition_QNAME = new QName("http://bibtexml.sf.net/", "edition");
    private final static QName _InbookAnnotate_QNAME = new QName("http://bibtexml.sf.net/", "annotate");
    private final static QName _InbookLanguage_QNAME = new QName("http://bibtexml.sf.net/", "language");
    private final static QName _InbookTitle_QNAME = new QName("http://bibtexml.sf.net/", "title");
    private final static QName _InbookType_QNAME = new QName("http://bibtexml.sf.net/", "type");
    private final static QName _InbookChapter_QNAME = new QName("http://bibtexml.sf.net/", "chapter");
    private final static QName _InbookNote_QNAME = new QName("http://bibtexml.sf.net/", "note");
    private final static QName _InbookCopyright_QNAME = new QName("http://bibtexml.sf.net/", "copyright");
    private final static QName _InbookKeywords_QNAME = new QName("http://bibtexml.sf.net/", "keywords");
    private final static QName _InbookYear_QNAME = new QName("http://bibtexml.sf.net/", "year");
    private final static QName _InbookIsbn_QNAME = new QName("http://bibtexml.sf.net/", "isbn");
    private final static QName _InbookPublisher_QNAME = new QName("http://bibtexml.sf.net/", "publisher");
    private final static QName _InbookLocation_QNAME = new QName("http://bibtexml.sf.net/", "location");
    private final static QName _InbookCategory_QNAME = new QName("http://bibtexml.sf.net/", "category");
    private final static QName _InbookDoi_QNAME = new QName("http://bibtexml.sf.net/", "doi");
    private final static QName _InbookVolume_QNAME = new QName("http://bibtexml.sf.net/", "volume");
    private final static QName _InbookMonth_QNAME = new QName("http://bibtexml.sf.net/", "month");
    private final static QName _InbookIssn_QNAME = new QName("http://bibtexml.sf.net/", "issn");
    private final static QName _InbookSize_QNAME = new QName("http://bibtexml.sf.net/", "size");
    private final static QName _InbookContents_QNAME = new QName("http://bibtexml.sf.net/", "contents");
    private final static QName _InbookSeries_QNAME = new QName("http://bibtexml.sf.net/", "series");
    private final static QName _InbookAbstract_QNAME = new QName("http://bibtexml.sf.net/", "abstract");
    private final static QName _InbookUrl_QNAME = new QName("http://bibtexml.sf.net/", "url");
    private final static QName _InbookEditor_QNAME = new QName("http://bibtexml.sf.net/", "editor");
    private final static QName _InbookAddress_QNAME = new QName("http://bibtexml.sf.net/", "address");
    private final static QName _InbookAuthor_QNAME = new QName("http://bibtexml.sf.net/", "author");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jabref.logic.importer.fileformat.bibtexml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Conference }
     * 
     */
    public Conference createConference() {
        return new Conference();
    }

    /**
     * Create an instance of {@link Techreport }
     * 
     */
    public Techreport createTechreport() {
        return new Techreport();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link Inbook }
     * 
     */
    public Inbook createInbook() {
        return new Inbook();
    }

    /**
     * Create an instance of {@link Booklet }
     * 
     */
    public Booklet createBooklet() {
        return new Booklet();
    }

    /**
     * Create an instance of {@link Manual }
     * 
     */
    public Manual createManual() {
        return new Manual();
    }

    /**
     * Create an instance of {@link Unpublished }
     * 
     */
    public Unpublished createUnpublished() {
        return new Unpublished();
    }

    /**
     * Create an instance of {@link Inproceedings }
     * 
     */
    public Inproceedings createInproceedings() {
        return new Inproceedings();
    }

    /**
     * Create an instance of {@link Phdthesis }
     * 
     */
    public Phdthesis createPhdthesis() {
        return new Phdthesis();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link Mastersthesis }
     * 
     */
    public Mastersthesis createMastersthesis() {
        return new Mastersthesis();
    }

    /**
     * Create an instance of {@link Incollection }
     * 
     */
    public Incollection createIncollection() {
        return new Incollection();
    }

    /**
     * Create an instance of {@link Proceedings }
     * 
     */
    public Proceedings createProceedings() {
        return new Proceedings();
    }

    /**
     * Create an instance of {@link Misc }
     * 
     */
    public Misc createMisc() {
        return new Misc();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "crossref", scope = Inbook.class)
    public JAXBElement<String> createInbookCrossref(String value) {
        return new JAXBElement<String>(_InbookCrossref_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "key", scope = Inbook.class)
    public JAXBElement<String> createInbookKey(String value) {
        return new JAXBElement<String>(_InbookKey_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "lccn", scope = Inbook.class)
    public JAXBElement<String> createInbookLccn(String value) {
        return new JAXBElement<String>(_InbookLccn_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "number", scope = Inbook.class)
    public JAXBElement<BigInteger> createInbookNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_InbookNumber_QNAME, BigInteger.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "mrnumber", scope = Inbook.class)
    public JAXBElement<String> createInbookMrnumber(String value) {
        return new JAXBElement<String>(_InbookMrnumber_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "pages", scope = Inbook.class)
    public JAXBElement<String> createInbookPages(String value) {
        return new JAXBElement<String>(_InbookPages_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "affiliation", scope = Inbook.class)
    public JAXBElement<String> createInbookAffiliation(String value) {
        return new JAXBElement<String>(_InbookAffiliation_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "price", scope = Inbook.class)
    public JAXBElement<String> createInbookPrice(String value) {
        return new JAXBElement<String>(_InbookPrice_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "edition", scope = Inbook.class)
    public JAXBElement<String> createInbookEdition(String value) {
        return new JAXBElement<String>(_InbookEdition_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "annotate", scope = Inbook.class)
    public JAXBElement<String> createInbookAnnotate(String value) {
        return new JAXBElement<String>(_InbookAnnotate_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "language", scope = Inbook.class)
    public JAXBElement<String> createInbookLanguage(String value) {
        return new JAXBElement<String>(_InbookLanguage_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "title", scope = Inbook.class)
    public JAXBElement<String> createInbookTitle(String value) {
        return new JAXBElement<String>(_InbookTitle_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "type", scope = Inbook.class)
    public JAXBElement<String> createInbookType(String value) {
        return new JAXBElement<String>(_InbookType_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "chapter", scope = Inbook.class)
    public JAXBElement<BigInteger> createInbookChapter(BigInteger value) {
        return new JAXBElement<BigInteger>(_InbookChapter_QNAME, BigInteger.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "note", scope = Inbook.class)
    public JAXBElement<String> createInbookNote(String value) {
        return new JAXBElement<String>(_InbookNote_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "copyright", scope = Inbook.class)
    public JAXBElement<String> createInbookCopyright(String value) {
        return new JAXBElement<String>(_InbookCopyright_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "keywords", scope = Inbook.class)
    public JAXBElement<String> createInbookKeywords(String value) {
        return new JAXBElement<String>(_InbookKeywords_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "year", scope = Inbook.class)
    public JAXBElement<XMLGregorianCalendar> createInbookYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InbookYear_QNAME, XMLGregorianCalendar.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "isbn", scope = Inbook.class)
    public JAXBElement<String> createInbookIsbn(String value) {
        return new JAXBElement<String>(_InbookIsbn_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "publisher", scope = Inbook.class)
    public JAXBElement<String> createInbookPublisher(String value) {
        return new JAXBElement<String>(_InbookPublisher_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "location", scope = Inbook.class)
    public JAXBElement<String> createInbookLocation(String value) {
        return new JAXBElement<String>(_InbookLocation_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "category", scope = Inbook.class)
    public JAXBElement<String> createInbookCategory(String value) {
        return new JAXBElement<String>(_InbookCategory_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "doi", scope = Inbook.class)
    public JAXBElement<String> createInbookDoi(String value) {
        return new JAXBElement<String>(_InbookDoi_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "volume", scope = Inbook.class)
    public JAXBElement<String> createInbookVolume(String value) {
        return new JAXBElement<String>(_InbookVolume_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "month", scope = Inbook.class)
    public JAXBElement<String> createInbookMonth(String value) {
        return new JAXBElement<String>(_InbookMonth_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "issn", scope = Inbook.class)
    public JAXBElement<String> createInbookIssn(String value) {
        return new JAXBElement<String>(_InbookIssn_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "size", scope = Inbook.class)
    public JAXBElement<String> createInbookSize(String value) {
        return new JAXBElement<String>(_InbookSize_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "contents", scope = Inbook.class)
    public JAXBElement<String> createInbookContents(String value) {
        return new JAXBElement<String>(_InbookContents_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "series", scope = Inbook.class)
    public JAXBElement<String> createInbookSeries(String value) {
        return new JAXBElement<String>(_InbookSeries_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "abstract", scope = Inbook.class)
    public JAXBElement<String> createInbookAbstract(String value) {
        return new JAXBElement<String>(_InbookAbstract_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "url", scope = Inbook.class)
    public JAXBElement<String> createInbookUrl(String value) {
        return new JAXBElement<String>(_InbookUrl_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "editor", scope = Inbook.class)
    public JAXBElement<String> createInbookEditor(String value) {
        return new JAXBElement<String>(_InbookEditor_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "address", scope = Inbook.class)
    public JAXBElement<String> createInbookAddress(String value) {
        return new JAXBElement<String>(_InbookAddress_QNAME, String.class, Inbook.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bibtexml.sf.net/", name = "author", scope = Inbook.class)
    public JAXBElement<String> createInbookAuthor(String value) {
        return new JAXBElement<String>(_InbookAuthor_QNAME, String.class, Inbook.class, value);
    }

}
