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
        dowJonesStockHM.put("MMM", "1");
        dowJonesStockHM.put("AXP", "59.50");
        dowJonesStockHM.put("AAPL", "108.66");
        dowJonesStockHM.put("BA", "127.88");
        dowJonesStockHM.put("CAT", "74.35");
        dowJonesStockHM.put("CVX", "96.33");
        dowJonesStockHM.put("CSCO", "27.69");
        dowJonesStockHM.put("KO", "46.87");
        dowJonesStockHM.put("DIS", "96.42");
        dowJonesStockHM.put("DD", "63.20");
        dowJonesStockHM.put("XOM", "83.21");
        dowJonesStockHM.put("GE", "30.79");
        if (dowJonesStockHM.containsKey(stockSymbol.toUpperCase())) {
            System.out.println("ans1 for " + stockSymbol + " is " + dowJonesStockHM.get(stockSymbol.toUpperCase()));
            answer = (String) dowJonesStockHM.get(stockSymbol.toUpperCase());
        }
        return answer;
    }
}
