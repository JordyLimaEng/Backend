package com.jordy.backend;

import com.jordy.backend.domain.Address;
import com.jordy.backend.domain.City;
import com.jordy.backend.domain.Client;
import com.jordy.backend.domain.State;
import com.jordy.backend.domain.enums.ClientType;
import com.jordy.backend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*categoryRepository.deleteAll();
		productRepository.deleteAll();

		Category cat1 = new Category(null, "Computers");
		Category cat2 = new Category(null, "Office");

		Product prod1 = new Product(null, "Computer", 200.00);
		Product prod2 = new Product(null, "Printer", 250.00);
		Product prod3 = new Product(null, "Mouse", 20.00);

		cat1.getProducts().addAll(Arrays.asList(prod1, prod2, prod3));
		cat2.getProducts().addAll(Arrays.asList(prod2));

		prod1.getCategories().addAll(Arrays.asList(cat1));
		prod2.getCategories().addAll(Arrays.asList(cat1, cat2));
		prod3.getCategories().addAll(Arrays.asList(cat1));

		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(prod1, prod2, prod3));

		State st1 = new State(null, "Minas Gerais");
		State st2 = new State(null, "São Paulo");

		City ct1 = new City(null, "Uberlândia", st1);
		City ct2 = new City(null, "São Paulo", st2);
		City ct3 = new City(null, "Campinas", st2);

		st1.getCities().addAll(Arrays.asList(ct1));
		st2.getCities().addAll(Arrays.asList(ct2, ct3));

		stateRepository.saveAll(Arrays.asList(st1, st2));
		cityRepository.saveAll(Arrays.asList(ct1, ct2, ct3));

		Client cli1 = new Client(null, "Davi Jeager", "davi@mail.com", "03449123039", ClientType.INDIVIDUAL_PERSON);
		cli1.getPhone().addAll(Arrays.asList("83988843317","8398554012"));

		City ct1 = cityRepository.findById(22).get();
		City ct2 = cityRepository.findById(23).get();

		Address adr1 = new Address(null, "Rua Flores", "300", "Apto 300", "Jardim", "", cli1, ct1);
		Address adr2 = new Address(null, "Rua Flores", "300", "Apto 300", "Jardim", "", cli1, ct2);

		cli1.getAddresses().addAll(Arrays.asList(adr1, adr2));

		clientRepository.saveAndFlush(cli1);
		addressRepository.saveAllAndFlush(Arrays.asList(adr1, adr2));
		 */

	}
}
