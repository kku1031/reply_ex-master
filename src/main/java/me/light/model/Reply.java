package me.light.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class Reply {

	private Long bno;
	private Long rno;
	private String reply;
	private String replyer;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;
	
	
}
