package com.black.transaction.program;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements I_StuDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private PlatformTransactionManager transactionManater;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManater = transactionManager;
	}
/**
 * 所谓的status是指有sql操作的时候记下的状态
 * 只要database和事物进行了关联那么在没有
 * commit之前所有的sql语句都是不能执行的
 */
	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManater.getTransaction(def);
		try {
//			transactionManater.commit(status);
			String sql1 = "insert into t_stu (name, age) values (?,?)";
			jdbcTemplate.update(sql1, name, age);
//			System.out.println("status="+status.toString());
			String sql3 = "insert into t_marks (sid,marks,year) values (?,?,?)";
			jdbcTemplate.update(sql3, 1, marks, year);
			System.out.println("Created Name=" + name + ",Age=" + age);
		} catch (DataAccessException e) {
			System.out.println("Error in creating record,rolling back");
//			transactionManater.rollback(status);
			throw e;

		}
		return;
	}

	@Override
	public List<StudentMarks> listStudents() {
		String SQL="select * from t_stu s,t_marks m where s.id=m.sid";
		List<StudentMarks> studentMarks = jdbcTemplate.query(SQL, new StudentMarksMapper());
		return studentMarks;
	}

	@Override
	public void init() {
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

}

