package com.jordy.backend;

import com.jordy.backend.domain.Order;
import com.jordy.backend.domain.OrderItem;
import com.jordy.backend.domain.Product;
import com.jordy.backend.repositories.*;
import com.jordy.backend.services.ClientService;
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

	@Autowired
	private ClientService clientService;

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	PaymentRepository paymentRepository;

	@Autowired
	OrderItemRepository orderItemRepository;

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

		Client cli1 = clientService.findOne(1);
		Address adr1 = addressRepository.findById(1).get();
		Address adr2 = addressRepository.findById(2).get();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

		Order o1 = new Order(null, sdf.parse("2017/09/30 10:32"), cli1, adr1);
		Order o2 = new Order(null, sdf.parse("2017/10/10 19:35"), cli1, adr2);

		Payment payment1 = new PaymentWithCreditCard(null, StatusPayment.PAID, o1, 6);
		o1.setPayment(payment1);

		Payment payment2 = new PaymentWithBankSlip(null, StatusPayment.PENDING, o2, sdf.parse("2017/10/20 00:00"), null);
		o2.setPayment(payment2);

		cli1.getOrders().addAll(Arrays.asList(o1,o2));

		orderRepository.saveAllAndFlush(Arrays.asList(o1,o2));
		paymentRepository.saveAllAndFlush(Arrays.asList(payment1,payment2));

		Order o1 = orderRepository.findById(1).get();
		Order o2 = orderRepository.findById(2).get();

		Product p1 = productRepository.findById(4).get();
		Product p2 = productRepository.findById(5).get();
		Product p3 = productRepository.findById(6).get();

		OrderItem orderItem1 = new OrderItem(o1, p1, 0.00, 1, 2000.00);
		OrderItem orderItem2 = new OrderItem(o1, p3, 0.00, 2, 80.00);
		OrderItem orderItem3 = new OrderItem(o2, p2, 100.00, 1, 600.00);

		o1.getItens().addAll(Arrays.asList(orderItem1,orderItem2));
		o2.getItens().addAll(Arrays.asList(orderItem3));

		p1.getItens().addAll(Arrays.asList(orderItem1));
		p2.getItens().addAll(Arrays.asList(orderItem3));
		p3.getItens().addAll(Arrays.asList(orderItem2));

		orderItemRepository.saveAllAndFlush(Arrays.asList(orderItem1,orderItem2, orderItem3));
		*/
	}
}
