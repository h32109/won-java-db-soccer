package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class PlayerBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String playerId,// ID
						playerName,
						teamId,
						ePlayerName, 
						nickName,
						joinYyyy,
						position,
						backNo,
						nation,
						birthDate,
						solar, // PW
						height,
						weight;

	

}
