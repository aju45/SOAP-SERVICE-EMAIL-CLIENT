<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEmailServiceImplProxyid" scope="session" class="com.aju.soapserviceemail.service.EmailServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEmailServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleEmailServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleEmailServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.aju.soapserviceemail.service.EmailServiceImpl getEmailServiceImpl10mtemp = sampleEmailServiceImplProxyid.getEmailServiceImpl();
if(getEmailServiceImpl10mtemp == null){
%>
<%=getEmailServiceImpl10mtemp %>
<%
}else{
        if(getEmailServiceImpl10mtemp!= null){
        String tempreturnp11 = getEmailServiceImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String subjectOfMail_2id=  request.getParameter("subjectOfMail20");
            java.lang.String subjectOfMail_2idTemp = null;
        if(!subjectOfMail_2id.equals("")){
         subjectOfMail_2idTemp  = subjectOfMail_2id;
        }
        String bodyOfMail_3id=  request.getParameter("bodyOfMail22");
            java.lang.String bodyOfMail_3idTemp = null;
        if(!bodyOfMail_3id.equals("")){
         bodyOfMail_3idTemp  = bodyOfMail_3id;
        }
        String fromAddress_4id=  request.getParameter("fromAddress24");
            java.lang.String fromAddress_4idTemp = null;
        if(!fromAddress_4id.equals("")){
         fromAddress_4idTemp  = fromAddress_4id;
        }
        String toAddress_5id=  request.getParameter("toAddress26");
            java.lang.String toAddress_5idTemp = null;
        if(!toAddress_5id.equals("")){
         toAddress_5idTemp  = toAddress_5id;
        }
        %>
        <jsp:useBean id="com1aju1soapserviceemail1bean1EmailData_1id" scope="session" class="com.aju.soapserviceemail.bean.EmailData" />
        <%
        com1aju1soapserviceemail1bean1EmailData_1id.setSubjectOfMail(subjectOfMail_2idTemp);
        com1aju1soapserviceemail1bean1EmailData_1id.setBodyOfMail(bodyOfMail_3idTemp);
        com1aju1soapserviceemail1bean1EmailData_1id.setFromAddress(fromAddress_4idTemp);
        com1aju1soapserviceemail1bean1EmailData_1id.setToAddress(toAddress_5idTemp);
        com.aju.soapserviceemail.bean.EmailStatus getEmailOperation13mtemp = sampleEmailServiceImplProxyid.getEmailOperation(com1aju1soapserviceemail1bean1EmailData_1id);
if(getEmailOperation13mtemp == null){
%>
<%=getEmailOperation13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TD>
<%
if(getEmailOperation13mtemp != null){
java.lang.String typestatus16 = getEmailOperation13mtemp.getStatus();
        String tempResultstatus16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typestatus16));
        %>
        <%= tempResultstatus16 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>