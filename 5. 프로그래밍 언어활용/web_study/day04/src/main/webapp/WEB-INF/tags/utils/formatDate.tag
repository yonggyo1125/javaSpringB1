<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ tag import="java.time.*, java.time.format.*" %>
<%@ attribute name="value" type="java.time.temporal.TemporalAccessor" required="true" %>
<%@ attribute name="pattern" %>
<%
    pattern = pattern == null || pattern.isBlank() ? "yyyy.MM.dd HH:mm:ss" : pattern;
    DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
    String str = format.format(value);
%>
<%=str%>