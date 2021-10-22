package br.com.cod3r.singleton.connectionPool.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	// Criando uma única instância da classe
	private final static ConnectionPool instance = new ConnectionPool();

	private final static int POOL_SIZE = 2;
	private List<Connection> connectionsPool;

	public static ConnectionPool getInstance(){
		return instance;
	}
	
	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<Connection>();
		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
	}
	
	public Connection getConnection() {
		Connection avaiable = null;
		for(Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				avaiable = conn;
				break;
			}
		}
		if(avaiable == null) {
			System.out.println("No Connections avaiable");
			return null;
		}
		avaiable.setInUse(true);
		return avaiable;
	}
	
	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
