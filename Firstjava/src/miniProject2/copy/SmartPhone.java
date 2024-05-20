package miniProject2.copy;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.sun.javadoc.ThrowsTag;

import miniProject2.ClientAddr;
import miniProject2.CompanyAddr;
import miniProject2.DuplicateException;




public class SmartPhone {
	
	String companyName;
	String departName;
	String position;
	String clientName;
	String tradingItem;
	int counter=0;
	
	Addr[] ad=new Addr[10];
	Scanner sc=new Scanner(System.in);
	

    public void inputAddrData() {
    	try {
    		Addr addr=inputAddrRealData();
    		{}
			
		} catch (InputException e) {
			// TODO: handle exception
			
		}
    	
    	
    	
    }
	//2.¿¬¶ôÃ³ ÀÌ¸§ ÀÔ·Â½Ã¿¡ °ø¹é¿¡ ´ëÇÑ ¿¹¿ÜÃ³¸®
	//3.¿µ¾î¿Í ÇÑ±Û¸¸ Çã¿ëÇÏ´Â ¿¹¿ÜÃ³¸®
  	public boolean checkName(String name) {
		
	 	if(name.length()!=name.trim().length()|| !((byte)name.length()==2||(byte)name.length()==3)) {
        	throw new InputException("inputException.");
        }
		if(!name.matches("[a-zA-Z°¡-ÆR]+")) {
        	throw new InputException("inputException.");
	    }
		
	}
  //4.ÀüÈ­¹øÈ£ Çü½Ä¿¡ ¸ÂÁö ¾ÊÀ»¶§¿¡ ´ëÇÑ ¿¹¿ÜÃ³¸®
  //5.ÀüÈ­¹øÈ£°¡ Áßº¹Ã³¸® µÉ¶§ ¿¹¿ÜÃ³¸®
  	public boolean checkphoneNum(String phoneNum) {
		String regex = "010-\\d{4}-\\d{4}";
		boolean isMatch=Pattern.matches(regex,phoneNum);

  		if(!isMatch) {
  			throw new InputException("inputException.");
  		}
  		for(Addr addr:ad) {
  			if(!phoneNum.equals(addr.getPhoneNum())){
  	  			throw new InputException("inputException.");
  	  		}
  		}
		
  		
  	}
	
    //1.¸Þ´º ÀÔ·Â½Ã ¹ß»ýÇÒ ¼ö ÀÖ´Â ¿¹¿Ü
    public Addr inputAddrRealData() {
    	try {
    		
    		
    	System.out.print("ÀÌ¸§: ");
        String name = sc.nextLine();
        checkName(name);
       
        System.out.print("ÀüÈ­¹øÈ£: ");
        String phoneNum = sc.nextLine();
        checkphoneNum(phoneNum);
        System.out.print("ÀÌ¸ÞÀÏ: ");
        String email = sc.nextLine();

        System.out.print("ÁÖ¼Ò: ");
        String address = sc.nextLine();

        System.out.print("±×·ì(company/client Áß ¼±ÅÃ): ");
        String groupChoice = sc.nextLine();

        if (groupChoice.equals("company")) {
            System.out.print("È¸»ç ÀÌ¸§: ");
            String companyName = sc.nextLine();

            System.out.print("ºÎ¼­ ÀÌ¸§: ");
            String departName = sc.nextLine();

            System.out.print("Á÷¹«: ");
            String position = sc.nextLine();
            return new Addr(name, phoneNum, email, address, groupChoice, companyName, departName, position);


        } else if (groupChoice.equals("client")) {
            System.out.print("°í°´ ÀÌ¸§: ");
            String clientName = sc.nextLine();

            System.out.print("»óÇ° Ç°¸ñ: ");
            String tradingItem = sc.nextLine();

            System.out.print("Á÷¹«: ");
            String position2 = sc.nextLine();
            return new Addr(name, phoneNum, email, address, groupChoice, clientName, tradingItem, position2);


        } else {
            System.out.println("Àß¸øµÈ ±×·ìÀ» ¼±ÅÃÇÏ¼Ì½À´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
        }
        
		}catch (Exception e) {
			// TODO: handle exception
			throw new InputException(" ÀÔ·Â½Ã ¹ß»ýÇÒ ¼ö ÀÖ´Â ¿¹¿Ü.");

		}
    	
    	
    }
	  


		
	//2.¹è¿­¿¡ ¿¬¶ôÃ³ °´Ã¼ ÀúÀå
	void addAddr(Addr newAddr) {
		//ÀÔ·Â¹Þ±â
		ad[counter]=newAddr;
		counter++;
	}
  // 3. ¿¬¶ôÃ³ Ãâ·Â
    void printAddr(Addr addr) {
        System.out.println(addr.getName());
        System.out.println(addr.getPhoneNum());
        System.out.println(addr.getEmail());
        System.out.println(addr.getAddress());
        System.out.println(addr.getGroup());
    }

	//3.¿¬¶ôÃ³ Ãâ·Â
	public void printContact() {
	    System.out.print("Ã£´Â ÀÌ¸§: ");
	    String name = sc.next();
	    
	    Addr newAddr = searchAddr(name);

	    if (newAddr != null) {
	        newAddr.showData();
	    } else {
	        System.out.println("ÁÖ¼Ò·Ï¿¡¼­ '" + name + "'¿¡ ÇØ´çÇÏ´Â Á¤º¸¸¦ Ã£À» ¼ö ¾ø½À´Ï´Ù.");
	    }
	}


	//4.¸ðµç ¿¬¶ôÃ³ Ãâ·Â
		public void printAllAddr() {
			for (int i = 0; i < counter;i++) {
				if(ad[i]!=null) {
				ad[i].showData();}
			}
		}
		

	//5.°Ë»ö
	public Addr searchAddr(String name) {
		int i=0;
		while(true){//true·Î ÇØµµ µÇÁö¸¸ -> count¸¦ ½áµµ µÊ!!!
			if(ad[i]==null) {break;}
			if(ad[i].getName().equals(name)) {
				//adÀÇ ÀÌ¸§À» °¡Áø ¹è¿­ ad[i]
				System.out.println("ÇØ´ç Á¤º¸¸¦ Ã£À½");
//				ad[i].showData();
				
			}i++;
		}
		return ad[i] ;
	}
	
	//6. »èÁ¦
		public void deleteAddr(String name) {
		for(int i=0;i<counter;i++) {
			
			if(ad[i].getName().equals(name)) {
				for(int j=0;i<counter;j++) {
					ad[j]=ad[j+1];
				}
				//´Ù ¿Å°åÀ¸´Ï±î ´ÙÀ½ ÀÔ·Â¹Þ¾Æ¾ßÇÒ ÀÎµ¦½º¸¦ -1 ÇØÁÖ¸é ¹è¿­ Å©±â Á¶Á¤¿Ï
				counter--;
				return;
			}
		}
		
		
	}

	//7.¼öÁ¤
	void editArr(String name,Addr newAddr) {
		int i=0;
		while(true){
			if(ad[i]==null) {break;}
			if(ad[i].getName().equals(name)) {
				ad[i]=newAddr;

			}i++;
		}

	}

	}}
	
	


	



