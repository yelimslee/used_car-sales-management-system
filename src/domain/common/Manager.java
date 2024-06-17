package domain.common;

import java.util.Optional;

public interface Manager<T> {

	public void addItem(T item);

	public void getList();

	public Optional<T> getItem(int id);

	public void deleteItem(int id);

}
