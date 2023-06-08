package _20230607.abstracts;

public class OracleDao extends Dao {

	@Override
	void add() {
		System.out.println("oracle 등록");
	}

	@Override
	void modify() {
		System.out.println("oracle 수정");	
	}

	@Override
	void remove() {
		System.out.println("oracle 삭제");
	}
	
//	void begin() {	}
//	void end() {	}
//	void register() {	}
//	void modify() {	}
//	void delete() {	}
	
}
