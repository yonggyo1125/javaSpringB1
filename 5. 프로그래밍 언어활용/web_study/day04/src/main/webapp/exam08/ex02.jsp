<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<fmt:formatNumber value="10000" /><br>
<fmt:formatNumber value="10000" groupingUsed="false" /><br>
<fmt:formatNumber value="100000.123" pattern="0,000.00000" /><br>
<fmt:formatNumber value="100000.123" pattern="#,###.#####" /><br>