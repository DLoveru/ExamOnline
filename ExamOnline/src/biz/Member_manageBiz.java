package biz;

import java.util.List;

import entity.ClassInfo;
import entity.ExamByClassMap;
import entity.ExamPlanInfo;
import entity.Page;

public interface Member_manageBiz {

	// ��ѯ���п��԰���
	public List<ExamByClassMap> queryAll(Page page);

	// ��ѯ�༶
	public List<ClassInfo> queryClass();

	// ͨ����ʦ��ѯ����
	public List<ExamByClassMap> queryByClassId(int classId);

}
