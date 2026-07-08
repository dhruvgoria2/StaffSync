package com.dhruvgoria006.gmail.dto;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmployeeDTO {
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    @JsonProperty("isActive")
    private boolean isActive;

    public EmployeeDTO(){

    }

    public EmployeeDTO(Long id, String name, LocalDate dateOfJoining, boolean isActive) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

}
