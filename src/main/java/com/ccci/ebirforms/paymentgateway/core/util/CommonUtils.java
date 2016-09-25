/**************************************************
@(#) PROGRAM NAME : CommonUtils.java
CHANGE HISTORY:
DATE:           CHANGED BY:          CHANGES:
11/11/2011       Philcox (AAB)        fix for HD2011-1090293
11/11/2011       Philcox (AAB)        fix for HD2011-1092243
 **************************************************/

package com.ccci.ebirforms.paymentgateway.core.util;

//import com.bir.gov.ph.efps.controller.facade.TaxAgentFacade;
//import com.bir.gov.ph.efps.ref.reference.AuditTrail;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
//import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author Soluziona
 */
public class CommonUtils {

//    @EJB
//    private TaxAgentFacade taxAgentFacade;
    private static final String NO_RESOURCE_FOUND = "Missing resource: ";

    public static boolean isBlankOrNull(String parameter){
        if(parameter == null || parameter.equals("")){
            return true;
        }
        else
            return false;
    }

    // Philcox: fix for HD2011-1090293 11/11/11
    public static double roundUp(double amount){

        double convertedAmount = 0L;
        int decimalPlaces = 2;

        BigDecimal bd = new BigDecimal(amount);
        //Philcox: Fix for HD2011-1092243 11/17/2011
        bd = bd.setScale(decimalPlaces,BigDecimal.ROUND_HALF_UP);
        convertedAmount = bd.doubleValue();

        return convertedAmount;
    }
    
    public static BigInteger convertToWholeNumber(double amount){

        BigInteger convertedAmount = null;
        
        BigDecimal bd = new BigDecimal(amount);
        //Philcox: Fix for HD2011-1092243 11/17/2011
        bd = bd.setScale(0,BigDecimal.ROUND_HALF_UP);
        convertedAmount = bd.toBigInteger();

        return convertedAmount;
    }



    public static void logAuditTrail(int procNum, int msgCode, String argument){



    }

    public static String constructMessage(String message, Object param){
        message = getStringFromBundle(message);
//        StringBuffer msg = new StringBuffer(message);
//        StringBuffer indicator = new StringBuffer("{0}");
//        int count =0;
        try{
            message = MessageFormat.format(message, new Object[]{param});
        }catch(Exception e){
            return message;
        }
        return message;
    }

    public static String constructMessage(String message, Object[] params){
        message = getStringFromBundle(message);
        try{
            message = MessageFormat.format(message, params);
        }catch(Exception e){
            return message;
        }
        return message;
    }

    public static String constructMessage(String message){
        message = getStringFromBundle(message);

        return message;
    }

        /**
     * Pulls a String resource from the property bundle that
     * is defined under the application &lt;summary-bundle&gt; element in
     * the faces config. Respects Locale
     * @param key string summary key
     * @return Resource value or placeholder error String
     */
    public static String getStringFromBundle(String key) {
      ResourceBundle bundle = getBundle();
      return getStringSafely(bundle, key, key);
    }

    private static ResourceBundle getBundle() {
      FacesContext ctx = getFacesContext();
      ClassLoader ldr = Thread.currentThread().getContextClassLoader();
      Locale locale = ctx.getViewRoot().getLocale();
      return ResourceBundle.getBundle(ctx.getApplication().getMessageBundle(),locale,ldr);
    }

     public static FacesContext getFacesContext() {
       return FacesContext.getCurrentInstance();
     }

    private static String getStringSafely(ResourceBundle bundle, String key,
                                          String defaultValue) {
      String resource = null;
      try {
        resource = key != null ? bundle.getString(key.trim()) : "";
      } catch (Exception e) {
        if (defaultValue != null) {
          resource = defaultValue;
        } else {
          resource = NO_RESOURCE_FOUND + key;
        }
      }
      return resource;
    }

     

    //TODO: Think of better way to implement CallAudit()
    /*
    public void CallAudit(int procNum, int msgCode, String argument) {
        AuditTrail auditTrace = new AuditTrail();
        String sUsername = Constants.EMPTYSTRING;
        try {
//            //ARR 04272009
//            if (getEnrolledTaxPayer() == null) {
//                sUsername = "TRANS";
//            } else {
//                sUsername = getEnrolledTaxPayer().getUserInfoPK().getUsername();
//            }
            auditTrace.setUsername(sUsername);

            Calendar cal = Calendar.getInstance();
            auditTrace.setLogDate(cal.getTime());
            auditTrace.setProcessNum(procNum);
            auditTrace.setMessageCode(msgCode);
            auditTrace.setArgument(argument.length() > 500 ? argument.substring(0, 500) : argument);
            getTaxAgentFacade().fileAudit(auditTrace);

        } catch (Exception e) {
            System.out.println("Exception on Form2550mClientMB.CallAudit ==> " + e.getMessage());
        }
    }
     */

    /**
     * @return the taxAgentFacade
     */
//    public TaxAgentFacade getTaxAgentFacade() {
//        return taxAgentFacade;
//    }

    /**
     * @param taxAgentFacade the taxAgentFacade to set
     */
//    public void setTaxAgentFacade(TaxAgentFacade taxAgentFacade) {
//        this.taxAgentFacade = taxAgentFacade;
//    }

     public static Double getDouble(BigDecimal bd){
         Double val = new Double(0);
         if(null != bd){
             val = bd.doubleValue();
         }
         return val;
     }




     private static Integer daysInThreeMos(int returnPeriodMonth, int returnPeriodYear) {

        boolean leapYear;
        int daysInMos=0;

        returnPeriodYear = returnPeriodMonth==12||returnPeriodMonth==13?returnPeriodYear+1:returnPeriodYear;

        if (((returnPeriodYear % 4 == 0) && (returnPeriodYear % 100 != 0)) || (returnPeriodYear % 400 == 0)) {

            leapYear = true;

        } else {

            leapYear = false;

        }
        switch (returnPeriodMonth) {

            case 2:

                daysInMos = (leapYear) ? 90 : 89;

                break;

            case 3:

                daysInMos = 92;

                break;

            case 4:

                daysInMos = 91;

                break;

            case 5:

                daysInMos = 92;

                break;

            case 6:

                daysInMos = 92;

                break;

            case 7:

                daysInMos = 92;

                break;

            case 8:

                daysInMos = 92;

                break;

            case 9:

                daysInMos = 91;

                break;

            case 10:

                daysInMos = 92;

                break;

            case 11:

                daysInMos = 92;

                break;

            case 12:

                daysInMos = (leapYear) ? 91 : 90;

                break;

            case 13:

                daysInMos = (leapYear) ? 91 : 90;

                break;

        }

        return daysInMos;
    }

    
     public static String dateToString(Date date, String format){
         String dateString = "";
         DateFormat df = new SimpleDateFormat(format);
         dateString = df.format(date);
         return dateString;
     }


}
