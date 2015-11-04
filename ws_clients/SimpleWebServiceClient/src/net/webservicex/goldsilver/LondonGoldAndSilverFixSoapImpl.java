
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package net.webservicex.goldsilver;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-11-04T12:57:59.870+01:00
 * Generated source version: 3.0.4
 * 
 */

@javax.jws.WebService(
                      serviceName = "LondonGoldAndSilverFix",
                      portName = "LondonGoldAndSilverFixSoap",
                      targetNamespace = "http://www.webservicex.net",
                      wsdlLocation = "file:/C:/prj/WebServicesPart1/git/ws_clients/SimpleWebServiceClient/GoldSilver.wsdl",
                      endpointInterface = "net.webservicex.goldsilver.LondonGoldAndSilverFixSoap")
                      
public class LondonGoldAndSilverFixSoapImpl implements LondonGoldAndSilverFixSoap {

    private static final Logger LOG = Logger.getLogger(LondonGoldAndSilverFixSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see net.webservicex.goldsilver.LondonGoldAndSilverFixSoap#getLondonGoldAndSilverFix(*
     */
    public net.webservicex.goldsilver.LondonMarketData getLondonGoldAndSilverFix() { 
        LOG.info("Executing operation getLondonGoldAndSilverFix");
        try {
            net.webservicex.goldsilver.LondonMarketData _return = new net.webservicex.goldsilver.LondonMarketData();
            _return.setGoldAMUSD(0.8167717f);
            _return.setGoldAMSTG(0.5078015f);
            _return.setGoldAMEUR(0.2665251f);
            _return.setGoldPMUSD(0.25840932f);
            _return.setGoldPMSTG(0.83503234f);
            _return.setGoldPMEUR(0.04972726f);
            _return.setSilverCENTS(0.76934505f);
            _return.setSilverPENCE(0.65725493f);
            _return.setSilverEUR(0.06115246f);
            _return.setStatus("Status-1990786327");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
