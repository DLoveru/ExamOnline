package biz;

import java.util.List;

import entity.ExamPlanInfo;
import entity.TeacherInfo;

public interface Exam_summaryBiz {
	// ��ѯ���п���
	public List<ExamPlanInfo> queryAll();

	// ��ѯ������ʦ
	public List<TeacherInfo> queryTeachers();

	// ������ʦ������ѯ��ؿ��԰���
	public List<ExamPlanInfo> queryByTeacherId(int teacherId);
}
