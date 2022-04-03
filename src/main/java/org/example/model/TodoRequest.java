package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class TodoRequest{

    private String title;
    //타이틀을 리퀘스트로 받는다.
    private  Long order;
    //order 값도 임의로 저장해줄수있기때문에 받아준다.
    private  Boolean completed;
    //update 시에 완료여부도 값을 변경할수있기때문에 받아준다.
}