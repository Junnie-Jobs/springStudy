package next;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping("/customers")
	public Iterable<Customer> findlAllCustomers() {
				
		return customerRepository.findAll();
	}

}
