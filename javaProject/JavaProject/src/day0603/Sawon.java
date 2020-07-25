package day0603;

public class Sawon {
    Sawon() {
    }

    private String sawonName;
    private int giboPay, timeSu, familysu;

    //������
    public Sawon(String sawonName, int giboPay, int timeSu, int familysu) {
        this.sawonName = sawonName;
        this.giboPay = giboPay;
        this.timeSu = timeSu;
        this.familysu = familysu;

    }

    //��������...3�ι̸��� 5����, �̻��� 7����
    public int getFamSu() {
        if (familysu < 3) {
            return 50000;
        } else {
            return 70000;
        }
    }

    //�ʰ������� �ʰ� �ð� *20000�� ��,5�ð��̻��� ������ 100000��
    public int getTimeSu() {
        if (timeSu >= 5) {
            return 100000;
        } else {
            return timeSu * 20000;
        }
    }

    public int getTotalPay() {
        return giboPay + getFamSu() + getTimeSu();
    }

    public void getSawon() {
        System.out.println(sawonName + "\t" + giboPay + "\t" + getFamSu() + "\t" + getTimeSu() + "\t" + getTotalPay());
    }
}
