package com.itau.service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itau.itau.domain.Estatistica;
import com.itau.itau.domain.TransacaoDTO;
import com.itau.itau.exception.TransacaoInvalidaException;

@Service
public class StorageTransaction {

    private final List<TransacaoDTO> transacoes= new ArrayList<>();


    public void addTransaction(TransacaoDTO transacao){
        
        if(transacao.valor()<=0)throw new TransacaoInvalidaException("valor menor ou igual a zero");
       transacoes.add(transacao);        
    
    }

    public void removeTransaction(){

        transacoes.clear();  
    }

    public Estatistica getEstatistica() {
        OffsetDateTime agora = OffsetDateTime.now();
        OffsetDateTime limite=agora.with(agora.minusNanos(60));

       //FIltrar transações dos ultimos 60 segundos e um cast de list para TransacaoDTO
       List<TransacaoDTO> transacoesRecentes = (List<TransacaoDTO>) transacoes.stream()
       .filter(t->t.dataHora().isAfter(limite))
       .toList();
       
       //Calcula as estatísticas

        DoubleSummaryStatistics stats =transacoesRecentes.stream()
        .mapToDouble(TransacaoDTO::valor)
        .summaryStatistics();

        return new Estatistica(
        (int)stats.getCount(),
        stats.getSum(),
        stats.getAverage(),
        stats.getMin(),
        stats.getMax()
        );
        
        }


}






















