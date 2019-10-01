<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../common/head.jsp"></jsp:include>
	<div></div>
	<div id = "join_term"><h3>회원가입</h3></div>
	<div></div>
	<div></div>
	<form id = "join_form" action="${ctx}/player.do}">
	<div id = "join_spac" >
		<div>playerId</div>
		<div class = "input_join"><input type="text" name = "playerId" /></div>
		<div>teamId</div>
		<div class = "input_join"><input type="text" name = "teamId" /></div>
		<div>ePlayerName</div>
		<div class = "input_join"><input type="text" name = "ePlayerName" /></div>
		<div>nickName</div>
		<div class = "input_join"><input type="text" name = "nickName" /></div>
		<div>joinYyyy</div>
		<div class = "input_join"><input type="text" name = "joinYyyy" /></div>
		<div>position</div>
		<div class = "input_join"><input type="text" name = "position" /></div>
		<div>backNo</div>
		<div class = "input_join"><input type="text" name = "backNo" /></div>
		<div>nation</div>
		<div class = "input_join"><input type="text" name = "nation" /></div>
		<div>birthDate</div>
		<div class = "input_join"><input type="text" name = "birthDate" /></div>
		<div>solar</div>
		<div class = "input_join"><input type="text" name = "solar" /></div>
		<div>height</div>
		<div class = "input_join"><input type="text" name = "height" /></div>
		<div>weight</div>
		<div class = "input_join"><input type="text" name = "weight" /></div>
	</div>
	</form>
	<div></div>
	<div></div>
	<div id = "submit_join">
	<div><h3><input type="submit" value = "가입하기"  /></h3></div>
	<div><h3><a id = "back" href="#">뒤로가기</a></h3></div>
	</div>
	<div></div>

<h3><a id = "back" href="#">뒤로가기</a></h3>
<script>
app.init('${ctx}');
</script>
<jsp:include page="../common/foot.jsp"></jsp:include>