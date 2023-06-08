package _20230607.abstracts;

public class jdbcExe {
	public static void main(String[] args) {
		Dao dao = new MysqlDao();
//		OracleDao odao = new OracleDao(); //<- 상속이 아닌 경우 할당부터 사용까지 전부 다 고쳐야 함
		dao = new OracleDao(); //<- 상속인 경우 할당만 하면됨
		
		dao.start(); //->odao.begin
		dao.add(); //->odao.register
		dao.modify();
		dao.remove();//->odao.delete
		dao.stop();//->odao.end
		
	}
}
