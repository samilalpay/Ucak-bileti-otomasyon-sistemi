package com.samilemir.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CheckIn extends BaseEntity {
	
	
	private String pnrCode;
	

	private String lastName;
	
	
    private boolean checkedIn;

}
