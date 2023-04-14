package com.ani.data;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ani.data.domain.Invoice;
import com.ani.data.domain.repository.InvoiceRepository;

@SpringBootApplication
public class SpringDataDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataDemoApplication.class, args);

		InvoiceRepository repository = ctx.getBean(InvoiceRepository.class);

		Invoice invoice = new Invoice();
		invoice.setId(2L);
		invoice.setClient("pqr");
		invoice.setAmt(8934.3d);
		invoice.setInvDt(LocalDate.now());

		System.out.println("🟢 Creating New Invoice 🟢");
		repository.save(invoice);
		System.out.println("✅ Invoice Created Successfully");
	}

}
