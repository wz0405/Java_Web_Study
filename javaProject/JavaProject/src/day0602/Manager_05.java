package day0602;

//�ڽ�Ŭ���� 
public class Manager_05 extends Employee_05 {
    String depart;

    public Manager_05(String name, int salary, String depart) {
        super(name, salary);
        this.depart = depart;
        // TODO Auto-generated constructor stub
    }

    //�θ��� �޼��带 �����޾� �ڽ�Ŭ�������� �ϼ�....�������̵�
    @Override
    public String getEmployee() {
        // TODO Auto-generated method stub
        return super.getEmployee() + "," + depart;
    }

}
