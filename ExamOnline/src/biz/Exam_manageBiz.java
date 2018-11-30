package biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.Exam_manageDao;
import entity.ExamPlanInfo;
import entity.Page;
import entity.TeacherInfo;

public interface Exam_manageBiz {
	// ��ҳ��ѯ
	public List<ExamPlanInfo> queryAllByPage(Page page);

	public List<ExamPlanInfo> queryByTeacherId(int teacherId);

	public List<TeacherInfo> queryTeachers();

	// ��ʼ����
	public int startExam(int examplanId);
	//��������
	public int endExam(int examplanId);
}
