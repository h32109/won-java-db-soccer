<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form id = "jsp3" action="${ctx}/player.do">
	팀아이디 : <input type="text" name = "teamId" />
	키 : <input type="text" name = "height" />
	이름 : <input type="text" name = "name" />
	<input type="hidden" name = "page" value = "5_find_by_teamid_height_name" />
	<input type="hidden" name = "action" value = "read" />
	<input type="submit" value = "전송" />
</form>
<c:forEach items="${players2}" var="dto">
 ${dto.teamId}팀의  ${dto.playerName} 의 키는 ${dto.height } <br />
</c:forEach>
