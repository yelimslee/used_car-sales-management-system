package domain.sale;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import domain.common.Manager;
import domain.employee.Employee;

public class SaleManager implements Manager<Sale> {

	private final List<Sale> sales;

	public SaleManager() {
		sales = new ArrayList();
	}

	@Override
	public void addItem(Sale item) {
		sales.add(item);
	}

	@Override
	public void getList() {
		sales.stream().forEach(System.out::println);
	}

	@Override
	public void getItem(int id) {
		sales.stream().filter(el -> el.getSalesId() == id).forEach(System.out::println);
	}

	@Override
	public void deleteItem(int id) {
		Sale sale = sales.stream().filter(el -> el.getSalesId() == id).findFirst()
				.orElseThrow(() -> new NoSuchElementException("존재하지 않는 Id입니다."));
		sales.remove(sale);
	}

}
