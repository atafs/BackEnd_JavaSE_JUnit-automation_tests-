package bo;

import java.sql.SQLException;

import bo.exception.BOException;
import dao.Order;
import dao.OrderDAO;

public class OrderBOImpl implements OrderBO {

	//ATTRIBUTES
	private OrderDAO dao;
	
	//GETTERS ANS SETTERS
	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean placeOrder(Order order) throws BOException {
		try {
			//CREATE
			int result = dao.create(order);
		
			//CHECK NULL VALUE
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		
		return false;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {
		return false;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		return false;
	}

}
