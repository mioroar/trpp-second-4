package ru.mirea.trppsecond4.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** Сущность сотрудника. */
@Getter
@Setter
@ToString
public class Organization {


    @JsonProperty("id")
    @CsvBindByName(column = "id")
    private Long id;

    @JsonProperty("name")
    @CsvBindByName(column = "name")
    private String name;

    @JsonProperty("email")
    @CsvBindByName(column = "email")
    private String email;

    @JsonProperty("address")
    @CsvBindByName(column = "address")
    private String address;

    @JsonProperty("phone")
    @CsvBindByName(column = "phone")
    private String phone;
}
