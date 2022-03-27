package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class TodoEntity {
    private  Long id;
    //todo의 번호를 매길수있는 id 값

    private String title;
    //todo의 제목

    private Long order;
    //todo만든 날짜

    private Boolean completed;
    //todo를 완료했는지 안했는지.

}
//1. id - 테이블 컬럼의 기본키에 설정
//2. column - 테이블 컬럼에 설정, @Entity로 지정시 생략가능