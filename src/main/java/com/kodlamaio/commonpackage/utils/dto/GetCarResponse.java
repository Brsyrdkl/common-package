package com.kodlamaio.commonpackage.utils.dto;

import com.kodlamaio.commonpackage.utils.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetCarResponse {
    private UUID id;
    private UUID modelId;
    private int modelYear;
    private String plate;
    private State state;
    private String modelName;
    private String modelBrandName;
    private double dailyPrice;
}
