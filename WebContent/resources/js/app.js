
var app = (()=>{
	return{
		init : (ctx)=>{
			playerService.login(ctx);
			$('#a_join').click(()=>{
				location.assign(ctx+'/player.do?action=move&page=join');
			});
			
			$('#back').click(()=>{
				location.assign(ctx+'/player.do?action=move&page=login');
			});
			
			$('#join_form').submit(()=>{
				alter('회원가입완료')
			});
		}
	};
})();
var player = (()=>{
	var _playerId, _playerName, _teamId, _ePlayerName, _nickname, _joinYyyy,
	_position, _backNo, _nation, _birthDate, _solar, _height, _weight 
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar};
	return {
		'setPlayerId' : setPlayerId,
		'setSolar' : setSolar,
		'getPlayerId' : getPlayerId,
		'getSolar' : getSolar
	};
})();

var playerService = (()=>{
	return {
		login : (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#username').val()===""||$('#userpw').val()===""){
					alert("필수값이 없습니다.");
				}else{
					alert($('#username').val()+$('#userpw').val());
					$('#login_form').attr('actoin', '/jee-soccer/player.do');
					$('#login_form').submit();
				}
			});
		}
	};
})();
























