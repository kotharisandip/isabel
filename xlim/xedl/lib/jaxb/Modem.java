//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.02.14 at 02:11:19 PM CET 
//


package xedl.lib.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}Modem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modem"
})
@XmlRootElement(name = "modem")
public class Modem {

    @XmlElement(name = "Modem", required = true)
    protected ModemElement modem;

    /**
     * Gets the value of the modem property.
     * 
     * @return
     *     possible object is
     *     {@link ModemElement }
     *     
     */
    public ModemElement getModem() {
        return modem;
    }

    /**
     * Sets the value of the modem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModemElement }
     *     
     */
    public void setModem(ModemElement value) {
        this.modem = value;
    }

}