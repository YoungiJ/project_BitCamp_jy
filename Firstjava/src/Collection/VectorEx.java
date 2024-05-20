//package Collection;
//
//import java.util.List;
//import java.util.Vector;
//
//public class VectorEx {
//	public static void main(String[] args) {
//
//	List<Board> list=new Vector();
//	
//	//Thread-> �����带 �����ؼ� map�� ���� �������
//	Thread th1=new Thread() {
//		@Override
//		public void run() {
//			for(int i=0;i<10;i++) {
//				list.add(new Board("����"+i,"����"+i,"�۾���"+i));
//				
//			}
//		}
//		
//		
//	};
//	//Thread-> �����带 �����ؼ� map�� ���� �������
//	Thread th2=new Thread() {
//		@Override
//		public void run() {
//			for(int i=0;i<20;i++) {
//				list.add(new Board("����"+i,"����"+i,"�۾���"+i));
//				
//			}
//		}
//		
//		
//	};
//	
//	th1.start();
//	th2.start()
//	
//	try {
//		th1.join();
//		th2.join();
//	}catch (Exception e) {
//		// TODO: handle exception
//	}
//	
//	int size=list.size();
//	System.out.println(size);
//}}
