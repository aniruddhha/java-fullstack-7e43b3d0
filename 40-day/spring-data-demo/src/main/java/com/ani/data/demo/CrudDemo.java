package com.ani.data.demo;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.ani.data.domain.Invoice;
import com.ani.data.domain.repository.InvoiceRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class CrudDemo {
    
    private final InvoiceRepository repository;

    public void demo1() {
        Invoice invoice1 = new Invoice();
		invoice1.setId(2L);
		invoice1.setClient("pqr");
		invoice1.setAmt(8934.3d);
		invoice1.setInvDt(LocalDate.now());

		System.out.println("🟢 Creating New Invoice 🟢");
		Invoice saved = repository.save(invoice1); // 👈 Create
        System.out.println(saved);
		System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");

		System.out.println("🟢 Reading All Invoices 🟢");
		Iterable<Invoice> invoices = repository.findAll(); // 👈 Read All
		invoices.forEach( inv -> System.out.println(inv));
		System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");

		System.out.println("🟢 Reading Single Invoive 🟢");
		Optional<Invoice> opInv1 = repository.findById(2L); // 👈 Read Single
		Invoice inv2 = opInv1.orElseThrow(() -> new RuntimeException("❌ Invlaid Id"));
		System.out.println(inv2);
		System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");

		System.out.println("🟢 Updating Invoive 🟢");
		Invoice invoice3 = new Invoice();
		invoice3.setId(2L);
		invoice3.setClient("ddd");
		invoice3.setAmt(1234.456d);
		invoice3.setInvDt(LocalDate.of(2022, 01, 30));
		repository.save(invoice3); // 👈 Update
		System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");

        System.out.println("🟢 Deleting Invoive 🟢");
        repository.deleteById(2L);
        repository.findAll().forEach(inv -> System.out.println(inv));
        System.out.println("🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉🎉");
    }
}
