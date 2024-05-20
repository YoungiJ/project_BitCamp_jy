package Exception;

public class MyResource implements AutoCloseable {
    private String name;
    
    public MyResource(String name) {
        this.name = name;
        System.out.println(name + " 열기");
    }
    
    public String read1() {
        System.out.println(name + " 읽기");
        return "100";
    }
    
    public String read2() {
        System.out.println(name + " 읽기2");
        return "asd";
    }
    
    @Override
    public void close() throws Exception {
        System.out.println(name + " 닫기");
        // 자원 해제 또는 정리 작업 수행
    }
}
