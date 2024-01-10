package br.com.gramado.parkingapp.dto;

import br.com.gramado.parkingapp.util.enums.TypePayment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(value = {"id"})
@Getter
@Setter
@AllArgsConstructor
public class ParkingCreateDto extends Dto {

    @NotNull
    @NotBlank
    @Schema(example = "20")
    private Integer vehicleId;

    @NotNull
    @NotBlank
    @Schema(example = "15")
    private Integer priceTableId;

    @Schema(example = "EST-01")
    private String plate;

    @Schema(example = "CREDIT", defaultValue = "Valor prefencial cadastrado em pessoa")
    private TypePayment typePayment;
}
