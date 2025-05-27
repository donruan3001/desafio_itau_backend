package com.itau.itau.domain;

import java.time.OffsetDateTime;




public class Transacao {

private boolean valor;
private OffsetDateTime dataHora;

public boolean getValor() {
    return valor;
}
public void setValor(boolean valor) {
    this.valor = valor;
}    
public OffsetDateTime getDataHora() {
    return dataHora;
}
public void setDataHora(OffsetDateTime dataHora) {
    this.dataHora = dataHora;
}
public Transacao(boolean valor, OffsetDateTime dataHora) {
    this.valor = valor;
    this.dataHora = dataHora;
}




}