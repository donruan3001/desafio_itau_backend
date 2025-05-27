package com.itau.itau.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itau.itau.domain.Estatistica;
import com.itau.itau.domain.TransacaoDTO;
import com.itau.itau.service.StorageTransaction;

@RestController
public class TransactionController {
    @Autowired
    private StorageTransaction storageTransaction;

   

@PostMapping("/transacao")
    public ResponseEntity<TransacaoDTO>  createTransaction(@RequestBody TransacaoDTO transacao) {
      
        storageTransaction.addTransaction(transacao);
        return ResponseEntity.created(null).build();
    }
@GetMapping("/estatistica")
public ResponseEntity<Estatistica> getEstatistica() {
    Estatistica estatistica = storageTransaction.getEstatistica();
    return ResponseEntity.ok(estatistica);
}

@DeleteMapping("/transacao")
    public ResponseEntity deleteTransactions(){
        storageTransaction.removeTransaction();
        return ResponseEntity.ok().build();

    }

}
