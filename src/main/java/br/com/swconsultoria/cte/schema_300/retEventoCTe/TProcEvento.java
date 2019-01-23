
package br.com.swconsultoria.cte.schema_300.retEventoCTe;

import javax.xml.bind.annotation.*;


/**
 * Tipo procEvento
 *
 * <p>Classe Java de TProcEvento complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TProcEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventoCTe" type="{http://www.portalfiscal.inf.br/cte}TEvento"/>
 *         &lt;element name="retEventoCTe" type="{http://www.portalfiscal.inf.br/cte}TRetEvento"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerEvento" />
 *       &lt;attribute name="ipTransmissor" type="{http://www.portalfiscal.inf.br/cte}TIPv4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProcEvento", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
        "eventoCTe",
        "retEventoCTe"
})
public class TProcEvento {

    @XmlElement(required = true)
    protected TEvento eventoCTe;
    @XmlElement(required = true)
    protected TRetEvento retEventoCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "ipTransmissor")
    protected String ipTransmissor;

    /**
     * Obtém o valor da propriedade eventoCTe.
     *
     * @return possible object is
     * {@link TEvento }
     */
    public TEvento getEventoCTe() {
        return eventoCTe;
    }

    /**
     * Define o valor da propriedade eventoCTe.
     *
     * @param value allowed object is
     *              {@link TEvento }
     */
    public void setEventoCTe(TEvento value) {
        this.eventoCTe = value;
    }

    /**
     * Obtém o valor da propriedade retEventoCTe.
     *
     * @return possible object is
     * {@link TRetEvento }
     */
    public TRetEvento getRetEventoCTe() {
        return retEventoCTe;
    }

    /**
     * Define o valor da propriedade retEventoCTe.
     *
     * @param value allowed object is
     *              {@link TRetEvento }
     */
    public void setRetEventoCTe(TRetEvento value) {
        this.retEventoCTe = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Obtém o valor da propriedade ipTransmissor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIpTransmissor() {
        return ipTransmissor;
    }

    /**
     * Define o valor da propriedade ipTransmissor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIpTransmissor(String value) {
        this.ipTransmissor = value;
    }

}
