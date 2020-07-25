class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPADE", 1);  // Card(String kind, int number)�� ȣ��
    }

    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        // Card�ν��Ͻ��� kind�� number�� ���ڿ��� ��ȯ�Ѵ�.
        return "kind : " + kind + ", number : " + number;
    }
}

class CardToString2 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 10);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
