package _20230607.abstracts;

public class MysqlDao extends Dao{

	@Override
	void add() {
		System.out.println("Mysql 등록");
	}

	@Override
	void modify() {
		System.out.println("Mysql 수정");
	}

	@Override
	void remove() {
		System.out.println("Mysql 삭제");
	}

}
