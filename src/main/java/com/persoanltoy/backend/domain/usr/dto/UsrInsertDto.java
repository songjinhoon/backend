package com.persoanltoy.backend.domain.usr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class UsrInsertDto {

    @NotNull @Size(min = 10, max = 25)
    private String id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull @Size(min = 5, max = 20)
    private String pwd;

    @NotNull @Size(min = 5, max = 10)
    private String nm;

}
