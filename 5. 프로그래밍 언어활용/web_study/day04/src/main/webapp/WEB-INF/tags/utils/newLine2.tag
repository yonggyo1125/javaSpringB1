<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ tag import="java.util.Map" %>
<%@ tag dynamic-attributes="attrs" %>
<%
Map<String, String> attrs = (Map<String, String>)jspContext.getAttribute("attrs");
String color = attrs.get("color");
int size = Integer.valueOf(attrs.get("size"));
%>
<div style="color: <%=color%>;">
<%
for (int i = 0; i < size; i++) {
    out.print("-");
}
%>
</div>