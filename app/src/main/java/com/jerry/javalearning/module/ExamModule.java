package com.jerry.javalearning.module;

import com.jerry.javalearning.R;
import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;
import com.litesuits.orm.db.enums.AssignType;

import java.io.Serializable;
import java.sql.Time;

/**
 * 考试记录表
 * <p>
 * Created by Jerry on 2017/5/5.
 */

@Table("exam_table")
public class ExamModule implements Serializable, BaseItemModule
{
	@PrimaryKey(AssignType.AUTO_INCREMENT)
	public int id;

	@Column("exam_total_time")
	public String totalTime;

	@Column("exam_my_time")
	public String myTime;

	@Column("exam_total_num")
	public int totalNum;

	@Column("exam_correct_num")
	public int correctNum;

	@Column("exam_error_num")
	public int errorNum;

	@Column("exam_undo_num")
	public int undoNum;

	@Column("exam_do_date")
	public String doDate;

	@Override
	public String toString()
	{
		return "ExamModule{" + "id=" + id + ", totalTime='" + totalTime + '\'' + ", myTime='" + myTime + '\'' + ", totalNum=" + totalNum + ", correctNum=" + correctNum + ", errorNum=" + errorNum + ", undoNum=" + undoNum + ", doDate='" + doDate + '\'' + '}';
	}

	@Override
	public int getLayout()
	{
		return R.layout.item_exam_record;
	}
}
