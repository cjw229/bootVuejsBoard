package com.nyh.board.util.publicApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "GOOD_STORE")
public class GoodStore {

    @JsonProperty(value = "SH_ID")
    @Id
    private int id;
    @JsonProperty(value = "SH_NAME")
    private String name;
    @JsonProperty(value = "INDUTY_CODE_SE")
    private String indutyCodeSe;
    @JsonProperty(value = "INDUTY_CODE_SE_NAME")
    private String indutyCodeSeName;
    @JsonProperty(value = "SH_ADDR")
    private String addr;
    @JsonProperty(value = "SH_PHONE")
    private String phone;
    @JsonProperty(value = "SH_WAY")
    @Lob
    private String way;
    @JsonProperty(value = "SH_INFO")
    @Lob
    private String info;
    @JsonProperty(value = "SH_PRIDE")
    @Lob
    private String pride;
    @JsonProperty(value = "SH_RCMN")
    private int rcmn;
    @JsonProperty(value = "SH_PHOTO")
    private String photo;
    @JsonProperty(value = "BASE_YM")
    private String baseYm;

    @Override
    public String toString() {
        return "GoodStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", indutyCodeSe='" + indutyCodeSe + '\'' +
                ", indutyCodeSeName='" + indutyCodeSeName + '\'' +
                ", addr='" + addr + '\'' +
                ", phone='" + phone + '\'' +
                ", way='" + way + '\'' +
                ", info='" + info + '\'' +
                ", pride='" + pride + '\'' +
                ", rcmn=" + rcmn +
                ", photo='" + photo + '\'' +
                ", baseYm='" + baseYm + '\'' +
                '}';
    }
}
