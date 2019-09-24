package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeamBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String teamId,
						regionName,
						TeamName,
						eTeamName,
						origYyyy,
						stadiumId,
						zipCode1,
						zipCode2,
						adress,
						ddd,
						tel,
						fax,
						homepage,
						owner;
}
