package biz;


public interface StudentStateBiz {
	// ����ѧ������״̬
	public int addState(int paperId, int studentId, int studentState);

	// ��ѯѧ������״̬
	public int queryState(int paperId, int studentId);
}
