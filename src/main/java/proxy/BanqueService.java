
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDH")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDH", targetNamespace = "http://ws/", className = "proxy.ConversionEuroToDH")
    @ResponseWrapper(localName = "ConversionEuroToDHResponse", targetNamespace = "http://ws/", className = "proxy.ConversionEuroToDHResponse")
    @Action(input = "http://ws/BanqueService/ConversionEuroToDHRequest", output = "http://ws/BanqueService/ConversionEuroToDHResponse")
    public double conversionEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws/BanqueService/getCompteRequest", output = "http://ws/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://ws/", className = "proxy.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://ws/", className = "proxy.GetComptesResponse")
    @Action(input = "http://ws/BanqueService/getComptesRequest", output = "http://ws/BanqueService/getComptesResponse")
    public List<Compte> getComptes();

}
