/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package myutilities;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletUtilities {
    
private ServletUtilities() {} // Class not instantiable

public static String headWithTitle(String title) 
{ return("<!DOCTYPE html>\n" + 
        "<html>\n" + 
        "<head><title>" + title + "</title></head>\n");
}

/** Read a parameter whose name is provided as a parameter,
convert it to int, then return it
If the parameter does not exist or has an erroneous value (not convertible into int) the function returns the default value specified in argument.
**/

public static int getIntParameter(HttpServletRequest request,
String paramName,
int defaultValue) {
String paramString = request.getParameter(paramName);
int paramValue;
try{
paramValue = Integer.parseInt(paramString); 
}catch(Exception nfe) { // null or wrong format 
    paramValue = defaultValue;
}
return(paramValue); 
}

/** Same function as getintParameter but for a double. */ 
public static double getDoubleParameter(HttpServletRequest request, 
String paramName, 
double defaultValue) {
String paramString = request.getParameter(paramName);
double paramValue;
try {
paramValue = Double.parseDouble(paramString); 
}catch(Exception nfe) {// null or wrong format 
paramValue=defaultValue;
}
return(paramValue);
}
/**Tests if the string provided as an argument contains a special character that has a meaning in HTML, namely: <, >," and &
*@param input: string to test
*Type here to search
*@return true if input contains a special character, false otherwise.
*/

private static boolean hasSpecialChars(String input){
boolean flag = false; 
if ((input != null) && (input.length() > 0)) {
char c;
for(int i=0; i<input.length(); i++) {
c = input.charAt(i);
switch(c){
case '<': flag = true; break;
case '>': flag = true; break;
case '"': flag = true; break;
case '&': flag = true; break;
}
}
}
return(flag);
}

/**Replace characters that have an HTML meaning (<> " &) with their HTML code > is replaced by &lt;
* <by &gt;
by &quot;
* & by &amp;
• Without this filter, an arbitrary string cannot be inserted
* securely in a web page
*/
public static String filter(String input) { 
if (!hasSpecialChars(input)) { 
return(input);
}
StringBuilder filtered =new StringBuilder(input.length());
char c;
for(int i=0;i<input.length();i++) {
c= input.charAt(i);
switch(c){
case '<': filtered.append("&lt;"); break;
case '>': filtered.append("&gt;"); break;
case '"' :filtered.append("&quot;"); break;
case '&': filtered.append("&amp;"); break;
default: filtered.append(c);
}
}
return(filtered.toString());
}
}