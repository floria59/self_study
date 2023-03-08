package com.demo.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 테이블명 : TBL_BOARD
/*
 CREATE TABLE TBL_BOARD (
    BNO     NUMBER(10,0),       			--일련번호
    TITLE   VARCHAR2(200)   NOT NULL,       -- 제목
    CONTENT VARCHAR2(2000)  NOT NULL,       -- 내용
    WRITER  VARCHAR2(50)    NOT NULL,       -- 작성자
    REGDATE DATE    DEFAULT SYSDATE,        -- 등록일자
    UPDATEDATE DATE DEFAULT SYSDATE        -- 수정일자
); 
 */


@Getter
@Setter
@ToString
public class BoardVO {
	
	private Long bno;  
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updatedate;
	

}
