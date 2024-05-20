package Exception;

public interface AutoClosable {
	//상수필드
	
	void close() throws Exception;//여기에도 throw를 붙여야함
	//왜 override를 할 수 있을까

}
