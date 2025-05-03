package com.itau.itau.domain;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

public record TransacaoDTO(

@NotNull
@Positive
int  valor,

@NotNull
@PastOrPresent
OffsetDateTime dataHora) {


}