/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQ;

import java.util.HashMap;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author vyass
 */
@WebService(serviceName = "StockQuote")
public class StockQuote {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    public String getDowJonesStock(@WebParam(name = "stockSymbol") String stockSymbol) {
        String answer = "Language not supported.";
        HashMap dowJonesStockHM = new HashMap();
        dowJonesStockHM.put("MMM", "171.95");
        dowJonesStockHM.put("AXP", "71.45");
        dowJonesStockHM.put("AAPL", "109.94");
        dowJonesStockHM.put("BA", "146.38");
        dowJonesStockHM.put("CAT", "93.25");
        dowJonesStockHM.put("CVX", "108.14");
        dowJonesStockHM.put("CSCO", "31.67");
        dowJonesStockHM.put("KO", "41.26");
        dowJonesStockHM.put("DIS", "98.53");
        dowJonesStockHM.put("DD", "68.8");
        dowJonesStockHM.put("XOM", "85.93");
        dowJonesStockHM.put("GE", "30.61");
        if (dowJonesStockHM.containsKey(stockSymbol.toUpperCase())) {
            System.out.println("ans1 for " + stockSymbol + " is " + dowJonesStockHM.get(stockSymbol.toUpperCase()));
            answer = (String) dowJonesStockHM.get(stockSymbol.toUpperCase());
        }
        return answer;
    }
}
