<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"></jsp:include>
<input id = "jsp1"type="button" value = "2. 포지션 종류보기" /><br /><br />
<form id = "jsp2" action="${ctx}/player.do">
	팀아이디 : <input type="text" name = "teamId" />
	포지션 : <input type="text" name = "position"/>
	<input type="hidden" name = "page" value = "4_find_by_teamid_position" />
	<input type="hidden" name = "action" value = "read" />
	<input type="submit" value = "전송" />
</form><br />
<form id = "jsp3" action="${ctx}/player.do">
	팀아이디 : <input type="text" name = "teamId" />
	키 : <input type="text" name = "height" />
	이름 : <input type="text" name = "name" />
	<input type="hidden" name = "page" value = "5_find_by_teamid_height_name" />
	<input type="hidden" name = "action" value = "read" />
	<input type="submit" value = "전송" />
</form>
<script>
	$('#jsp1').click(function(){
		alert('포지션 종류 이동');
		location.assign('${ctx}/player.do?action=read&page=2_positions ');
	});
	
	$('#jsp2').submit(function(){
		alert('포지션 종류 이동');
	});
	$('#jsp3').submit(function(){
		alert('키,팀아이디,이름으로 선수찾기');
	});
</script>
<jsp:include page="../common/foot.jsp"></jsp:include>