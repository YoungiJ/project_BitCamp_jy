package Exception;

public class MyResource implements AutoCloseable {
    private String name;
    
    public MyResource(String name) {
        this.name = name;
        System.out.println(name + " ����");
    }
    
    public String read1() {
        System.out.println(name + " �б�");
        return "100";
    }
    
    public String read2() {
        System.out.println(name + " �б�2");
        return "asd";
    }
    
    @Override
    public void close() throws Exception {
        System.out.println(name + " �ݱ�");
        // �ڿ� ���� �Ǵ� ���� �۾� ����
    }
}
