<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form id = "jsp2" action="${ctx}/player.do">
	팀아이디 : <input type="text" name = "teamId" />
	포지션 : <input type="text" name = "position"/>
	<input type="hidden" name = "page" value = "4_find_by_teamid_position" />
	<input type="hidden" name = "action" value = "read" />
	<input type="submit" value = "전송" />
</form><br />
해당 ID : ${player.teamId} 포지션 : ${player.position} <br />
일치하는 선수는 ${players}입니다.
