package com.NSCorp.sep20.CURDOperation;

import com.NSCorp.sep20.dTOOperator.CricketDTO;

public class Cricketoperatordto {

	CricketDTO[] cricketdto = new CricketDTO[5];
	int index=0;
	
	public void play(CricketDTO names) {
		if(index<cricketdto.length) {
			cricketdto[index]=names;
			index++;
		}
	}

    public void printAll() {
    	for(int index=0;index<cricketdto.length;index++) {
    		if(cricketdto[index]!=null) {
    		System.out.println(cricketdto[index].printAll());
    		}
    	}
    }
        
     public CricketDTO updatetypebynoofovers(String type,int noofovers) {
    	 CricketDTO dto =null;
    	 for(int index=0;index<cricketdto.length;index++) {
    		 if(type.equals(cricketdto[index].type)) {
    			 cricketdto[index].noofovers=noofovers;
                   dto=cricketdto[index];    		
    		 }
    	 }
              return dto;
     }
    public CricketDTO delete(String teamname) {
    	CricketDTO dto =null;
   	 for(int index=0;index<cricketdto.length;index++) {
   		 if(teamname.equals(cricketdto[index].teamname)) {
   			 cricketdto[index]=null;
                  dto=cricketdto[index];    		
    	
    		}
    	}
    return  dto;
    }
}
