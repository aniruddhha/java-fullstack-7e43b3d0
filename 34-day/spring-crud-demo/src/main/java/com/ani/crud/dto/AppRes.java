package com.ani.crud.dto;

import javax.annotation.Generated;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Builder
public class AppRes {
    private String sts;
    private String msg;
}
