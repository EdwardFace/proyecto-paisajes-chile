package com.edward.paisajesApi.model;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@Document("paisajes")
public class PaidLandSpace extends GeneralLandSpace implements Serializable {
    @Id
    private int id;
    private String horarioVisita;
    private long precioEntrada;
}
