<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div><img id = "soccer_intro"src="${img}/soccer_home.jpg" alt="" /></div>
<div>
	<form id = "login_form" >
		<table id = "login_tab" >
		<tr>
			<td>
				ID : <input id = "username"class="input_text" type="text" name="playerId" />
			</td>
			<td rowspan="2">
				<input type="hidden" name = "action" value = "login"  />
				<input type="hidden" name = "page" value  = "main" />
				<input id = "login_btn"type="button" value = "Log In" />
			</td>
		</tr>
		<tr>
			<td >
				PW : <input id = "userpw"class="input_text" type="text" name ="solar" />
			</td>
		</tr>
		</table>
	</form>
</div>
<div><h3 id = "join_a" ><a id="a_join" href="#">회원가입</a></h3></div>
<script>
	app.init('${ctx}');
</script>